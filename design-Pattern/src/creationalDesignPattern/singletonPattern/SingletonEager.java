package creationalDesignPattern.singletonPattern;

public class SingletonEager {
    //Eager way to create singleton object
    private static final SingletonEager  singletonEager = new SingletonEager();

    public static SingletonEager getSingletonEager(){
        return singletonEager;
    }
}
