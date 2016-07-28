package creational.singleton;

public enum SingletonEnum {
    instance;

    SingletonEnum() {
        System.out.println("SingletonEnum constructor");
    }

    public void test(){
        System.out.println("SingletonEnum.test");
    }
}
