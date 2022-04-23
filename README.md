# Marlowe - A C# Interpeter
Marlowe, is a language processing system that handles the analysis phases of the compliation process. The accompanying project solution makes use of the *ANTLR4* generator tool, which can be seen in _grammar_ as **jar** file. Which, by making use of the .g4 grammar files, allows for the generation of the *CSharpVisitor*, *CSharpParser* & *CSharpLexer* base files that are extended by this solution through many different projects.

<br>

## Setup
As this is a C# project much of the setup to external dependencies is handled on build time. The project comes with a suite of different files that can be used to test the functionality of this application.

The ANTLR generator is not required for this application to work. However it can be ran by using the below command:
``` powershell
    java -jar antlr.jar -Dlanguage=CSharp CSharpParser.g4 -no-listener -visitor
```
Where *-Dlanguage* could be substitued with a different language to get an output of the grammar to that respective programming language.

<br>

### Entrypoint 
As this solution has many different projects that will be discussed in this file, the entry point into this application is  *program.cs* present in the **Marlowe** project solution. This handles the different cli commands passed to it through the executable, a debug profile has been created for *Visual Studio 2019, 2022*, which calls the **dummy.cs** file also present in the Marlowe solution. This application is capable of doing much more than this and its CLI commands are as follows:
``` cli
  -f, --file     The name of the file that will be interpeted.

  -d, --dir      The directory that will interpetated. Requires a file to have a main as an entry point

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