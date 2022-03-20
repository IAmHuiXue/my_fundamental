
public class StaticVsFinal {
    // The static keyword means the value is the same for every instance of the class.
    // You shouldn’t declare a static variable within the method, block, or constructor.
    // So, if we won’t initialize a static variable, then JVM will initialize it and provides the default value.
    //
    //  The final keyword means once the variable is assigned a value it can never be changed.
    //
    //  The combination of static final in Java is how to create a CONSTANT value.
    //
    // But if we are declaring a static variable with final keyword then JVM will not provide the default value.
    // We must need to initialize a static final variable because JVM will not provide a default value to it.
    // A static final variable is a compile-time constant because it loads in memory when a class loads to memory.


    /** since x is a static variable, it makes more sense to initialize it during declaration, and not within the constructor */
    static int x = 3;
    /** int y must be initialized either within the class or within the constructor */
    final int y;
    /** we have to initialize a static final variable (aka constant) when declaring it,
     * or another way is to initialize it inside a static block */
//    static final int Z = 1;
    static final int Z;
    static {
        Z = x; // -> initialize z until when x is initialized
    }
    public StaticVsFinal() {
//         x = 1; // --> this is not good, we should not change a static variable when creating an instance
         y = 3; // --> if y is not initialized during declaration, it has to be initialized during constructing
//         Z = 4; // --> WRONG static final variable cannot be left un-initialized until constructing
    }
}

