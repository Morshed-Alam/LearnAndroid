package com.learn.android;

import java.util.ArrayList;
import java.util.Arrays;

public class Data
{
	private static String[] datasetAndroid1 = {
		"Home", "Android Introduction", "Android Overview", 
		"Environment Setup", "Android Architecture", "Application Components",
		"Resources Organizing and Accessing", "Activities", "Services",
		"Broadcast receivers", "Content Providers", "Fragments", 
		"Intents and Filters", "Styles and Themes", "Custom Components",
		"UI Layouts", "UI Controls", "Event Handling", "Drag and Drop",
		"Notifications", "Location Based Services", "Sending Email",
		"Sending SMS", "Phone Calls", "Publishing Android Application" 
	};

	private static String[] datasetAndroid2 = {
		"Android is a mobile operating system developed by Google, based " +
		"on the Linux kernel and designed primarily for touchscreen mobile " +
		"devices such as smartphones and tablets. Android's user interface is " +
		"mainly based on direct manipulation,",

		"Android provides a rich application framework that allows you to build " +
		"innovative apps and games for mobile devices in a Java language environment.",

		"Android was built from the ground-up to enable developers to create compelling " +
		"mobile applications that take full advantage of all a handset has to offer. It " +
		"was built to be truly open. For example, an application can call upon any of the " +
		"phone’s core functionality such as making calls, sending text messages, or using the camera, ",

		"Following is the list of software's you will need before you start your Android " +
		"application programming.\n\nJava JDK5 or later version\n\nAndroid SDK\n\nJava Runtime " +
		"Environment (JRE) 6\n\nAndroid Studio\n\nEclipse IDE for Java Developers (optional)\n\nAndroid " +
		"Development Tools (ADT) Eclipse Plug-in (optional)",

		"Android is implemented in the form of a software stack architecture " +
		"consisting of a Linux kernel, a runtime environment and corresponding libraries, " +
		"an application framework and a set of applications. Applications are predominantly " +
		"written in Java and run within individual instances of the Dalvik virtual machine.",

		"The Manifest File. Before the Android system can start an app component, the system " +
		"must know that the component exists by reading the app's AndroidManifest.xml file (the \"manifest\" file). " +
		"Your app must declare all its components in this file, which must be at the root of the app project directory.",

		"There are many more items which you use to build a good Android application. " +
		"Apart from coding for the application, you take care of various other resources " +
		"like static content that your code uses, such as bitmaps, colors, layout definitions, " +
		"user interface strings, animation instructions, and more. These resources are always " +
		"maintained separately in various sub-directories under res/ directory of the project.",

		"An activity represents a single screen with a user interface just like window or frame " +
		"of Java.Android activity is the subclass of ContextThemeWrapper class.",

		"Android - Services. A service is started when an application component, such as an " +
		"activity, starts it by calling startService(). Once started, a service can run in the " +
		"background indefinitely, even if the component that started it is destroyed.",

		"A broadcast receiver (short receiver ) is an Android component which allows you to register " +
		"for system or application events. All registered receivers for an event are notified by " +
		"the Android runtime once this event happens.", 

		"A content provider manages access to a central repository of data. You implement a " +
		"provider as one or more classes in an Android application, along with elements in the " +
		"manifest file. One of your classes implements a subclass ContentProvider , which is the " +
		"interface between your provider and other applications.",

		"Adding a user interface. A fragment is usually used as part of an activity's user " +
		"interface and contributes its own layout to the activity. To provide a layout for a " +
		"fragment, you must implement the onCreateView() callback method, which the Android " +
		"system calls when it's time for the fragment to draw its layout.", 

		"An Intent is a messaging object you can use to request an action from another " +
		"app component. Although intents facilitate communication between components in " +
		"several ways, there are three fundamental use-cases: \nTo start an activity:\nTo " +
		"start a service:\nTo deliver a broadcast:", 

		"A style is a collection of properties that specify the look and format for a View or " +
		"window. A style can specify properties such as height, padding, font color, font size, " +
		"background color, and much more. A style is defined in an XML resource that is separate " +
		"from the XML that specifies the layout.",

		"Android offers a sophisticated and powerful componentized model for building your UI, " +
		"based on the fundamental layout classes: View and ViewGroup. To start with, the platform " +
		"includes a variety of prebuilt View and ViewGroup subclasses — called widgets and layouts, " +
		"respectively — that you can use to construct your UI.",

		"A layout defines the visual structure for a user interface, such as the UI for an activity " +
		"or app widget. You can declare a layout in two ways: Declare UI elements in XML. Android " +
		"provides a straightforward XML vocabulary that corresponds to the View classes and subclasses, " +
		"such as those for widgets and layouts.",

		"Android provides a wide variety of controls you can use in your UI, such as buttons, " +
		"text fields, seek bars, checkboxes, zoom buttons, toggle buttons, and many more. " +
		"Adding an input control to your UI is as simple as adding an XML element to your XML layout.", 

		"Like button presses or screen touch etc. ... Event Listeners − An event listener is an " +
		"interface in the View class that contains a single callback method. ... You will use onClick() " +
		"event handler to handle such event.",

		"With the Android drag/drop framework, you can allow your users to move data from one View to " +
		"another View in the current layout using a graphical drag and drop gesture. The framework " +
		"includes a drag event class, drag listeners, and helper methods and classes.\n\nAlthough the " +
		"framework is primarily designed for data movement, you can use it for other UI actions. For " +
		"example, you could create an app that mixes colors when the user drags a color icon over another icon. " +
		"The rest of this topic, however, describes the framework in terms of data movement.",

		"A notification is a message you can display to the user outside of your application's " +
		"normal UI. When you tell the system to issue a notification, it first appears as an icon " +
		"in the notification area. To see the details of the notification, the user opens the " +
		"notification drawer. Both the notification area and the notification drawer are " +
		"system-controlled areas that the user can view at any time.", 

		"The Google Location Services API, part of Google Play Services, provides a more " +
		"powerful, high-level framework that automatically handles location providers, user " +
		"movement, and location accuracy. It also handles location update scheduling based on " +
		"power consumption parameters you provide. In most cases, you'll get better battery " +
		"performance, as well as more appropriate accuracy, by using the Location Services API.", 

		"A String[] holding e-mail addresses that should be delivered to. A constant String that " +
		"is associated with the Intent, used with ACTION_SEND to supply an alternative to EXTRA_TEXT " +
		"as HTML formatted text. A constant string holding the desired subject line of a message.", 

		"The Built-in SMS application solution is the easiest way, because you let device handle" +
		"everything for you.\nSmsManager Example. Android layout file to textboxes (phone no, sms " +
		"message) and button to send the SMS message. ...\nBuilt-in SMS application Example.",

		"Android provides Built-in applications for phone calls, in some occasions we may need to " +
		"make a phone call through our application.", 

		"Review the developer countries and merchant countries where you can distribute and sell " +
		"apps.\nVisit the Google Play Developer Console.\nEnter basic information about your developer " +
		"identity — name, email address, and so on. ...\nRead and accept the Developer Distribution Agreement " +
		"for your country or region."
	};

	private static String[] datasetJava1 = {
		"Home", "Introduction", "Overview", "Environment Setup",
		"History of Java", "What is Java", "Features of Java", 
		"JDK vs JRE vs JVM", "OOPs Concept", "Basic Syntax", 
		"Variable", "Data Types", "Class", "Object", "Methods", 
		"Constructor", "Fields", "Packages", "Locale",  "Instance", 
		"Reference", "Access Modifier", "Non-Access Modifier", 
		"this", "static", "Main Method", "Object Creation", 
		"Operator", "Statement", "Abstract", "Interface",
		"Interfaces vs Abstract Classes", "Inheritance", 
		"Polymorphism", "Abstraction", "Encapsulation", 
		"Overloading", "Overriding", "Inner Class", "Array",
		"String", "String Builder", "If Statements", 
		"switch Statements", "for loops", "while loops", "Enum", 
		"Annotations", "Serialization", "Thread", "Multi-threading", 
		"Exception", "Collection", "Set", "Navigable Set", "Sorted Set",
		"Map Collection", "Hash Map", "Sorted Map", "List" 
	};

	private static String[] datasetJava2 = {
		"Java is a high-level programming language originally developed by Sun Microsystems and released in 1995. Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX. This tutorial gives a complete understanding of Java. Java Tutorial or Core Java Tutorial or Java Programming Tutorial is a widely used robust technology.", 
		"Java is a simple and yet powerful object oriented programming language and it is in many respects similar to C++. Java originated at Sun Microsystems, Inc. in 1991. It was conceived by James Gosling, Patrick Naughton, Chris Warth, Ed Frank, and Mike Sheridan at Sun Microsystems, Inc.",

		"Java is one of the world's most important and widely used computer languages, and it has held this distinction for many years. Unlike some other computer languages whose influence has weared with passage of time, while Java's has grown.\n\nAs of 2016, Java is one of the most popular programming languages in use, particularly for client-server web applications, with a reported 9 million developers using and working on it.",
		"Assuming you have installed Java in c:\\Program Files\\java\\jdk directory:\n\nRight-click on 'My Computer' and select 'Properties'.\n\nClick on the 'Environment variables' button under the 'Advanced' tab.\n\nNow, alter the 'Path' variable so that it also contains the path to the Java executable. Example, if the path is currently set to 'C:\\WINDOWS\\SYSTEM32', then change your path to read 'C:\\WINDOWS\\SYSTEM32;c:\\Program Files\\java\\jdk\\bin'.", 
		"Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle Corporation) and released in 1995 as a core component of Sun Microsystems' Java platform. The language derives much of its syntax from C and C++, but it has fewer low-level facilities than either of them.",
		"Java is a computer programming language. It enables programmers to write computer instructions using English based commands, instead of having to write in numeric codes. It’s known as a “high-level” language because it can be read and written easily by humans. Like English, Java has a set of rules that determine how the instructions are written. These rules are known as its “syntax”. Once a program has been written, the high-level instructions are translated into numeric codes that computers can understand and execute.",
        "There is given many features of java. They are also known as java buzzwords. The Java Features given below are simple and easy to understand.\n\nSimple\nObject-Oriented\nPlatform independent\nSecured\nRobust\nArchitecture neutral\nPortable\nDynamic\nInterpreted\nHigh Performance\nMultithreaded\nDistributed",
		"JDK (Java Development Kit)\nJDK contains everything that will be required to develop and run Java application.\n\nJRE (Java Run time Environment)\nJRE contains everything required to run Java application which has already been compiled. It doesn’t contain the code library required to develop Java application.\n\nJVM (Java Virtual Machine)\nJVM is a virtual machine which work on top of your operating system to provide a recommended environment for your compiled Java code. JVM only works with bytecode. Hence you need to compile your Java application(.java) so that it can be converted to bytecode format (also known as the .class file). Which then will be used by JVM to run application. JVM only provide the environment It needs the Java code library to run applications.",
		"Object means a real word entity such as pen, chair, table etc. Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies the software development and maintenance by providing some concepts:\n\nObject\nClass\nInheritance\nPolymorphism\nAbstraction\nEncapsulation", 
		"When we consider a Java program it can be defined as a collection of objects that communicate via invoking each others methods. Let us now briefly look into what do class, object, methods and instance variables mean.\n\npublic class SimpleProgram {\n\n    public static void main(String []args) {\n       System.out.println(\"Simple Test Program\");\n    }\n}\t\n", 
		"Variables are used to hold value in program. In this lesson of Java tutorial we will be learning about how to use variables in a program.\nJava Programming language defines mainly three kind of variables.\n\nInstance variables\nStatic Variables\nLocal Variables", 
		"Datatype is a spacial keyword used to allocate sufficient memory space for the data, in other words Data type is used for representing the data in main memory (RAM) of the computer.\n\nIn general every programming language is containing three categories of data types. They are\n\nFundamental or primitive data types\nDerived data types\nUser defined data types.", 
		"A class can be defined as a template/blue print that describes the behaviors/states that object of its type support.", 
		"Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behaviors -wagging, barking, eating. An object is an instance of a class.",
		"A Java method is a collection of statements that are grouped together to perform an operation. When you call the System.out.println() method, for example, the system actually executes several statements in order to display a message on the console.",
		"Constructor is a block of code that allows you to create an object of class. This can also be called creating an instance. Constructor looks like a method but it’s not, for example methods can have any return type or no return type (considered as void) but constructors don’t have any return type not even void.",
		"A Java field is a variable inside a class. For instance, in a class representing an employee, the Employee class might contain the following fields:\n\nname\nposition\nsalary\nhiredDate\nThe corresponding Java class could be defined like this:\n\npublic class Employee {\n  String  name     ;\n  String  position ;\n  int     salary   ;\n  Date    hiredDate;\n}", 
		"A Java package is a technique for organizing Java classes into namespaces similar to the modules of Modula, providing modular programming in Java. Java packages can be stored in compressed files called JAR files, allowing classes to be downloaded faster as groups rather than individually.",
		"A Locale object represents a specific geographical, political, or cultural region. An operation that requires a Locale to perform its task is called locale-sensitive and uses the Locale to tailor information for the user. For example, displaying a number is a locale-sensitive operation— the number should be formatted according to the customs and conventions of the user's native country, region, or culture.", 
		"The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory. Note: The phrase \"instantiating a class\" means the same thing as \"creating an object.\" When you create an object, you are creating an \"instance\" of a class, therefore \"instantiating\" a class.",
		"Abstract base class for reference objects. This class defines the operations common to all reference objects. Because reference objects are implemented in close cooperation with the garbage collector, this class may not be subclassed directly.", 
		"Access modifiers help you set the level of access you want for your Class, variables as well as Methods.\nThere are three access modifiers. Not including default access modifier . Default is an access control which will be set when one does not specify any access modifier.\nAccess Control:\nPublic\nPrivate\nProtected\nDefault", 
		"In this article you will learn about Non Access Modifiers. Below are the Non Access Modifiers available in Java.\nFinal\nAbstract\nStatic\nStrictfp\nNative\nSynchronized\nTransient", 
		"this  is a keyword in Java. It can be used inside the Method or constructor of  Class. It(this) works as a reference to the current Object whose Method or constructor is being invoked. The this keyword can be used to refer to any member of the current object from within an instance Method or a constructor.", 
		"The static keyword in java is used for memory management mainly. We can apply java static keyword with variables, methods, blocks and nested class. The static keyword belongs to the class than instance of the class.\n\nThe static can be:\n\nvariable (also known as class variable)\nmethod (also known as class method)\nblock\nnested class",
		"class JBT{\npublic static void main(String args[])\n{\nSystem.out.println(\"Hello JBT\");\n}\n}\n\nmain: is the name of the Method. This Method name is searched by JVM as a starting point for an application with a particular signature only.", 
		"You are required to use “new” operator to create an Object of a Class. This is not true in order to create an Object.\n \nThere are several ways to create an Object of a Class :\n\nUsing new keyword\nUsing new Instance (Reflection)\nUsing Clone\nUsing Deserilization\nUsing ClassLoader", 
		"The Bitwise Operators: Java defines several bitwise operators, which can be applied to the integer types, long, int, short, char, and byte. Binary AND Operator copies a bit to the result if it exists in both operands. Binary OR Operator copies a bit if it exists in either operand.", 
		"Types of Java Statement\nControl Statement\nAssignment Statement\n In this section we will discuss about control statements. Click here for additional information on assignment statement.", 
		"A class that is declared with abstract keyword, is known as abstract class in java. It can have abstract and non-abstract methods (method with body).\n\nAbstraction is a process of hiding the implementation details and showing only functionality to the user.\n\nAnother way, it shows only important things to the user and hides the internal details for example sending sms, you just type the text and send the message. You don't know the internal processing about the message delivery.\n\nAbstraction lets you focus on what the object does instead of how it does it.\n\n", 
		"An interface in java is a blueprint of a class. It has static constants and abstract methods only.\n\nThe interface in java is a mechanism to achieve fully abstraction. There can be only abstract methods in the java interface not method body. It is used to achieve fully abstraction and multiple inheritance in Java.\n\nJava Interface also represents IS-A relationship.\n\nIt cannot be instantiated just like abstract class.",
		"Java interfaces are used to decouple the interface of some component from the implementation. In other words, to make the classes using the interface independent of the classes implementing the interface. Thus, you can exchange the implementation of the interface, without having to change the class using the interface.\n\nAbstract classes are typically used as base classes for extension by subclasses. Some programming languages use abstract classes to achieve polymorphism, and to separate interface from implementation, but in Java you use interfaces for that. Remember, a Java class can only have 1 superclass, but it can implement multiple interfaces.", 
		"Java Inheritance defines an is-a relationship between a superclass and its subclasses. This means that an Object of a subclass can be used wherever an object of the superclass can be used. Class Inheritance in Java is used to build new Classes from existing Classes. The inheritance relationship is transitive: if Class x extends Class y, then a Class z, which extends Class x, will also inherit from Class y.",
		"Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object. Any Java object that can pass more than one IS-A test is considered to be polymorphic.",
		"Abstraction is process of hiding the implementation details and showing only the functionality. Abstraction in java is achieved by using interface and abstract class. Interface give 100% abstraction and abstract class give 0-100% abstraction. A class that is declared as abstract is known as abstract class.",
		"Binding the data with its related functionalities known as encapsulation\nHere data means variables and functionalities means methods.\nSo keeping the variable and related methods in one place.\nThat place is \"class\". class is the base for encapsulation.", 
		"An Overloaded Method gives you an option to use the same Method name in a Class but with a different argument.\n \nOverloading in Java Method Rules\nThere are some rules associated with an overloaded Method.\n\nOverloaded methods\nMust change the argument list\nCan change the return type\nCan change the access modifier(Broader)\nCan declare new or broader checked exception",
		"Class inheriting the method from its super class has the option to override it. Benefit of overriding is the ability to define behavior specific to particular class. In case of concrete subclass it is forced to implement all methods defined in abstract class if no other super class implemented it in hierarchy. Overriding some times referred as Run time Binding. It means which overridden method is to be invoked will be determined by reference type and not the instance type.",
		"Inner classes are class within Class. Inner class instance has special relationship with Outer class. This special relationship gives inner class access to member of outer class as if they are the part of outer class.", 
		"Java Array is a data structure type which is used to store multiple variables of the same type. Arrays can hold Primitives as well as Object.",
		"The String class represents character strings.\nAll string literals in Java programs, such as “abc”, are implemented as instances of this class.\nStrings are like constants, once created its value can not be changed.\nString objects are immutable and hence it can be shared.\nString Buffer and String Builder can be used in place of String if lot of String Operation is to be performed.",
		"A String Builder is like a String, but can be modified. String has drawback that once created it can not be modified. To overcome that problem String Buffer and String builder can be used.", 
		"An if statement consists of a boolean expression followed by one or more statements. An if statement can be followed by an optional else statement, which executes when the boolean expression is false. You can use one if or else if statement inside another if or else if statement(s).",
		"A switch statement works a bit like an if statement, except it can choose between more than two blocks of code to execute. Here is a simple example:\n\nint amount = 9;\n\nswitch(amount) {\n    case     0 : System.out.println(\"amount is  0\"); break;\n    case     5 : System.out.println(\"amount is  5\"); break;\n    case    10 : System.out.println(\"amount is 10\"); break;\n    default    : System.out.println(\"amount is something else\");\n}",
		"The Java for loop repeats a set of Java operations. A for loop repeats a block of code as long as some condition is true. Here is a simple Java for loop example:\n\nfor(int i=0; i < 10; i++) {\n\n   System.out.println(\"i is: \" + i);\n\n}\nThis example is a standard Java for loop. Inside the parentheses () after the for keyword, are three statements separated by semicolon (;).", 
		"The Java while loop is similar to the for loop. The while loop enables your Java program to repeat a set of operations while a certain conditions is true.\n\nThe Java while loop exist in two variations. The commonly used while loop and the less often do while version. I will cover both while loop versions in this text.\n\nint counter = 0;\n\nwhile(counter < 10) {\n\n    System.out.println(\"counter: \" + counter);\n\n    counter++;\n}", 
		"Well, you use enums in your Java code. If you don’t then you do something wrong or have very simple applications without much complex functionality.\n\nAnyway, let’s look at the basics. For example you want to have a class which uses workdays. You could define it like this:\n\n   public class Schedule {\n     private ??? workday;\n   }",
		"Annotations applied to Java code:\n@Override - Checks that the method is an override. ...\n@Deprecated - Marks the method as obsolete. ...\n@SuppressWarnings - Instructs the compiler to suppress the compile time warnings specified in the annotation parameters.", 
		"Serialization is a process in which current state of Object will be saved in stream of bytes. As byte stream create is platform neutral hence once objects created in one system can be deserialized in other platform.", 
		"Thread term can be used in two ways\n \nAn instance of class java.lang.Thread\nA Thread of Execution\n\nAn Instance of Thread is an object like any other object in Java, it contains variables and methods which lives and dies on the heap. But a Thread of Execution is an individual process  which has its own stack call. Even if you don’t create any thread in your program, thread will be running there and main() method will start that.",
		"Multithreading can be a great way to increase the performance of some types of programs. However, mulithreading is even more challenging than multitasking. The threads are executing within the same program and are hence reading and writing the same memory simultanously. This can result in errors not seen in a singlethreaded program. Some of these errors may not be seen on single CPU machines, because two threads never really execute \"simultanously\". Modern computers, though, come with multi core CPUs, and even with multiple CPUs too. This means that separate threads can be executed by separate cores or CPUs simultanously.", 
		"Exception are used in Java to handle errors or any other exceptional event that occurs in the normal flow of program. There are several way Exception can occur in Java.\n \nData provided is not in expected format(eg. int instead of String).\nDB can not connected.\nNetwork connection Lost.\nObject is null.\n…..", 
		"Collections in java is a framework that provides an architecture to store and manipulate the group of objects.\n\nAll the operations that you perform on a data such as searching, sorting, insertion, manipulation, deletion etc. can be performed by Java Collections.\n\nJava Collection simply means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque etc.) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet etc).",
		"Set is a part Java Collection Framework. Set is an Interface in java.util package. It implements Collection Interface.Concrete Implementation of Set Interface\n\nHashSet\nLinkedHashSet\nTreeSet\nEnumSet\n", 
		"Navigable Set Interface is added in Java 6 (1.6). It is the part of Java Collection Framework.\n\nSalient Point of Navigable Set\n\nNavigable Set can be accessed and Traversed in ascending or descending order.\nPerformance of Ascending operation is likely to be faster than descending.", 
		"It provides ordering of Its element.\nElements are ordered on the basis of Comparable / Comparator provided @ the time of creation of SortedSet.\nIterator will traverse the set in ascending order.\nThis interface is the set analogue of SortedMap.\nElements inserted in SortedSet needs to implement Comparable Interface (Or accepting the comparator interface).\nAll implementation of SortedSet should provide 4 constructor.\nNo Arg Constructor\nConstructor with single argument of Comparator.\nConstructor with single argument as Collection.\nConstructor with single argument as SortedSet.\n", 
		"It is an Object that used to map keys to values.\nA Map cannot contain Duplicate values.\nEvery key can map to one value at most.\nThis interface is replacement to Dictionary class which was an abstract class instead of Interface.\nMap interface allows 3 collection views\nSet of keys\nCollection of values\nSet of key-value mappings",
		"HashMap is HashTable based implementation of Map. This is the reason why interviewer always ask for difference between HashMap and HashTable. HashMap is mostly equals to HashTable except below two differences.\n\nHashMap is unsynchronized while HashTable is synchronised.\nHashMap permits null while HashTable doesn’t.", 
		"This interface is the map analogue of SortedSet.\nIT provides ordering on its keys.\nSorted criteria would be to natural order or Comparator provided at the time of creation.\nKeys used in it must implement Comparable or accept the specified comparator.\nKeys in this map need to be mutually comparable.\nIn Map interface equals method is used to compare two keys while in SortedMap compare/ compareTo method (from Comparable or Comparator) is used.\nConstructor that needs to be implemented by concrete class", 
		"Here we will learn about the List interface and different implementation of it in details. List Interface which is in java.util package is a subtype of java.util.Collection Interface.\n\nList Interface Salient Point\n\nIt is a part of java.util package.\nIt is a subtype of java.util.Collection Interface\nList is an Ordered Collection. Means elements of List can be accessed in ordered way (By index).\nAllows Duplicate values.\nAllows NULL values.\nList has a special Iterator named ListIterator. It will help traverse list in both directions.\nList has full control on where each element is inserted."
	};

	private static String[] datasetKotlin1 = {
		"Overview and Set up", "Introduction", "Variables and Data Types",
		"Operators", "Control Flow", "Nullable Types and Null Safety", 
		"Functions", "Infix Notations", "Classes, Objects and Constructors", 
		"Gatters and Setters", "Inheritance", "Abstract Classes", 
		"Data Classes", "Type Checks and Smart Casts"
	};

	private static String[] datasetKotlin2 = {
		"Kotlin is a programming language developed by JetBrains, the same company that has built world-class IDEs like IntelliJ IDEA, PhpStorm, PyCharm, ReSharper etc.\nIt runs on the Java Virtual Machine (JVM), and can also be compiled to JavaScript and Machine Code.", 
		"The first program that we typically write in any programming language is the “Hello, World” program.\nLet’s write the “Hello, World” program in Kotlin and understand its internals.", 
		"In this article, you’ll learn how to declare variables in Kotlin, how Kotlin infers the type of variables, and what are the basic data types supported by Kotlin for creating variables.", 
		"In this article, you’ll learn what are various operators provided by kotlin to perform operations on basic data types.",
		"In this article, You’ll learn how to use Kotlin’s control flow expressions and statements which includes conditional expressions like if, if-else, when and looping statements like for, while, and do-while.", 
		"Kotlin supports nullability as part of its type System. That means You have the ability to declare whether a variable can hold a null value or not.\nBy supporting nullability in the type system, the compiler can detect possible NullPointerException errors at compile time and reduce the possibility of having them thrown at runtime\n", 
		"Functions are the basic building block of any program. In this article, you’ll learn how to declare and call functions in Kotlin.\n You’ll also learn about Function scopes, Default arguments, Named Arguments, and Varargs.",
		"Kotlin supports method calls of a special kind, called infix calls.\nYou can mark any member function or extension function with the infix modifier to allow it to be called using infix notation. The only requirement is that the function should have only one required parameter.\n\nInfix notations are used extensively in Kotlin. If you’ve been programming in Kotlin, chances are that you’ve already used infix notations.", 
		"Classes and Objects are the central concepts in any Object Oriented Programming(OOP) language.\n\nA class is a blueprint/template for creating objects of similar type. The objects contain state in the form of member variables (properties) and behavior in the form of member functions (methods).", 
		"Kotlin internally generates a default getter and setter for mutable properties, and a getter (only) for read-only properties.\n\nIt calls these getters and setters internally whenever you access or modify a property using the dot(.) notation.\n", 
		"Inheritance is one of the key concepts of Object Oriented Programming (OOP). Inheritance enables re-usability. It allows a class to inherit features (properties and methods) from another class.\n\nThe class that inherits the features of another class is called the Child class or Derived class or Sub class, and the class whose features are inherited is called the Parent class or Base class or Super class.", 
		"An abstract class is a class that cannot be instantiated. We create abstract classes to provide a common template for other classes to extend and use.You can declare an abstract class using the abstract keyword -\n\nabstract class Vehicle", 
		"Kotlin has a better solution for classes that are used to hold data/state. It’s called a Data Class. A Data Class is like a regular class but with some additional functionalities.",
		"When working with mixed types, We often need to know the type of an object at runtime so that we can safely cast the object to our desired type and call methods or access properties on it."
	};


	private static String[] datasetSqlite1 = {
		"Home", "Overview",  "Installation", "Commands", "Syntax", 
		"Data Types", "Create Database", "Attach Database", "Detach Database",
		"Create Table", "Drop Table", "Insert Query", "Select Query", 
		"Operators", "Expressions", "Where Clause", "AND & OR Clauses", 
		"Update Query", "Delete Query", "Like Clause", "Glob Clause", 
		"Limit Clause", "Order By", "Group By", "Having Clause", 
		"Distinct Keyword", "PRAGMA", "Constraints", "Joins", "Union Clause",
		"NULL Values", "Alias Syntax", "Triggers", "Indexes", "Indexed By",
		"Alter Command", "Truncate Table", "Views", "Transactions", "Sub Queries",
		"Autoincrement", "Injection", "Explain", "Vacuum", "Date & Time",
		"Useful Functions", "C/C++", "Java", "PHP", "Perl", "Python" 
	};

	private static String[] datasetSqlite2 = {
		"SQLite is a software library that implements a self-contained, serverless, zero-configuration, transactional SQL database engine. SQLite is the most widely deployed SQL database engine in the world. The source code for SQLite is in the public domain.", 
		"SQLite is one of the fastest-growing database engines around, but that's growth in terms of popularity, not anything to do with its size. The source code for SQLite is in the public domain.", 
		"The SQLite is famous for its great feature zero-configuration, which means no complex setup or administration is needed. This chapter will take you through the process of setting up SQLite on Windows, Linux and Mac OS X.", 
		"This chapter will take you through simple and useful commands used by SQLite programmers. These commands are called SQLite dot commands and exception with these commands is that they should not be terminated by a semi-colon (;).", 
		"Important point to be noted is that SQLite is case insensitive, but there are some commands, which are case sensitive like GLOB and glob have different meaning in SQLite statements.", 
		"SQLite data type is an attribute that specifies type of data of any object. Each column, variable and expression has related data type in SQLite.\n\nYou would use these data types while creating your tables. SQLite uses a more general dynamic type system. In SQLite, the datatype of a value is associated with the value itself, not with its container.", 
		"The SQLite sqlite3 command is used to create new SQLite database. You do not need to have any special privilege to create a database.\n", 
		"Consider a case when you have multiple databases available and you want to use any one of them at a time. SQLite ATTACH DTABASE statement is used to select a particular database, and after this command, all SQLite statements will be executed under the attached database.",
		"SQLite DETACH DTABASE statement is used to detach and dissociate a named database from a database connection which was previously attached using ATTACH statement. If the same database file has been attached with multiple aliases, then DETACH command will disconnect only given name and rest of the attachement will still continue. You cannot detach the main or temp databases.", 
		"The SQLite CREATE TABLE statement is used to create a new table in any of the given database. Creating a basic table involves naming the table and defining its columns and each column's data type.", 
		"The SQLite DROP TABLE statement is used to remove a table definition and all associated data, indexes, triggers, constraints and permission specifications for that table.-", 
		"The SQLite INSERT INTO Statement is used to add new rows of data into a table in the database.\n\nSyntax:\nThere are two basic syntaxes of INSERT INTO statement as follows:\n\nINSERT INTO TABLE_NAME [(column1, column2, column3,...columnN)]  \nVALUES (value1, value2, value3,...valueN);", 
		"SQLite SELECT statement is used to fetch the data from a SQLite database table which returns data in the form of result table. These result tables are also called result-sets.\n\nSyntax:\nThe basic syntax of SQLite SELECT statement is as follows:\n\nSELECT column1, column2, columnN FROM table_name;",
		"An operator is a reserved word or a character used primarily in an SQLite statement's WHERE clause to perform operation(s), such as comparisons and arithmetic operations.\n\nOperators are used to specify conditions in an SQLite statement and to serve as conjunctions for multiple conditions in a statement.\n\nArithmetic operators\n\nComparison operators\n\nLogical operators\n\nBitwise operators",
		"An expression is a combination of one or more values, operators and SQL functions that evaluate to a value.\n\nSQL EXPRESSIONs are like formulas and they are written in query language. You can also use to query the database for specific set of data.", 
		"The SQLite WHERE clause is used to specify a condition while fetching the data from one table or multiple tables.\n\nIf the given condition is satisfied, means true, then it returns specific value from the table. You would use WHERE clause to filter the records and fetching only necessary records.", 
		"The SQLite AND and OR operators are used to compile multiple conditions to narrow down selected data in an SQLite statement. These two operators are called conjunctive operators.\n\nThese operators provide a means to make multiple comparisons with different operators in the same SQLite statement.", 
		"The SQLite UPDATE Query is used to modify the existing records in a table. You can use WHERE clause with UPDATE query to update selected rows, otherwise all the rows would be updated.\n\nThe basic syntax of UPDATE query with WHERE clause is as follows:\n\nUPDATE table_name\nSET column1 = value1, column2 = value2...., columnN = valueN\nWHERE [condition];",
        "The SQLite DELETE Query is used to delete the existing records from a table. You can use WHERE clause with DELETE query to delete selected rows, otherwise all the records would be deleted.\n\nThe basic syntax of DELETE query with WHERE clause is as follows:\n\nDELETE FROM table_name\nWHERE [condition];", 
        "The SQLite LIKE operator is used to match text values against a pattern using wildcards. If the search expression can be matched to the pattern expression, the LIKE operator will return true, which is 1. There are two wildcards used in conjunction with the LIKE operator:\n\nThe percent sign (%)\n\nThe underscore (_)", 
        "The SQLite GLOB operator is used to match only text values against a pattern using wildcards. If the search expression can be matched to the pattern expression, the GLOB operator will return true, which is 1. Unlike LIKE operator, GLOB is case sensitive and it follows syntax of UNIX for specifying THE following wildcards.\n\nThe asterisk sign (*)\n\nThe question mark (?)",
		"The SQLite LIMIT clause is used to limit the data amount returned by the SELECT statement.\n\nThe basic syntax of SELECT statement with LIMIT clause is as follows:\n\nSELECT column1, column2, columnN \nFROM table_name\nLIMIT [no of rows]", 
		"The SQLite ORDER BY clause is used to sort the data in ascending or descending order, based on one or more columns.\n\nSyntax:\nThe basic syntax of ORDER BY clause is as follows:\n\nSELECT column-list \nFROM table_name \n[WHERE condition] \n[ORDER BY column1, column2, .. columnN] [ASC | DESC];",
		"The SQLite GROUP BY clause is used in collaboration with the SELECT statement to arrange identical data into groups.\n\nThe GROUP BY clause follows the WHERE clause in a SELECT statement and precedes the ORDER BY clause.",
		"The HAVING clause enables you to specify conditions that filter which group results appear in the final results.\n\nThe WHERE clause places conditions on the selected columns, whereas the HAVING clause places conditions on groups created by the GROUP BY clause.",
		"The SQLite DISTINCT keyword is used in conjunction with SELECT statement to eliminate all the duplicate records and fetching only unique records.\n\nThere may be a situation when you have multiple duplicate records in a table. While fetching such records, it makes more sense to fetch only unique records instead of fetching duplicate records.",
		"The SQLite PRAGMA command is a special command to be used to control various environmental variables and state flags within the SQLite environment. A PRAGMA value can be read and it can also be set based on requirements.",
		"Constraints are the rules enforced on data columns on table. These are used to limit the type of data that can go into a table. This ensures the accuracy and reliability of the data in the database.",
		"The SQLite Joins clause is used to combine records from two or more tables in a database. A JOIN is a means for combining fields from two tables by using values common to each.\n\nSQL defines three major types of joins −\n\nThe CROSS JOIN\nThe INNER JOIN\nThe OUTER JOIN",
		"The SQLite UNION clause/operator is used to combine the results of two or more SELECT statements without returning any duplicate rows.\n\nTo use UNION, each SELECT must have the same number of columns selected, the same number of column expressions, the same data type, and have them in the same order, but they do not have to be the same length.",
		"The SQLite NULL is the term used to represent a missing value. A NULL value in a table is a value in a field that appears to be blank.\n\nA field with a NULL value is a field with no value. It is very important to understand that a NULL value is different than a zero value or a field that contains spaces.",
		"You can rename a table or a column temporarily by giving another name, which is known as ALIAS. The use of table aliases means to rename a table in a particular SQLite statement. Renaming is a temporary change and the actual table name does not change in the database.",
		"SQLite Triggers are database callback functions, which are automatically performed/invoked when a specified database event occurs. Following are the important points about SQLite triggers:",
		"Indexes are special lookup tables that the database search engine can use to speed up data retrieval. Simply put, an index is a pointer to data in a table. An index in a database is very similar to an index in the back of a book.",
		"The \"INDEXED BY index-name\" clause specifies that the named index must be used in order to look up values on the preceding table.\n\nIf index-name does not exist or cannot be used for the query, then the preparation of the SQLite statement fails.\n\nThe \"NOT INDEXED\" clause specifies that no index shall be used when accessing the preceding table, including implied indices create by UNIQUE and PRIMARY KEY constraints.",
		"The SQLite ALTER TABLE command modifies an existing table without performing a full dump and reload of the data. You can rename a table using ALTER TABLE statement and additional columns can be added in an existing table using ALTER TABLE statement.\n\nThere is no other operation supported by ALTER TABLE command in SQLite except renaming a table and adding a column in existing table.\n\n",
		"Unfortunately, we do not have TRUNCATE TABLE command in SQLite but you can use SQLite DELETE command to delete complete data from an existing table, though it is recommended to use DROP TABLE command to drop complete table and re-create it once again.",
		"A view is nothing more than a SQLite statement that is stored in the database with an associated name. A view is actually a composition of a table in the form of a predefined SQLite query.",
		"A transaction is a unit of work that is performed against a database. Transactions are units or sequences of work accomplished in a logical order, whether in a manual fashion by a user or automatically by some sort of a database program.",
		"A Subquery or Inner query or Nested query is a query within another SQLite query and embedded within the WHERE clause.\n\nA subquery is used to return data that will be used in the main query as a condition to further restrict the data to be retrieved.\n\nSubqueries can be used with the SELECT, INSERT, UPDATE and DELETE statements along with the operators like =, <, >, >=, <=, IN, BETWEEN etc.",
		"SQLite AUTOINCREMENT is a keyword used for auto incrementing a value of a field in the table. We can auto increment a field value by using AUTOINCREMENT keyword when creating a table with specific column name to auto incrementing it.\n\nThe keyword AUTOINCREMENT can be used with INTEGER field only.", 
		"If you take user input through a webpage and insert it into a SQLite database there's a chance that you have left yourself wide open for a security issue known as SQL Injection. This lesson will teach you how to help prevent this from happening and help you secure your scripts and SQLite statements.", 
		"An SQLite statement can be preceded by the keyword \"EXPLAIN\" or by the phrase \"EXPLAIN QUERY PLAN\" used for describing the details of table.\n\nEither modification causes the SQLite statement to behave as a query and to return information about how the SQLite statement would have operated if the EXPLAIN keyword or phrase had been omitted.", 
		"The VACUUM command cleans the main database by copying its contents to a temporary database file and reloading the original database file from the copy. This eliminates free pages, aligns table data to be contiguous, and otherwise cleans up the database file structure.",
		"The time string can be followed by zero or more modifiers that will alter date and/or time returned by any of the above five functions. Modifiers are applied from left to right and following modifers are available in SQLite:\n\nNNN days\n\nNNN hours\n\nNNN minutes",
		"SQLite has many built-in functions for performing processing on string or numeric data. Following is the list of few useful SQLite built-in functions and all are case in-sensitive which means you can use these functions either in lower-case form or in upper-case or in mixed form.", 
		"Before we start using SQLite in our C/C++ programs, we need to make sure that we have SQLite library set up on the machine. You can check SQLite Installation chapter to understand installation process.", 
		"Before we start using SQLite in our Java programs, we need to make sure that we have SQLite JDBC Driver and Java set up on the machine. You can check Java tutorial for Java installation on your machine. Now, let us check how to set up SQLite JDBC driver.\n\nDownload latest version of sqlite-jdbc-(VERSION).jar from sqlite-jdbc repository.\n\nAdd downloaded jar file sqlite-jdbc-(VERSION).jar in your class path, or you can use it along with -classpath option as explained below in examples.",
		"The SQLite3 extension is enabled by default as of PHP 5.3.0. It's possible to disable it by using --without-sqlite3 at compile time.\n\nWindows users must enable php_sqlite3.dll in order to use this extension. This DLL is included with Windows distributions of PHP as of PHP 5.3.0.", 
		"The SQLite3 can be integrated with Perl using Perl DBI module, which is a database access module for the Perl programming language. It defines a set of methods, variables and conventions that provide a standard database interface.", 
		"The SQLite3 can be integrated with Python using sqlite3 module which was written by Gerhard Haring. It provides an SQL interface compliant with the DB-API 2.0 specification described by PEP 249. You do not need to install this module separately because its being shipped by default along with Python version 2.5.x onwards." 
	};

	private static String[] datasetTutorials1 = {
		"Activity Lifecycle Thread", "Activity Example", "Password Field Example", "ListView Example",
		"Listadapter Example", "Alert Box", "Custom Dialogue Example", "Progressbar Example", 
		"Gridview Example", "Custom Gridview Example", "Simple Viewflipper Example",
		"Gallery Example", "Webview Example", "Quick Action Popup", "XML Drawables", 
		"XML Parser", "XML SAX Parser", "JSON Parser Example", "Content Provider", 
		"Async Task", "AIDL Example", "Animation Simple Example", "Surfaceview Animation Example", 
		"Basic Parceeble Example", "Database Example", "Fragments" 
	};

	private static String[] datasetTutorials2 =  {
		"As a user navigates through, out of, and back to your app, the Activity instances in your app transition through different states in their lifecycle. The Activity class provides a number of callbacks that allow the activity to know that a state has changed: that the system is creating, stopping, resuming, or destroying an activity.",
		"Android - Activities. An activity represents a single screen with a user interface just like window or frame of Java.Android activity is the subclass of ContextThemeWrapper class.",
		"We show you how to use XML to create a password field, label field and a normal button. When you click on the button, the password value will be displayed as a floating message (toast message).",
		"Android ListView is a view which groups several items and display them in vertical scrollable list. The list items are automatically inserted to the list using an Adapter that pulls content from a source such as an array or database.",
		"Extended Adapter that is the bridge between a ListView and the data that backs the list. Frequently that data comes from a Cursor, but that is not required. The ListView can display any data provided that it is wrapped in a ListAdapter.",
        "A dialog is a small window that prompts the user to make a decision or enter additional information. A dialog does not fill the screen and is normally used for modal events that require users to take an action before they can proceed.",
		"Some times in your application, if you wanted to ask the user about taking a decision between yes or no in response of any particular action taken by the user, by remaining in the same activity and without changing the screen, you can use Alert Dialog.",
		"Visual indicator of progress in some operation. Displays a bar to the user representing how far the operation has progressed; the application can change the amount of progress (modifying the length of the bar) as it moves forward. There is also a secondary progress displayable on a progress bar which is useful for displaying intermediate progress, such as the buffer level during a streaming playback progress bar.",
		"GridView is a ViewGroup that displays items in a two-dimensional, scrollable grid. The grid items are automatically inserted to the layout using a ListAdapter.",
		"GridView is used to display data in two dimension. In this tutorial we are going to show you how to implement custom GridView in Android with Images and Text.",
		"Simple ViewAnimator that will animate between two or more views that have been added to it. Only one child is shown at a time. If requested, can automatically flip between each child at a regular interval.", 
		"A view that shows items in a center-locked, horizontally scrolling list.\n\nThe default values for the Gallery assume you will be using Theme_galleryItemBackground as the background for each View given to the Gallery from the Adapter. If you are not doing this, you may need to adjust some Gallery properties, such as the spacing.\n\nViews given to the Gallery should use Gallery.LayoutParams as their layout parameters type.", 
		"A View that displays web pages. This class is the basis upon which you can roll your own web browser or simply display some online content within your Activity. It uses the WebKit rendering engine to display web pages and includes methods to navigate forward and backward through a history, zoom in and out, perform text searches and more.", 
		"Quick action pattern is a way of making the applications more interesting and interactive for the users. It is a context menu that doesn't cover up the data that is being acted on. Most of time, this Quick actions dialog is not present in the android by default, so we have to create it.\n\nRead more: http://mrbool.com/how-to-implement-quick-action-pattern-in-android/26980#ixzz4ZLl97ch0",
		"A Drawable resource is a general concept for a graphic which can be drawn. The simplest case is a graphical file (bitmap), which would be represented in Android via a BitmapDrawable class. Every Drawable is stored as individual files in one of the res/drawable folders.", 
		"Android - XML Parser. XML stands for Extensible Mark-up Language.XML is a very popular format and commonly used for sharing data on the internet. This chapter explains how to parse the XML file and extract necessary information from it. Android provides three types of XML parsers which are DOM,SAX and XMLPullParser.",
		"Defines the API that wraps an XMLReader implementation class. In JAXP 1.0, this class wrapped the Parser interface, however this interface was replaced by the XMLReader. For ease of transition, this class continues to support the same name and interface as well as supporting new methods. An instance of this class can be obtained from the newSAXParser() method. Once an instance of this class is obtained, XML can be parsed from a variety of input sources. These input sources are InputStreams, Files, URLs, and SAX InputSources.",
		"JSON is very light weight, structured, easy to parse and much human readable. JSON is best alternative to XML when your android app needs to interchange data with your server. If your app consuming XML data, you can always refer to Android XML Parsing Tutorial.", 
		"Content providers can help an application manage access to data stored by itself, stored by other apps, and provide a way to share data with other apps. They encapsulate the data, and provide mechanisms for defining data security. Content providers are the standard interface that connects data in one process with code running in another process. Implementing a content provider has many advantages. ",
		"AsyncTask enables proper and easy use of the UI thread. This class allows you to perform background operations and publish results on the UI thread without having to manipulate threads and/or handlers.\n\nAsyncTask is designed to be a helper class around Thread and Handler and does not constitute a generic threading framework. AsyncTasks should ideally be used for short operations (a few seconds at the most.) If you need to keep threads running for long periods of time, it is highly recommended you use the various APIs provided by the java.util.concurrent package such as Executor, ThreadPoolExecutor and FutureTask.", 
		"AIDL (Android Interface Definition Language) is similar to other IDLs you might have worked with. It allows you to define the programming interface that both the client and service agree upon in order to communicate with each other using interprocess communication (IPC). On Android, one process cannot normally access the memory of another process. So to talk, they need to decompose their objects into primitives that the operating system can understand, and marshall the objects across that boundary for you. The code to do that marshalling is tedious to write, so Android handles it for you with AIDL.", 
		"Tween Animation takes some parameters such as start value , end value, size , time duration , rotation angle e.t.c and perform the required animation on that object. It can be applied to any type of object. So in order to use this , android has provided us a class called Animation.", 
		"Provides a dedicated drawing surface embedded inside of a view hierarchy. You can control the format of this surface and, if you like, its size; the SurfaceView takes care of placing the surface at the correct location on the screen\n\nThe surface is Z ordered so that it is behind the window holding its SurfaceView; the SurfaceView punches a hole in its window to allow its surface to be displayed. The view hierarchy will take care of correctly compositing with the Surface any siblings of the SurfaceView that would normally appear on top of it. This can be used to place overlays such as buttons on top of the Surface, though note however that it can have an impact on performance since a full alpha-blended composite will be performed each time the Surface changes.",
		"Interface for classes whose instances can be written to and restored from a Parcel. Classes implementing the Parcelable interface must also have a non-null static field called CREATOR of a type that implements the Parcelable.Creator interface.", 
		"One of the main principles of SQL databases is the schema: a formal declaration of how the database is organized. The schema is reflected in the SQL statements that you use to create your database. You may find it helpful to create a companion class, known as a contract class, which explicitly specifies the layout of your schema in a systematic and self-documenting way.\n\nA contract class is a container for constants that define names for URIs, tables, and columns. The contract class allows you to use the same constants across all the other classes in the same package. This lets you change a column name in one place and have it propagate throughout your code.", 
		"A Fragment represents a behavior or a portion of user interface in an Activity. You can combine multiple fragments in a single activity to build a multi-pane UI and reuse a fragment in multiple activities. You can think of a fragment as a modular section of an activity, which has its own lifecycle, receives its own input events, and which you can add or remove while the activity is running (sort of like a \"sub activity\" that you can reuse in different activities)." 
	};

	private static String[] datasetInterview1 = {
		"Android", "Java", "Kotlin", "SQLite" 
	};

	private static String[] datasetInterview2 =  {
		"Android is a stack of software for mobile devices which includes an Operating System, middleware and some key applications. The application executes within its own process and its own instance of Dalvik Virtual Machine.\nAndroid provides a rich application framework that allows you to build innovative apps and games for mobile devices in a Java language environment.",
		"Java is a simple and yet powerful object oriented programming language and it is in many respects similar to C++. Java originated at Sun Microsystems, Inc. in 1991. It was conceived by James Gosling, Patrick Naughton, Chris Warth, Ed Frank, and Mike Sheridan at Sun Microsystems, Inc",
		"Kotlin an open source programming language that combines object-oriented programming features.\n\nThe features like Range Expression, Extension Function, Companion Object, Smart casts, Data classes are considered to be surplus of the Kotlin Language.",
		"SQL LITE is a mostly ACID compliant relational database management system contained in a relatively small C programming library. \nSQLite is a software library that implements a self-contained, serverless, zero-configuration, transactional SQL database engine. SQLite is the most widely deployed database engine in the world."
	};

	public static String[] datasetGradle1 = { "Introduction", "Installation", "Build Script", "Task", "Dependency Management", "Plugins", "Running a Build",  "Build a Java Project", "Building a Groovy Project", "Testing", "Multi-Project Build", "Deployment", "Eclipse Integration" };

	public static String[] datasetGradle2 = {
		"Gradle is an open source, advanced general purpose build management system. It is built on ANT, Maven, and lvy repositories. It supports Groovy based Domain Specific Language (DSL) over XML. This tutorial explains how you can use Gradle as a build automation tool for Java as well as Groovy projects.",
		"Gradle is a build tool, based on Java. There are some prerequisites that needs to be installed before installing the Gradle framework.", 
		"Gradle builds a script file for handling two things; one is projects and another one is tasks. Every Gradle build represents one or more projects. A project represents a library JAR or a web application or it might represent a ZIP that assembled from the JARs produced by other projects. In simple words, a project is made up of different tasks. A task means a piece of work which a build performs. A task might be compiling some classes, creating a JAR, generating Javadoc, or publishing some archives to a repository.", 
		"Gradle build script describes one or more Projects. Each project is made up of different tasks. A task is a piece of work which a build performs. The task might be compiling some classes, storing class files into separate target folder, creating JAR, generating Javadoc, or publishing some archives to repositories.",
		"Dependency configuration is nothing but defines a set of dependencies. You can use this feature to declare external dependencies, which you want to download from the web. This defines the following different standard configurations.",
	    "A plugin is nothing but a set of tasks, almost all useful tasks such as compiling tasks, setting domain objects, setting up source files, etc. are handled by plugins. Applying a plugin to a project, allows the plugin to extend the projects capabilities. Plugins can −", 
	    "Gradle provides a command line to execute build script. It can execute more than one task at a time. This chapter explains how to execute multiple tasks using different options.", 
	    "This chapter explains how to build a Java project using Gradle build file. First, we have to add Java plugin to the build script because it provides tasks to compile Java source code, run unit tests, create Javadoc and create a JAR file. Use the following line in build.gradle file.",
	    "This chapter explains how to compile and execute a Groovy project using build.gradle file. The Groovy plug-in for Gradle extends the Java plug-in and provides tasks for Groovy programs. You can use the following line for applying groovy plugin.",
	    "The test task automatically detects and executes all unit tests in the test source set. It also generates a report once test execution is complete. JUnit and TestNG are the supported APIs. The test task provides a Test.getDebug() method that can be set to launch to make the JVM wait for a debugger. Before proceeding to the execution, it sets the debugger post to 5005.",
	   "Gradle can handle smallest and largest projects easily. Small projects have a single build file and a source tree. It is very easy to digest and understand a project that has been split into smaller, inter-dependent modules. Gradle perfectly supports this scenario that is multi-project build.",
	   "Gradle offers several ways to deploy build artifacts repositories. When deploying signatures for your artifacts to a Maven repository, you will also want to sign the published POM file.",
	   "Click Eclipse Marketplace, there you will find the following screenshot. On the left search bar, type buildship. Buildship is a Gradle integration plugin. When you find buildship on your screen, click Install button present on the right side of the screen as shown in the following screenshot."
};


	public static ArrayList<String> getDataset1(int position)
	{
		switch (position)
		{
			case 0: return new ArrayList<String>(Arrays.asList(datasetAndroid1));
			case 1: return new ArrayList<String>(Arrays.asList(datasetJava1));
			case 2: return new ArrayList<String>(Arrays.asList(datasetKotlin1));
			case 3: return new ArrayList<String>(Arrays.asList(datasetSqlite1));
			case 4: return new ArrayList<String>(Arrays.asList(datasetGradle1));
			case 5: return new ArrayList<String>(Arrays.asList(datasetTutorials1));
			case 6: return new ArrayList<String>(Arrays.asList(datasetInterview1));
			default: return null;
		}
	}
	public static ArrayList<String> getDataset2(int position)
	{
		switch (position)
		{
			case 0: return new ArrayList<String>(Arrays.asList(datasetAndroid2));
			case 1: return new ArrayList<String>(Arrays.asList(datasetJava2));
			case 2: return new ArrayList<String>(Arrays.asList(datasetKotlin2));
			case 3: return new ArrayList<String>(Arrays.asList(datasetSqlite2));
			case 4: return new ArrayList<String>(Arrays.asList(datasetGradle2));
			case 5: return new ArrayList<String>(Arrays.asList(datasetTutorials2));
			case 6: return new ArrayList<String>(Arrays.asList(datasetInterview2));
			default: return null;
		}
	}
	
	public static ArrayList<String> getDataset3(int position)
	{
		switch (position)
		{
			case 0: return getAndroid();
			case 1: return getJava();
			case 2: return getKotlin();
			case 3: return getSqlite();
			case 4: return getGradle();
			case 5: return getTutorials();
			case 6: return getInterview();
			default: return null;
		}
	}
	
	public static ArrayList<String> getAndroid()
	{
		ArrayList<String> data = new ArrayList<String>();
		for(int i = 0; i < datasetAndroid1.length; i++)
		{
		  data.add(i, "ad" + (i + 1) + ".html");
		}
		return data;
	}
	public static ArrayList<String> getJava()
	{
		ArrayList<String> data = new ArrayList<String>();
		for(int i = 0; i < datasetJava1.length; i++)
		{
			data.add(i, "jd" + (i + 1) + ".html");
		}
		return data;
	}
	public static ArrayList<String> getKotlin()
	{
		ArrayList<String> data = new ArrayList<String>();
		for(int i = 0; i < datasetKotlin1.length; i++)
		{
			data.add(i, "kotlin/kt" + (i + 1) + ".html");
		}
		return data;
	}
	public static ArrayList<String> getSqlite()
	{
		ArrayList<String> data = new ArrayList<String>();
		for(int i = 0; i < datasetSqlite1.length; i++)
		{
			data.add(i, "sq" + (i + 1) + ".html");
		}
		return data;
	}
	public static ArrayList<String> getTutorials()
	{
		ArrayList<String> data = new ArrayList<String>();
		for(int i = 0; i < datasetTutorials1.length; i++)
		{
			data.add(i, "t" + (i + 1) + ".html");
		}
		return data;
	}
	public static ArrayList<String> getInterview()
	{
		String[] data = { "Interview/android.html", "Interview/java.html", "Interview/kotlin.html", "Interview/sqlite.html" };
		return new ArrayList<String>(Arrays.asList(data));
	}
	public static ArrayList<String> getGradle()
	{
	ArrayList<String> data = new ArrayList<String>();
		for(int i = 0; i < datasetGradle1.length; i++)
		{
			data.add(i, "g" + (i + 1) + ".html");
		}
		return data;
		}
}