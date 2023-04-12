package com.versions.javaversions.controller;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VersionControllerJava {



    static final Map<String,String> map16 = Map.of(
            "JEP 356: Enhanced Pseudo-Random Number Generators", "Introduces new interfaces and implementations for random number generation, providing a more flexible and efficient API for generating random values.",
            "JEP 382: New macOS Rendering Pipeline", "Introduces a new rendering pipeline for macOS based on Apple's Metal framework, replacing the existing pipeline based on the deprecated OpenGL.",
            "JEP 389: Foreign Function & Memory API (Second Incubator)", "A second incubator iteration of the Foreign Function & Memory API introduced in Java 16, with improvements based on developer feedback.",
            "JEP 391: macOS/AArch64 Port", "Adds a macOS/AArch64 port to the JDK, enabling Java to run natively on Apple's M1-based Macs.",
            "JEP 411: Deprecate the Security Manager for Removal", "Deprecates the Security Manager and its associated API for future removal, as it has been superseded by other security mechanisms.",
            "JEP 391: Pattern Matching for Switch (Preview)", "Introduces a preview of pattern matching for switch expressions and statements, providing a more concise and flexible syntax for switch constructs.",
            "JEP 394: Strong Encapsulation of JDK Internals (JEP 396)", "Continues the work of JEP 396 by further encapsulating internal elements of the JDK, improving the security and maintainability of the platform."
    );

    static final Map<String,String> map15 = Map.of(
            "Records", "Standardizes the records feature introduced in Java 14 as a preview, providing a compact syntax for declaring classes that hold simple, immutable data.",
            "Pattern Matching for instanceof", "Standardizes the pattern matching feature for 'instanceof' operator, introduced in Java 14 as a preview, simplifying common coding patterns and improving readability.",
            "Sealed Classes", "Standardizes the sealed classes feature introduced in Java 15 as a preview, allowing you to define a restricted set of subclasses for better maintainability and security.",
            "JEP 389: Foreign Function & Memory API (Incubator)", "Introduces a new API that provides a pure Java API for calling native code and working with native memory, as an alternative to the Java Native Interface (JNI).",
            "JEP 393: JEP 390: Warnings for Value-Based Classes", "Introduces warnings for improper use of value-based classes, which are classes for which instances are considered interchangeable based solely on their data.",
            "JEP 396: Strong Encapsulation of JDK Internals", "Further encapsulates internal elements of the JDK to improve the security and maintainability of the platform.",
            "JEP 392: Packaging Tool", "Introduces the 'jpackage' tool for packaging self-contained Java applications, providing a simple way to create platform-specific installers and launchers."
    );



    static final Map<String,String> map14 = Map.of(
            "Sealed Classes (Preview)", "Introduces sealed classes and interfaces, which restrict the classes that can extend or implement them, improving the maintainability and security of your code.",
            "Pattern Matching for instanceof (Second Preview)", "A second preview of the pattern matching feature for 'instanceof' operator, introduced in Java 14, with minor refinements.",
            "Records (Second Preview)", "A second preview of the records feature introduced in Java 14, with minor updates based on developer feedback.",
            "Text Blocks", "Standardizes the text blocks feature introduced in Java 13 as a preview, allowing you to work with multiline string literals easily and effectively.",
            "Eden: A New Garbage Collector", "A new experimental low-latency garbage collector aimed at providing better response times for applications with large heaps.",
            "Deprecate RMI Activation for Removal", "Deprecates the RMI Activation system, with the intent to remove it in a future release.",
            "Hidden Classes", "Introduces hidden classes, which cannot be used directly by the bytecode of other classes, enabling frameworks to generate classes that are not discoverable and do not interfere with user code."
    );

    static final Map<String,String> map13 = Map.of(
            "Pattern Matching for instanceof (Preview)", "Enhances the 'instanceof' operator to improve code readability by introducing pattern matching and eliminating the need for explicit casting.",
            "Records (Preview)", "Introduces a new compact syntax for declaring classes that hold simple, immutable data, reducing boilerplate code and enhancing readability.",
            "Switch Expressions (Second Preview)", "A second preview of the switch expressions feature introduced in Java 13, with some refinements based on developer feedback.",
            "JFR Event Streaming", "Introduces the ability to stream Java Flight Recorder (JFR) events continuously, enabling monitoring tools to analyze and react to events as they occur.",
            "NUMA-Aware Memory Allocation for G1", "Improves the G1 garbage collector's handling of systems with non-uniform memory access (NUMA) architectures, providing better performance and resource usage.",
            "Deprecate the Solaris and SPARC Ports", "Marks the Solaris and SPARC ports as deprecated, with the intent to remove them in a future release.",
            "Remove the Concurrent Mark Sweep (CMS) Garbage Collector", "Removes the CMS garbage collector, which was deprecated in Java 9."
    );


    static final Map<String,String> map12 = Map.of(
            "Switch Expressions (Preview)", "Extends the switch statement to support both traditional and simplified switch expressions, making code more readable and expressive.",
            "Text Blocks (Preview)", "Introduces multiline string literals (text blocks) that can span multiple lines and avoid the need for most escape sequences, making it easier to work with large amounts of text in Java code.",
            "Dynamic CDS Archives", "Enhances the JDK build process to generate class-data-sharing (CDS) archives by default, improving startup performance.",
            "ZGC: Uncommit Unused Memory", "Allows the Z Garbage Collector to return unused heap memory to the operating system, reducing the memory footprint of Java applications.",
            "Reimplement the Legacy Socket API", "Replaces the underlying implementation of the java.net.Socket and java.net.ServerSocket APIs with a simpler, more modern implementation that is easy to debug and maintain."
    );
    static final Map<String,String> map11 = Map.ofEntries(
            Map.entry("Switch Expressions", "Allows for more expressive and concise code when working with switch statements."),
            Map.entry("Compact Number Formatting", "Provides a way to format numbers in a more concise and readable way."),
            Map.entry("Teardown", "Provides a way to clean up after a JUnit test method completes, even if it throws an exception."),
            Map.entry("JVM Constants API", "Provides a standard API for accessing JVM-specific constants, making it easier to write cross-platform code."),
            Map.entry("New String Methods", "Provides several new methods for working with strings, including indent(), transform(), and describeConstable()."),
            Map.entry("Improved Garbage Collection", "Provides better performance and lower latency for garbage collection operations.")
    );


    static final Map<String,String> map10 = Map.of(
            "Local-Variable Syntax for Lambda Parameters", "Allows the use of 'var' in lambda expressions, providing better consistency with local-variable syntax.",
            "Dynamic Class-File Constants", "Introduces a new constant-pool form, CONSTANT_Dynamic, to reduce the cost and disruption of creating new forms of materializable class-file constants.",
            "Epsilon: A No-Op Garbage Collector", "A garbage collector that handles memory allocation without implementing any actual memory reclamation mechanisms, intended for short-lived applications or testing GC performance.",
            "HTTP Client (Standard)", "Standardizes the HTTP Client API introduced in Java 9, providing a modern and performant way to perform HTTP/1.1 and HTTP/2 requests.",
            "Flight Recorder", "A low-overhead, extensible data collection framework for troubleshooting Java applications and the HotSpot JVM.",
            "Launch Single-File Source-Code Programs", "Allows execution of Java source code files directly with the 'java' command, simplifying the execution of small Java programs.",
            "Unicode 10", "Updates the existing platform APIs to support version 10.0 of the Unicode Standard.",
            "JEP 181: Nest-Based Access Control", "Introduces 'nests', a new access control context, that allows classes that are logically part of the same code entity, but are compiled to distinct class files, to access each other's private members."
    );



    static final Map<String,String> map9 = Map.ofEntries(
            Map.entry("Local Variable Type Inference", "Allows for more concise code by inferring the type of a variable based on its initializer."),
            Map.entry("Optional.orElseThrow()", "Allows for more concise and expressive code when dealing with optional values."),
            Map.entry("Local-Variable Syntax for Lambda Parameters", "Improves code readability by enabling the use of the 'var' keyword in lambda expressions."),
            Map.entry("Consolidate the JDK Forest into a Single Repository", "Simplifies the process of building and developing the JDK by consolidating the source code repositories into a single repository."),
            Map.entry("Garbage-Collector Interface", "Allows alternative garbage collectors to be developed and used without requiring changes to the JVM."),
            Map.entry("Parallel Full GC for G1", "Improves G1 garbage collector performance by performing full GC in parallel."),
            Map.entry("Application Class-Data Sharing", "Improves startup time and reduces memory footprint by allowing application class data to be shared among multiple JVM processes."),
            Map.entry("Thread-Local Handshakes", "Allows thread-local storage to be modified by the JVM during handshakes, which can improve performance in certain multi-threaded applications."),
            Map.entry("Remove the Native-Header Generation Tool (javah)", "Removes the javah tool, which is no longer necessary due to changes in the JDK build process."),
            Map.entry("Additional Unicode Language-Tag Extensions", "Adds support for additional Unicode extensions in BCP 47 language tags."),
            Map.entry("Heap Allocation on Alternative Memory Devices", "Allows heap allocation to be performed on non-volatile memory devices, which can improve performance and reduce costs in certain scenarios."),
            Map.entry("Experimental Java-Based JIT Compiler", "Introduces an experimental Java-based JIT compiler, which allows the JVM to be built without the C++ compiler."),
            Map.entry("Root Certificates", "Updates the list of root certificates trusted by the JDK to include additional root certificates."),
            Map.entry("Time-Based Release Versioning", "Introduces a new versioning scheme for the JDK based on time, rather than feature releases.")
    );


    static final Map<String,String> map8 =  Map.of(
            "Java Platform Module System (JPMS)", "Introduces a modular system for organizing and encapsulating Java applications and libraries, improving maintainability, performance, and security.",
            "JShell", "An interactive REPL (Read-Eval-Print Loop) tool for quickly testing and experimenting with Java code snippets.",
            "Improved Javadoc", "Enhancements to Javadoc, including the ability to generate HTML5 output and a search box for easily navigating API documentation.",
            "Private Interface Methods", "Allows private methods in interfaces, enabling better code organization and reuse in interface implementations.",
            "Process API Improvements", "Enhancements to the Process API, making it easier to manage and control operating system processes from Java code.",
            "HTTP/2 Client", "A new HTTP/2 client API, supporting modern web communication standards and providing better performance than the HttpURLConnection API.",
            "Multi-Release JAR Files", "Enables packaging of Java libraries and applications in a single JAR file that works across multiple Java versions.",
            "VarHandles", "A new, more flexible and efficient way to access low-level constructs, such as atomic operations and memory ordering, as an alternative to sun.misc.Unsafe."
    );


    static final Map<String,String> map7 =  Map.of(
            "Lambda Expressions", "Allows for functional programming by treating code as data, making it easier to write and read code that involves passing behavior as arguments to methods.",
            "Streams API", "Provides a way to process large amounts of data in parallel, making it easier to write efficient, concise code for working with collections.",
            "Date and Time API", "Provides a more comprehensive and flexible way to work with dates and times, including support for time zones and more.",
            "Default Methods", "Allows for the addition of new methods to interfaces without breaking existing implementations.",
            "Method References", "Provides a way to refer to methods or constructors without invoking them directly.",
            "Type Annotations", "Allows annotations to be applied to any type use, not just declarations.",
            "Optional", "Provides a way to express the absence of a value without using null.",
            "CompletableFuture", "Provides a way to represent and compose asynchronous operations in a more readable and maintainable way."
    );

    static final Map<String,String> map6 =  Map.of(
                "Diamond Operator", "Simplifies the creation of generic instances by inferring type arguments from the context, reducing verbosity.",
                "Try-With-Resources", "Automatically closes resources used in a try block, such as file streams, network connections, or database resources, when the block exits.",
                "Strings in Switch", "Allows the use of strings in switch-case statements, making the code more readable and cleaner.",
                "Multi-Catch", "Catches multiple exception types in a single catch block, reducing code duplication and enhancing readability.",
                "Fork/Join Framework", "A high-level framework for parallel processing and task decomposition, allowing developers to utilize multicore processors efficiently.",
                "NIO.2", "An improved file system API that provides better support for file attributes, symbolic links, and notification for changes in directories.",
                "Project Coin", "A collection of small language enhancements, such as binary literals, underscore in numeric literals, and improved type inference for generic instance creation.",
                "JVM Enhancements", "Updates to the JVM that improve performance, garbage collection, and support for dynamically-typed languages."
        );

    static final Map<String,String> map5 =  Map.of(
            "Scripting Language Support", "Built-in support for scripting languages, such as JavaScript, through the integration of the Rhino JavaScript engine.",
            "Web Services", "Enhanced support for web services with the introduction of JAX-WS (Java API for XML Web Services).",
            "JDBC 4.0", "Introduced new features and improvements in the Java Database Connectivity API, such as better exception handling, support for annotations, and SQL XML support.",
            "Java Compiler API", "A standardized API for invoking the Java compiler programmatically, allowing developers to compile Java code from within their applications.",
            "Pluggable Annotations", "Support for custom annotation processors, enabling users to generate additional files or validate code based on annotations.",
            "Swing API Improvements", "Several enhancements to the Swing API, including better support for look-and-feel, improved performance, and better integration with the underlying platform.",
            "Security Enhancements", "Improved security features, such as the integration of the Java Authentication and Authorization Service (JAAS) and the Java Secure Socket Extension (JSSE).",
            "Monitoring and Management", "Built-in support for monitoring and managing Java applications through JMX (Java Management Extensions) and the JConsole monitoring tool."
    );

    static final Map<String,String> map4 =  Map.of(
            "Generics", "Introduces type safety for collections and eliminates the need for casting, making the code more readable and less error-prone.",
            "Enhanced for Loop", "A simplified iteration over collections and arrays, making the code more concise and readable.",
            "Autoboxing/Unboxing", "Automatically converts between primitive types and their corresponding wrapper classes, simplifying the code.",
            "Enums", "Provides a type-safe way to define a fixed set of constants, improving code readability and reducing potential errors.",
            "Varargs", "Allows methods to accept a variable number of arguments, making it easier to work with methods that require a varying number of parameters.",
            "Static Imports", "Enables importing static members of a class, allowing for cleaner and more readable code.",
            "Annotations", "Introduces metadata for classes, methods, and fields, which can be used by the compiler or runtime environment for various purposes.",
            "Concurrency Utilities", "A high-level framework for handling concurrent programming, including thread pools, atomic variables, and concurrent data structures."
    );


    static Map<Integer, Map> mapOfMaps = new HashMap<Integer, Map>();

    static {
        mapOfMaps.put(4, map4);
        mapOfMaps.put(5, map5);
        mapOfMaps.put(6, map6);
        mapOfMaps.put(7, map7);
        mapOfMaps.put(8, map8);
        mapOfMaps.put(9, map9);
        mapOfMaps.put(10, map10);
        mapOfMaps.put(11, map11);
        mapOfMaps.put(12, map12);
        mapOfMaps.put(13, map13);
        mapOfMaps.put(14, map14);
        mapOfMaps.put(15, map15);
        mapOfMaps.put(16, map16);
    }

    private static final Map<Integer, Map<String, String>> RELEASE_HISTORY = new HashMap<>();

    static {
        // Winter '07
        Map<String, String> winter07 = new HashMap<>();
        winter07.put("Apex Code", "Introduced as part of the Winter '07 release.");
        RELEASE_HISTORY.put(7, winter07);

        // Summer '08
        Map<String, String> summer08 = new HashMap<>();
        summer08.put("Triggers", "Introduced support for triggers.");
        summer08.put("Workflows", "Introduced support for workflows.");
        summer08.put("Email Templates", "Introduced support for email templates.");
        RELEASE_HISTORY.put(8, summer08);

        // Summer '09
        Map<String, String> summer09 = new HashMap<>();
        summer09.put("Batch Processing", "Introduced support for batch processing.");
        summer09.put("Web Services", "Introduced the ability to call external web services.");
        RELEASE_HISTORY.put(9, summer09);

        // Spring '10
        Map<String, String> spring10 = new HashMap<>();
        spring10.put("Sharing Rules", "Introduced support for sharing rules.");
        spring10.put("Dynamic SOQL", "Introduced support for dynamic SOQL.");
        spring10.put("Scheduled Apex", "Introduced the ability to schedule Apex code to run at specific times.");
        RELEASE_HISTORY.put(10, spring10);

        // Winter '11
        Map<String, String> winter11 = new HashMap<>();
        winter11.put("Visualforce Pages", "Introduced support for Visualforce pages.");
        winter11.put("JavaScript Remoting", "Introduced the ability to call Apex code from JavaScript.");
        winter11.put("Debugging and Testing", "Introduced improvements to debugging and testing tools.");
        RELEASE_HISTORY.put(11, winter11);

        // Summer '12
        Map<String, String> summer12 = new HashMap<>();
        summer12.put("Apex REST", "Introduced support for Apex REST services.");
        summer12.put("Governor Limits", "Introduced improved governor limits.");
        summer12.put("External Data Sources", "Introduced the ability to use Apex to access external data sources.");
        RELEASE_HISTORY.put(12, summer12);

        // Winter '13
        Map<String, String> winter13 = new HashMap<>();
        winter13.put("Chatter", "Introduced support for Chatter.");
        winter13.put("Outbound Messaging", "Introduced the ability to send outbound messages to external systems.");
        winter13.put("Exception Handling and Debugging", "Introduced improvements to exception handling and debugging tools.");
        RELEASE_HISTORY.put(13, winter13);

        // Spring '14
        Map<String, String> spring14 = new HashMap<>();
        spring14.put("Visualforce Components", "Introduced support for Visualforce components.");
        spring14.put("Debugger and Test Runner", "Introduced improvements to the Apex debugger and test runner.");
        spring14.put("Email", "Introduced the ability to use Apex to send email messages.");
        RELEASE_HISTORY.put(14, spring14);

        // Spring '15
        Map<String, String> spring15 = new HashMap<>();
        spring15.put("Lightning Component Framework", "Introduced support for the Lightning Component Framework.");
        spring15.put("Code Editor and Debugger", "Introduced improvements to the Apex code editor and debugger.");
        spring15.put("Email Templates", "Introduced the ability to use Apex to create custom email templates.");
        RELEASE_HISTORY.put(15, spring15);

    }

    @GetMapping(path="versionchangesjava")
    public String versionDifference(@RequestParam("versionEarlier") int versionEarlier,
                                                                              @RequestParam("versionLater") int versionLater,
                                                                              Model model) {
        Map<Integer, Map<String, String>> map = new LinkedHashMap<>();
        map = IntStream.range(versionEarlier,versionLater)
                .mapToObj(i->i).collect(Collectors.toMap(e->e,e->mapOfMaps.get(e)));
        model.addAttribute("map", map);
        return  "display-map.html";
    }

    @GetMapping(path = "versionchangesapex")
    public String versionDifferenceApex ( @RequestParam("versionEarlier") int versionEarlier,
                                      @RequestParam("versionLater") int versionLater,
                                      Model model){
        Map<Integer, Map<String, String>> map = new LinkedHashMap<>();
        map = IntStream.range(versionEarlier, versionLater)
                .mapToObj(i -> i).collect(Collectors.toMap(e -> e, e -> RELEASE_HISTORY.get(e)));
        model.addAttribute("map", map);
        return "display-map.html";
    }

    @GetMapping({"/","/home"})
    public String home(Model model) {

        List<Integer> apexVersions = new ArrayList<>();
        apexVersions.add(7);
        apexVersions.add(8);
        apexVersions.add(9);
        apexVersions.add(10);
        apexVersions.add(11);
        apexVersions.add(12);
        apexVersions.add(13);
        apexVersions.add(14);
        apexVersions.add(15);

        Map<Integer, String> seasonsMap = new HashMap<>();
        seasonsMap.put(4, "Summer");
        seasonsMap.put(5, "Winter");
        seasonsMap.put(6, "Fall");
        // Add more mappings as needed

        model.addAttribute("seasonsMap", seasonsMap);
        model.addAttribute("apexVersions", apexVersions);
        model.addAttribute("javaVersions", new ArrayList<>(mapOfMaps.keySet()));
        return "index.html";
    }
}
