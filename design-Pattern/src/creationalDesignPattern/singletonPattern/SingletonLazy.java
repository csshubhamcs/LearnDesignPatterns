package creationalDesignPattern.singletonPattern;

public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    //Constructor
    private SingletonLazy() {
        System.out.println("SingletonP Constructor");
    }


    //Lazy way of creating single object
    // its create when need or after call this method
    public static synchronized SingletonLazy getsingletonP(){
//Object of this class
        if(singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;

    }

}
