package creational.singleton;

/**
 * Double Checked Locking & volatile
 */
public class SingletonDC {
    private static volatile SingletonDC instance;

    public static SingletonDC getInstance() {
        if (instance == null) {
            synchronized (SingletonDC.class) {
                if (instance == null)
                    instance = new SingletonDC();
            }
        }

        return instance;
    }

    private SingletonDC() {
        System.out.println("SingletonDC constructor");
    }
}
