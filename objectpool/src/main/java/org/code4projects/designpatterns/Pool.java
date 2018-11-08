package org.code4projects.designpatterns;

import java.util.List;
import java.util.ArrayList;

/*
 * Pool
 *
 * It is the class that implement the Object Pool.
 *
 */
public class Pool<T> {
    /*
     * The class use this interface as Factory method. Client code to
     * instantiate objects of type TouchEvent, for example, can write the
     * following code:
     *
     *    PoolObjectFactory<TouchEvent> factory = 
     *                                   new PoolObjectFactory<TouchEvent>() {
     *        public TouchEvent createObject() {
     *            return new TouchEvent();
     *        }
     *    };
     *    touchEventPool = new Pool<TouchEvent>(factory, 100);
     */
    public interface PoolObjectFactory<T> {
        T createObject();
    }

    // Contain the pool of objects
    private final List<T> freeObjects;
    // keep the factory
    private final PoolObjectFactory<T> factory;
    // size of the pool
    private final int maxSize;

    public Pool(PoolObjectFactory<T> factory, int maxSize) {
        this.factory = factory;
        this.maxSize = maxSize;
        // at the beginning allocate an empty pool
        this.freeObjects = new ArrayList<>(maxSize);
    }

    public T newObject() {
        T object;

        // if an object exists in the pool it is retrieved, otherwise it is
        // created
        if (freeObjects.size() == 0)
            object = factory.createObject();
        else
            object = freeObjects.remove(freeObjects.size() - 1);
        return object;
    }

    public void free(T object) {
        // if there is room in the pool the object is put in the pool
        if (freeObjects.size() < maxSize)
            freeObjects.add(object);
    }
}
