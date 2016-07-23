package creational.singleton;

public class SingletonLazy {

    private static class SingletonLazyHolder {
        public static final SingletonLazy instance = new SingletonLazy();
    }

    private SingletonLazy() {
        System.out.println("SingletonLazy constructor");
    }

    public static SingletonLazy getInstance() {
        return SingletonLazyHolder.instance;
    }
}
