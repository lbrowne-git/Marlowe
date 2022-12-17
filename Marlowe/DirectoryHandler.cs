using System.Collections.Generic;
using System.IO;

namespace Marlowe
{

    /// <summary>
    ///    A directory handler that discovers C# files in a given directory. It's only current use is the <see cref="GatherFileInformation(string, bool)"/> function.
    /// </summary>
    public static class DirectoryHandler
    {
        private readonly static List<string> FileInformation = new List<string>();

        /// <summary>
        ///     Searches a given directory for C# files and returns a list of absolute directories to these files.
        ///     It is predominately used in this application by the <see cref="Interpeter"/>.
        /// </summary>
        /// <param name="path">Directory to files to be read.</param>
        /// <param name="checkSubDirectories">Toggleable sub directory search</param>
        /// <returns>A list of directories for C# files.</returns>
        public static List<string> GatherFileInformation(string path, bool checkSubDirectories = true)
        {
            if(checkSubDirectories)
            {
                GatherInformationAboutSubDirectories(path);
            }

            return FileInformation;
        }

        //recursively searches file directories for subdirectories and then adds files to list.
        private static void GatherInformationAboutSubDirectories(string path)
        {
            if (Directory.GetDirectories(path).Length > 0)
            {
                foreach (string directory in Directory.GetDirectories(path))
                {
                    GatherInformationAboutSubDirectories(directory);
                }
            }
            GatherInformationAboutFilesInFolder(path);
            
        }

        private static void GatherInformationAboutFilesInFolder(string path)
        {

            foreach (string file in Directory.GetFiles(path, "*.cs"))
            {
                if (File.Exists(file))
                {
                    FileInformation.Add(file);
                }
            }
        }
    }
}
