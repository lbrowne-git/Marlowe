using CommandLine;
using Marlowe.Logger;

namespace Marlowe
{


    public abstract class CommandHandler : CommandObjectHandler
    {

        public static void ParseArguments(string[] args)
        {
            Parser.Default.ParseArguments<Options>(args)
                   .WithParsed<Options>(o =>
                   {
                       // Logging
                       Timer.Start();
                       if (o.Loggable && o.Writeable)
                       {
                           Level = Options.LogHandler();
                           Logger = new ConsoleAndWriteLogger(Level);
                       }
                       else if (o.Writeable || o.Loggable)
                       {
                           if (o.Loggable)
                           {
                               Logger = new ConsoleLogger(Options.LogHandler());
                           }
                           else
                           {

                               if (o.WriteDir != null)
                               {
                                   Logger = new WriteLogger(Options.LogHandler(), o.WriteDir);
                               }
                           }
                       }
                       // Symbol Table
                       if (o.SymbolTable)
                       {
                           ShowSymbolTable = o.SymbolTable;
                       }

                       // File Handling
                       if (o.File != null || o.Directory != null)
                       {
                           if (o.File != null)
                           {
                               Files.Add(o.File);
                           }
                           else
                           {
                               Files = DirectoryHandler.GatherFileInformation(o.Directory, o.SubDirectory);
                               if (Logger != null)
                               {
                                   Logger.WriteContent("Directory Handler has found " + Files.Count + " files", ILogger.Levels.Info);
                               }
                           }
                       }
                       else if (o.Directory != null)
                       {

                       }

                   });

        }

        /// <summary>
        ///     Leverages <see cref="CommandLine.OptionAttribute"/> annotations to provide <see cref="CommandHandler"/> with CLI options.
        /// </summary>
        private partial class Options
        {
            [Option('f', "file", Required = false, HelpText = "The name of the file that will be interpeted.")]
            public string File { get; set; }

            [Option('d', "directory", Required = false, HelpText = "The directory that will be interpreted. Requires a file to have a main as an entry point.")]
            public string Directory { get; set; }

            [Option('s', "subd", Required = false, HelpText = "Toggle sub directory reading")]
            public bool SubDirectory { get; set; } = true;

            [Option('s', "st", Required = false, HelpText = "Will output a symbol table instead of actually executing any code, can be used to view the contents of a class.")]
            public bool SymbolTable { get; set; }

            [Option('l', "log", Required = false, HelpText = "Toggleable logger, accepts true or false. This is on by default.")]
            public bool Loggable { get; set; }

            [Option('w', "write", Required = false, HelpText = "Toggleable writer, accepts true or false and writes to a .txt within Marlowe.")]
            public bool Writeable { get; set; }

            [Option("wdir", Required = false, HelpText = "Custom write location accepts a directory to create a txt file.")]
            public string WriteDir { get; set; }

            [Option("loglevel", Required = false, HelpText = "Allows for verbose or minimalistic log details accepts: \nInfo = 0,\nNotice = 1,\nWarring = 2,\nError = 3 (default)")]
            public static string LogLevel { get; set; }

            public static ILogger.Levels LogHandler()
            {
                try
                {
                    if (LogLevel != null)
                    {
                        switch (LogLevel.ToUpper())
                        {
                            case "INFO":
                            case "0":
                                return ILogger.Levels.Info;
                            case "NOTICE":
                            case "1":
                                return ILogger.Levels.Notice;
                            case "WARNING":
                            case "2":
                                return ILogger.Levels.Warning;
                            case "ERROR":
                            case "3":
                                return ILogger.Levels.Error;

                            default:    // This when a logging level is not specified.
                                return ILogger.Levels.Error;
                        }
                    }
                    else
                    {
                        return Level;
                    }
                }
                catch
                {
                    return Level;
                }
            }
        }
    }
}
