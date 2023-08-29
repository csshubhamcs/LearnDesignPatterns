package creationalDesignPattern.singletonPattern;

public class SingletonExample {
    public static void main(String[] args) {

   // Lazy
       SingletonLazy singletonLazy1 =  SingletonLazy.getsingletonP();

        SingletonLazy singletonLazy2 =  SingletonLazy.getsingletonP();
        System.out.println(singletonLazy1 == singletonLazy2);
        System.out.println(singletonLazy1.equals(singletonLazy2));
        System.out.println(singletonLazy1.hashCode());
        System.out.println(singletonLazy2.hashCode());


        //Eager
       SingletonEager singletonEager1 =  SingletonEager.getSingletonEager();
       System.out.println(singletonEager1.hashCode());
       SingletonEager singletonEager2 =  SingletonEager.getSingletonEager();
        System.out.println(singletonEager2.hashCode());
        System.out.println(singletonEager2.equals(singletonEager1));


    }
}
