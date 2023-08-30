# Singleton Design Pattern

The Singleton pattern ensures that a class has only one instance (just like having only one librarian in our example) and provides a way to access that instance from anywhere in the program.

1. **One Instance:** With Singleton, no matter how many times you try to create a new instance of a certain class, you'll always get the same instance. It's like having a "special" librarian that everyone shares.

2. **Global Access:** Once you have that one instance, you can easily access it from anywhere in your code. This is useful when multiple parts of your program need to work with the same piece of information.


### Step to create Sigleton Design Pattern


There are two way to create a Singleton Design Pattern
1. Eager Initialization (Eager Loading)
2. Lazy Initialization (Lazy Loading):



#### Eager Initialization (Eager Loading) 
In the eager initialization approach, the Singleton instance is created and initialized at the time the class is loaded, regardless of whether it's going to be used immediately or not. This means that as soon as your program starts, the instance is ready and available for use.

````
    public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // Initialization code
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    // Other methods and properties
    }
````



#### Lazy Initialization (Lazy Loading):
In the lazy initialization approach, the Singleton instance is created and initialized only when it's actually needed for the first time. This can help improve startup times because you're not allocating resources or performing heavy initialization until it's required.


1. Make Constructor private 
2. Object create with the help of method
3. create field to store object is private 

**See below example** 

```
public class LibraryManager {
private static LibraryManager instance;

// Private constructor to prevent direct instantiation
    private LibraryManager() {
// Initialization code goes here
}

// Method to get the single instance of LibraryManager
    public static LibraryManager getInstance() {
        if (instance == null) {
            instance = new LibraryManager();
        }
        return instance;
    }

// Other methods and properties of LibraryManager
// 

}
```

**Note :** using synchronous method we restrict the thread to execute the method one by one , but it may be also block the rest of the code instead of creating object so , we create a synchronous block only.


**NOTE :** Using volatile ensures that changes to the instance are visible across threads, and the double-checked locking pattern helps improve performance.

``````
public class LazySingleton {
private static volatile LazySingleton instance;

    private LazySingleton() {
        // Initialization code
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    // Other methods and properties
}
``````
_In summary,_ the decision between eager and lazy initialization depends on your application's requirements. Eager initialization is suitable when the startup cost is low, and you want to ensure that the instance is ready to use from the beginning. Lazy initialization is preferable when the startup cost is high or the instance might not be needed immediately, helping to improve startup times.

**Note:** _we can break a singleton design pattern using ReflectionAPI in Runtime_