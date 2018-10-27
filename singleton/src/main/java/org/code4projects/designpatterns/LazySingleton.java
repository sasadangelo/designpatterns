package org.code4projects.designpatterns;

public class LazySingleton {
    // the private static variable referencing the singleton instance
    private static LazySingleton instance;

    // the private constructor
    private LazySingleton(){}

    // the method used to retrieve the instance
    public static LazySingleton getInstance() {
        // the lazy initialization. The instance is crated only when requested
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
