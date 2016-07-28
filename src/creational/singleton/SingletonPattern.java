package creational.singleton;

public class SingletonPattern {

    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.instance;
        SingletonEnum otherSingletonEnum = SingletonEnum.instance;

        System.out.println(singletonEnum.equals(otherSingletonEnum) + System.getProperty("line.separator"));

        ////

        Singleton singleton = Singleton.getInstance();
        Singleton otherSingleton = Singleton.getInstance();

        System.out.println(singleton.equals(otherSingleton) + System.getProperty("line.separator"));


        ////

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazy otherSingletonLazy = SingletonLazy.getInstance();

        System.out.println(singletonLazy.equals(otherSingletonLazy) + System.getProperty("line.separator"));

        ////

        SingletonDC singletonDC = SingletonDC.getInstance();
        SingletonDC otherSingletonDC = SingletonDC.getInstance();

        System.out.println(singletonDC.equals(otherSingletonDC));
    }
}
