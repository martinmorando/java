# Notes, Code, and Experiments with Java


## Motivations for Learning Java
- **Platform Independent**: Java programs run on any device, thanks to the Java Virtual Machine (JVM). 
- **Build Android Apps**: Java is the primary language for developing Android apps.


## Running Java Programs
1. **Compile**: use the command `javac file.java` to compile the Java source code. This generates a file named `file.class`, which contains the bytecode. For dependent files, compile them together running `javac file1.java file2.java`.
2. **Run**: execute the program with the command `java mainclass` (the name of the file containing the `main` method, whithout including the `.class` extension). The JVM interprets and runs the bytecode.