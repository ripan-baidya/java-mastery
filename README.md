# Java Mastery - Complete Core Java Reference Guide

A comprehensive collection of Java programs, concepts, and code snippets designed for interview preparation, quick
revision,
and mastering core Java fundamentals. Whether you're a beginner starting your Java journey or an experienced developer
preparing
for interviews, this repository serves as your complete reference guide.

## 📚 Table of Contents

- [About This Repository](#about-this-repository)
- [How to Use This Repository](#how-to-use-this-repository)
- [Topics Covered](#topics-covered)
- [Repository Structure](#repository-structure)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)

## About This Repository

This repository contains well-organized, practical Java code examples covering all essential core Java concepts. Each
topic includes:

- Clear, commented code examples
- Explanation of key concepts
- Common interview questions
- Best practices and pitfalls to avoid
- Real-world use cases

## How to Use This Repository

**For Beginners:** Follow the topics in sequential order as listed below. Each section builds upon previous concepts,
providing a structured learning path.

**For Interview Preparation:** Navigate directly to specific topics you want to revise. Each folder contains
ready-to-run examples that demonstrate key concepts.

**For Quick Reference:** Use the comprehensive code snippets to quickly recall syntax, patterns, and implementations.

## Topics Covered

### 1. Java Basics & Fundamentals

**Folder:** `java-basics/`

Start your Java journey here with foundational concepts:

- **Setup & Environment**
    - JDK installation and configuration
    - IDE setup (Eclipse, IntelliJ IDEA, VS Code)
    - First Java program (Hello World)
    - Compilation and execution process

- **Basic Syntax**
    - Variables and data types (primitive and reference)
    - Operators (arithmetic, relational, logical, bitwise)
    - Type casting and conversion
    - Input/output operations (Scanner, BufferedReader)

- **Control Flow Statements**
    - if-else statements
    - switch-case statements
    - Loops (for, while, do-while, enhanced for)
    - Break and continue statements
    - Labeled statements

- **Arrays**
    - Single-dimensional arrays
    - Multi-dimensional arrays
    - Array manipulation and common operations
    - Anonymous arrays

### 2. Object-Oriented Programming (OOP)

**Folder:** `oops-concepts/`

Master the four pillars of OOP and related concepts:

- **Classes and Objects**
    - Class structure and components
    - Object creation and initialization
    - Instance vs static members
    - this keyword
    - Constructors (default, parameterized, copy constructor)
    - Constructor chaining

- **Encapsulation**
    - Access modifiers (private, default, protected, public)
    - Getters and setters
    - Data hiding principles
    - Bean/POJO classes

- **Inheritance**
    - Single, multilevel, hierarchical inheritance
    - super keyword
    - Method overriding
    - Constructor behavior in inheritance
    - final keyword (classes, methods, variables)
    - Object class methods

- **Polymorphism**
    - Compile-time polymorphism (method overloading)
    - Runtime polymorphism (method overriding)
    - Dynamic method dispatch
    - Covariant return types

- **Abstraction**
    - Abstract classes and methods
    - Interface basics
    - Interface evolution (Java 8+)
    - Abstract class vs interface
    - Multiple inheritance through interfaces

- **Additional OOP Concepts**
    - Composition vs inheritance
    - Association, aggregation, and composition
    - Inner classes (member, static, local, anonymous)
    - Package organization
    - Import statements

### 3. String Handling

**Folder:** `strings/`

Deep dive into String manipulation:

- **String Basics**
    - String creation methods
    - String pool and memory management
    - Immutability concept
    - String comparison (==, equals(), compareTo())

- **String Operations**
    - Common String methods
    - String concatenation approaches
    - String searching and indexing
    - String splitting and joining

- **StringBuilder and StringBuffer**
    - Mutable strings
    - Performance comparison
    - Thread safety considerations
    - Common methods and use cases

- **String Formatting**
    - String.format() method
    - printf() style formatting
    - StringBuilder formatting

### 4. Exception Handling

**Folder:** `exception-handling/`

Learn robust error handling mechanisms:

- **Exception Hierarchy**
    - Throwable, Error, and Exception classes
    - Checked vs unchecked exceptions
    - Common exception types

- **Exception Handling Mechanisms**
    - try-catch blocks
    - Multiple catch blocks
    - finally block
    - try-with-resources (Java 7+)
    - Nested try blocks

- **Throwing Exceptions**
    - throw keyword
    - throws clause
    - Exception propagation

- **Custom Exceptions**
    - Creating user-defined exceptions
    - Best practices for custom exceptions
    - Exception chaining

### 5. Collections Framework

**Folder:** `collections/`

Master Java's powerful data structure library:

- **Collection Hierarchy**
    - Collection interface overview
    - Iterable and Iterator interfaces
    - Collection framework architecture

- **List Interface**
    - ArrayList implementation and use cases
    - LinkedList implementation and use cases
    - Vector and Stack (legacy classes)
    - List vs Set vs Map comparison
    - Common List operations

- **Set Interface**
    - HashSet implementation
    - LinkedHashSet for insertion order
    - TreeSet for sorted elements
    - Set operations and use cases

- **Queue Interface**
    - Queue basics
    - PriorityQueue implementation
    - Deque interface
    - ArrayDeque implementation

- **Map Interface**
    - HashMap implementation and internal working
    - LinkedHashMap for insertion order
    - TreeMap for sorted keys
    - Hashtable (legacy, synchronized)
    - Map operations and iterations

- **Utility Classes**
    - Collections utility methods
    - Arrays utility methods
    - Sorting and searching
    - Comparable vs Comparator

- **Advanced Topics**
    - Custom sorting with Comparator
    - Fail-fast vs fail-safe iterators
    - Concurrent collections overview

### 6. Generics

**Folder:** `generics/`

Understand type-safe programming:

- **Generic Basics**
    - Why generics?
    - Generic classes
    - Generic methods
    - Generic interfaces

- **Type Parameters**
    - Bounded type parameters
    - Multiple bounds
    - Wildcard types (?, extends, super)
    - Type erasure concept

- **Real-world Applications**
    - Generic collections
    - Generic utility methods
    - Best practices and limitations

### 7. Multithreading and Concurrency

**Folder:** `multithreading/`

Master concurrent programming in Java:

- **Thread Basics**
    - Process vs thread
    - Thread lifecycle
    - Creating threads (Thread class, Runnable interface)
    - Thread priorities
    - Daemon threads

- **Thread Synchronization**
    - Race conditions and critical sections
    - synchronized keyword (method and block)
    - Inter-thread communication (wait, notify, notifyAll)
    - Deadlock, starvation, and livelock

- **Java Concurrency API (java.util.concurrent)**
    - Executor framework
    - Thread pools (ExecutorService)
    - Callable and Future
    - CountDownLatch, CyclicBarrier
    - Semaphore

- **Concurrent Collections**
    - ConcurrentHashMap
    - CopyOnWriteArrayList
    - BlockingQueue implementations

- **Advanced Topics**
    - Volatile keyword
    - Atomic classes
    - ReentrantLock
    - ThreadLocal
    - Fork/Join framework

### 8. File Handling and I/O

**Folder:** `file-io/`

Learn input/output operations and file management:

- **File Operations**
    - File class operations
    - Creating, deleting, renaming files
    - Directory operations
    - File properties and metadata

- **Byte Streams**
    - InputStream and OutputStream
    - FileInputStream and FileOutputStream
    - BufferedInputStream and BufferedOutputStream
    - Data streams

- **Character Streams**
    - Reader and Writer
    - FileReader and FileWriter
    - BufferedReader and BufferedWriter
    - PrintWriter

- **Object Serialization**
    - Serializable interface
    - ObjectInputStream and ObjectOutputStream
    - transient keyword
    - Custom serialization

- **NIO (New I/O)**
    - Path and Files classes
    - Reading and writing with NIO
    - File operations with NIO.2

### 9. Java 8 Features

**Folder:** `java8-features/`

Explore modern Java programming paradigms:

- **Lambda Expressions**
    - Lambda syntax and structure
    - Functional interfaces
    - Method references (static, instance, constructor)
    - Lambda vs anonymous classes

- **Functional Interfaces**
    - Predicate, Function, Consumer, Supplier
    - BiPredicate, BiFunction, BiConsumer
    - UnaryOperator, BinaryOperator
    - Creating custom functional interfaces

- **Stream API**
    - Stream creation methods
    - Intermediate operations (filter, map, flatMap, sorted, distinct)
    - Terminal operations (forEach, collect, reduce, count, min, max)
    - Collectors utility
    - Parallel streams
    - Stream best practices

- **Optional Class**
    - Creating Optional objects
    - Optional methods (isPresent, orElse, orElseGet, ifPresent)
    - Avoiding NullPointerException
    - Optional best practices

- **Default and Static Methods in Interfaces**
    - Default methods in interfaces
    - Static methods in interfaces
    - Multiple inheritance handling

- **Date and Time API**
    - LocalDate, LocalTime, LocalDateTime
    - ZonedDateTime
    - Period and Duration
    - Date formatting and parsing
    - Temporal adjusters

### 10. Java 9+ Features

**Folder:** `java9-plus-features/`

Modern Java enhancements:

- **Java 9**
    - Module system basics
    - Private methods in interfaces
    - Try-with-resources improvements
    - Collection factory methods
    - Stream API enhancements

- **Java 10+**
    - Local variable type inference (var keyword)
    - Unmodifiable collections
    - Optional enhancements

- **Recent Features Overview**
    - Records (Java 14+)
    - Switch expressions (Java 14)
    - Text blocks (Java 15)
    - Pattern matching for instanceof (Java 16)
    - Sealed classes (Java 17)

### 11. Design Patterns (Might Not here)

**Folder:** `design-patterns/`

Common software design patterns in Java:

- **Creational Patterns**
    - Singleton pattern
    - Factory pattern
    - Abstract Factory pattern
    - Builder pattern
    - Prototype pattern

- **Structural Patterns**
    - Adapter pattern
    - Decorator pattern
    - Facade pattern
    - Proxy pattern

- **Behavioral Patterns**
    - Observer pattern
    - Strategy pattern
    - Command pattern
    - Template method pattern

### 12. Important Utility Classes

**Folder:** `utility-classes/`

Essential Java utilities:

- **Math Operations**
    - Math class methods
    - Random number generation
    - BigInteger and BigDecimal

- **Regular Expressions**
    - Pattern and Matcher classes
    - Common regex patterns
    - Validation examples

- **Date and Calendar (Legacy)**
    - Date class
    - Calendar class
    - SimpleDateFormat

### 13. Common Interview Programs

**Folder:** `interview-programs/`

Frequently asked coding problems:

- String manipulation programs
- Array manipulation programs
- Number programs (prime, palindrome, Armstrong, etc.)
- Pattern printing programs
- Sorting and searching algorithms
- Data structure implementations
- Logical programming challenges

### 14. Best Practices and Code Quality

**Folder:** `best-practices/`

Professional coding standards:

- Naming conventions
- Code organization
- SOLID principles
- Clean code principles
- Exception handling best practices
- Memory management tips
- Performance optimization techniques

## Repository Structure

```
src/
└── |
    ├── basics/
    │   ├── HelloWorld.java
    │   ├── DataTypes.java
    │   ├── Operators.java
    │   └── ControlFlow.java
    │
    ├── oops/
    │   ├── encapsulation/
    │   ├── inheritance/
    │   ├── polymorphism/
    │   └── abstraction/
    │
    ├── strings/
    │   ├── StringBasics.java
    │   ├── StringMethods.java
    │   └── StringBuilderDemo.java
    │
    ├── exceptions/
    │   ├── ExceptionTypes.java
    │   ├── CustomException.java
    │   └── TryWithResources.java
    │
    ├── collections/
    │   ├── list/
    │   ├── set/
    │   ├── map/
    │   └── queue/
    │
    ├── generics/
    │   ├── GenericClass.java
    │   ├── GenericMethod.java
    │   └── WildcardDemo.java
    │
    ├── concurrency/
    │   ├── basics/
    │   ├── synchronization/
    │   └── concurrentapi/
    │
    ├── io/
    │   ├── bytestreams/
    │   ├── characterstreams/
    │   └── serialization/
    │
    ├── java8/
    │   ├── lambda/
    │   ├── streams/
    │   ├── optional/
    │   └── datetime/
    │
    ├── modernjava/
    │   ├── modules/
    │   ├── varkeyword/
    │   └── records/
    │
    ├── designpatterns/
    │   ├── creational/
    │   ├── structural/
    │   └── behavioral/
    │
    ├── utilities/
    │   ├── math/
    │   ├── regex/
    │   └── datecalendar/
    │
    ├── interviews/
    │   ├── strings/
    │   ├── arrays/
    │   └── numbers/
    │
    ├── bestpractices/
    │   └── codingstandards/
    │
    └── README.md

```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or text editor
- Basic understanding of programming concepts

### Running the Examples

1. Clone the repository:

```bash
git clone https://github.com/ripan-baidya/java-mastery.git
cd java-mastery
```

2. Navigate to any package :

```bash
cd java-basics
```

3. Compile and run Java files:

```bash
javac HelloWorld.java
java HelloWorld
```

### Learning Path for Beginners

Follow this recommended sequence for systematic learning:

1. Start with **Java Basics** (Folder 01)
2. Master **OOP Concepts** (Folder 02)
3. Learn **String Handling** (Folder 03)
4. Understand **Exception Handling** (Folder 04)
5. Deep dive into **Collections Framework** (Folder 05)
6. Explore **Generics** (Folder 06)
7. Master **Multithreading** (Folder 07)
8. Learn **File I/O Operations** (Folder 08)
9. Adopt **Java 8 Features** (Folder 09)
10. Explore **Modern Java Features** (Folder 10)
11. Study **Design Patterns** (Folder 11)
12. Practice with **Interview Programs** (Folder 13)

## Contributing

Contributions are welcome! If you'd like to add new examples, improve existing code, or fix issues:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a Pull Request

Please ensure your code:

- Follows Java naming conventions
- Includes clear comments and documentation
- Is properly tested
- Includes a brief description of what it demonstrates

## License

This project is licensed under the MIT License - see the LICENSE file for details.

---

## 📝 Notes

- Each Java file includes detailed comments explaining the concepts
- Examples are designed to be self-contained and easy to understand
- Code follows industry-standard best practices
- Regular updates will be made to include new Java features and improvements

## 🎯 Goals

- Provide a comprehensive Java learning resource
- Help developers prepare for technical interviews
- Serve as a quick reference guide for Java concepts
- Build a community-driven knowledge base

## 📧 Contact

For questions, suggestions, or feedback, please open an issue in the repository.

**Email**: [official.ripanbaidya@gmail.com](mailto:official.ripanbaidya@gmail.com)

---

**Happy Coding! 🚀**

*Remember: Consistency is key. Practice regularly, understand concepts deeply, and you'll master Java in no time!*