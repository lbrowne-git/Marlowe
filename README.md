# Marlowe - A C# Interpeter
Marlowe is a language processing system that allows for the interpetation of _.cs_ files. From there it is able construct Symbol Tables or generate a collection of dynamic classes from this content.

<br>

 The accompanying project solution makes use of the *ANTLR4* generator tool, which can be seen in _grammar_ as a **jar** file. Which, by making use of the *.g4* grammar files, allows for the generation of the *CSharpParser* , *CSharpLexer* & *CSharpParserVisitor* base files that are extended by this solution.

<br>

## Setup
As this is a C# project much of the setup to external dependencies is handled on build time. The project comes with a suite of different files that can be used to test the functionality of this application.

<br>

### Entrypoint 
The entrypoint on runtime for this application is the **Program.cs** file which handles the CLI interaction with Marlowe. The CLI commands that this application is capable of are as follows:
``` powershell
  -f, --file     The name of the file that will be interpeted. Required, otherwise see --dir .

  -d, --dir      The directory that will interpetated. Required, otherwise see --file .

  -s, --st       Will output a symbol table instead of actually executing any code, can be used to view the contents of
                 a class

  -l, --Log      Toggleable logger, accepts true or false

  -w, --Write    Toggleable writer, accepts true or false and writes to a .txt within Marlowe

  --LogLevel     Allows for verbose or minimalistic log details accepts:
                 Info = 0,
                 Notice = 1,
                 Warring = 2,
                 Error = 3

  --help         Display this help screen.

  --version      Display version information.
```

A debug profile for visual studio should already exist within this project. By default this application searches the build directory for _Tester*.cs_ files and then calls **ExecuteAnalysis()** which performs the initial run of HLL source files and then populates a collection of *SymbolTable*s. This collection is then passed to the **Interpeter Engine** (*Interpeter.cs*), which can perform a variety of different tasks.

<br>


### Package Setup
As well as being a standalone application Marlowe is also a package library; which can be extended by other applications to interpet C# source code. A package should exist in the root of this project directory that can be added to another C# application. However should there be issues with getting this working the latest version of this package can be downloaded at the [public repository](https://github.com/lbrowne-git/Marlowe).


An additional project solution exists within Marlowe that shows how this package can be called but using the library looks something like this:

``` CSharp
    {
        // source file or directory handler
        List<string> sourceFiles = new List<string>();
        string directory = Path.GetFullPath(AppDomain.CurrentDomain.BaseDirectory);
        foreach (string file in Directory.GetFiles(directory, "*.cs"))
        {
            sourceFiles.Add(file);
        }

        Interpeter interpeter = new Interpeter(sourceFiles, new ConsoleLogger());
        interpeter.Execute();
    }

```

The ANTLR generator is not required for this application to work. However it can be ran by using the below command:
``` powershell
    java -jar antlr.jar -Dlanguage=CSharp CSharpParser.g4 -no-listener -visitor
```
Where *-Dlanguage* could be substitued with a different language to get an output of the grammar to that respective programming language.
