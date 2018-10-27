package org.code4projects.designpatterns;

public class ThreadSingleton {
    // the private static variable referencing the singleton instance
    private static ThreadSingleton instance;

    // the private constructor
    private ThreadSingleton(){}

    // the method used to retrieve the instance
    public static ThreadSingleton getInstance() {
        // the lazy initialization. The instance is crated only when requested
        if(instance == null) {
            // critical region is only the part of code where instance is
            // created once in the application lifecycle
            synchronized (ThreadSingleton.class) {
                instance = new ThreadSingleton();
            }
        }
        return instance;
    }
}
