# Singleton Design Pattern

The Singleton pattern ensures that a class has only one instance (just like having only one librarian in our example) and provides a way to access that instance from anywhere in the program.

1. **One Instance:** With Singleton, no matter how many times you try to create a new instance of a certain class, you'll always get the same instance. It's like having a "special" librarian that everyone shares.

2. **Global Access:** Once you have that one instance, you can easily access it from anywhere in your code. This is useful when multiple parts of your program need to work with the same piece of information.


### Step to create Sigleton Design Pattern

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


