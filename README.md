
JDK :
Java Development Kit
It is used to develop and run java applications
It includes JRE, a compiler, an interpreter and some more tools used to develop java applications.

JRE:
Java Runtime Environment
When we are done with developing our java applications, we need an environment to run it.
JRE provides that environment.
It includes JVM, core classes and supporting files.

JVM:
When JRE runs any java programs, it goes to JVM where it reads the code line-by-line.
Hence it is also called interpreter.

![image](https://user-images.githubusercontent.com/18313341/217284418-f0d48b99-1ba8-44ab-8a52-4ad4ede96e9c.png)

Daemon Thread: Daemon thread in Java is a low-priority thread that runs in the background to perform some tasks such as garbage collection.

Garbage Collector: 
It is a background process that runs and looks at heap memory, identifying which objects are in use and which are not, and deleting the unused objects to free the heap memory and to avoid outOfMemoryError.
The garbage collector is the best example of the Daemon thread as it is always running in the background.
We can call Garbage Collector manually by System.gc()
