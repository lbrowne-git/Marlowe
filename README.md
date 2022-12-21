# Marlowe - A C# Interpeter (pretty much)
This application as well as the accompanying NuGet package act as an Interpeter Engine for C# source code. It is able to:
* Parse any given directory of C# files and their subdirectories; then perform snytax and semantic analysis of said source code.
* Make use of a complex error handler and logging system to continue the execution of code after any non fatal error. As well as providing an optional detailed log of these events.
* Execute C# source code insofar as:
    - Locating a defined entrypoint and interpreting the code Line for Line. 
    - Storing class definitions and their attributes. Which allows for both the calling of methods as well as modifications to variables of a defined class.
    - Handling logical expressions and conditional statements.
    - Namspacing and references to local namespaces to allow for the calling classes within them.
* Generate Dynamic classes out of analysed code.
* Provide a modular and well documented code library which could be extended to create a Static Analysis Tool.

<br>

_Marlowe was built by making use of the *[ANTLR4](https://www.antlr.org/)* generator tool which handles the parsing and lexical analysis of this application._

<br>

## Setup
This application was intentionally built to be cross-platform as such to use the only requirement is any version of the [.NET 6.0 SDK](https://dotnet.microsoft.com/en-us/download/dotnet/6.0) as it is the current LTSC branch for .NET applications.

<br>

# How To Use 
If you are running this code on VS you should be able to access the defined profile that have been created for quick launching of the application. Marlowe has a lot of commands available through its Command Line Interface how this will focus more on using Marlowe as soon as possible.

```cli
--log --directory "Your\C#\Directory"
```
<br>

Alternatively you are looking to execute a sole file within a directory you can do very easily with

```cli
--write --file "Your\C#\Directory\File.cs"
```
<br>
You are also able of displaying the Symbol Table which would provide one with the attributes of the classes or files that have been analysed.

```cli
--log --write --st
```
<br>

_*Note:* as can been seen throughout these examples a different logging method is used by each function one can even change the location of where the log file is saved with_

Marlowe looks for conventional C# entry points( ```public static void Main(string[] args)``` ) as its entry point but can still output a symbol table 


# Package Setup
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

# What can Marlowe do?
As previously mentioned Marlowe is not only an executeable application but a package library. This is however only a miniminal implementation of the C# programming languge, currently it is able to:
* Execute C# source code by specify a directory.
* Display a Symbol Table of class details.
* Offers a complex and verbose logging system.
* Store Variable and Method in a Symbol Table and then:
    - Modify these variables as they are being  referenced within in the source code.
    - Execute methods as they are being referenced within the source code
    - Create Dynamic objects out of these classes.
* Perform all mathematical operations. (+,- , /, *. %)
* Perform all logical operations.     (==, !=, >=, <=)
* Handle conditional expressions.
* Handle referencing to multiple local namespaces.
* Capable of handling System library references.


# What Marlowe cannot do
Unfortunately as the C# programming language is so large it was difficult to make time to implement every feature and some particular features ended up with more focus than others; because of this, Marlowe can **not**:

_i hope to get the time to work on this more in the coming year my time has been taken up by a lot of personal projects!_

* Handle any object declaration relating to arrays or any collections types.
* Handle complex conditional expressions (switches, for, for each) 
* Make use of the *this* keyword to call objects.
* Capable of executing LINQ or Lambda expressions. 
* Navigate Error Flow Control (try, catch, finally)
    - The persistent error catcher should allow for continuous running however.
* Build using the XML of _.csproj_ and _sln_ files.
* This subsequently means that Marlowe is not capable of managing dependencies.