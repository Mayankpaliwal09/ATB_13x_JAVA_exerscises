package Tasks_java_ATX13.Tasks_1stJuly_constructor;

public class constructor_questions {
//    ✅ 1. What is a constructor in Java?
//    A constructor is a special method used to initialize objects in Java. It is called automatically when an object is created.
//
//    Key Points:
//    Has the same name as the class.
//
//    No return type (not even void).
//
//    Automatically invoked when you create an object.
//
//✅ 2. How is a constructor different from a method?
//    Feature	Constructor	Method
//    Name	Same as class	Any valid identifier
//            Return type	No return type	Must have a return type (or void)
//    When called	Automatically when object is created	Manually called
//    Purpose	Initialize object	Perform actions/operations
//
//✅ 3. What are the different types of constructors in Java?
//    Default Constructor (no arguments)
//
//    Parameterized Constructor (takes arguments)
//
//    Copy Constructor (not built-in, but you can define one yourself)
//
//✅ 4. What is constructor overloading?
//    Constructor overloading means having multiple constructors in a class with different parameter lists.

//    public class Student {
//        Student() {
//            System.out.println("Default constructor");
//        }
//
//        Student(String name) {
//            System.out.println("Name: " + name);
//        }
//    }
//✅ 5. Can a constructor be final, static, or abstract?
//    Modifier	Allowed?	Why?
//    final	❌ No	Constructors can’t be inherited or overridden
//    static	❌ No	Constructors belong to objects, not class
//    abstract	❌ No	Constructors must have a body (can't be abstract)
//
//            ✅ 6. Can we call a constructor explicitly inside another constructor?
//            Yes! Use the keyword this() to call another constructor from the same class.
//
//    public class Example {
//        Example() {
//            this(10); // calling parameterized constructor
//            System.out.println("Default constructor");
//        }
//
//        Example(int x) {
//            System.out.println("Parameterized constructor: " + x);
//        }
//    }
//✅ 7. What happens if you don’t define a constructor in a class?
//    Java automatically provides a default constructor (no-arg constructor) only if no constructor is defined.
}
