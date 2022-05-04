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

<br>

A debug profile for visual studio should already exist within this project. By default this application searches the **Testing Files** in the base Marlowe direcotry  for _Test*.cs_. files if for some reason the debug profile doesn't exist then this system can executed with the following command:

```cli
        -d  "C:\Libraries\..\..\Marlowe\Testing Files"
                or specific call to a file using
        -f "C:\Libraries\..\..\Marlowe\Testing Files\Test.cs" 
```

<br>

This then calls the **Interpeter Engine** to discover and entry point into this code. for the C# programming language entry points should be specified as:

```c#
    public static void Main(string args){}
```

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

### What can Marlowe do?
Discussed in the paper itself Marlowe is only a mini implementation of the C# programming languge; it is capable of:
- performing all matamatical operations i.e +,- , /, *. %
- performing all logical operations (==, !=, >=, <=), however the parser seems to struggle with > and < sometimes.
- Creating classes in namespaces. 
- Classes can have  method and properties.
- methods can return values and accept paramaters
- classes, variables and methods are all **static** regardless of using the keyword
- This is limited by the use of using directives and namespaces.
- make use of console.writeline method to output information to the screen.
- generate a Symbol Table calling all the variables and their values at the end of the execution.
- create a collection of dynamic objects out of classes stored by the Interpeter Engine.

### What Marlowe cannot do
Unfortunately as the C# programming language is so large it was difficult to make time to implement every feature and some particular features ended up with more focus than others; because of this, Marlowe can **not**:
- make use of switches.
- store collections of objects.
- make use of for loops.
- use while loops - However they are implemented. It is down to a problem of the logic itself that prevents.
- make use of the *this* keyword to call objects.
- capabl of lambda expressions
- make refernence to external libraries that do not exist within a called directory.
- make use of try and catches although it does not require this as the error handling catch any issues that could occur.