package testsinglentonclass;

public class SingletonDemo02 {

    private static class SingletonClassInstance{
        private static final SingletonDemo02 instance = new SingletonDemo02();
    }

    public static SingletonDemo02 getInstance(){
        return SingletonClassInstance.instance;
    }

    private SingletonDemo02(){

    }
}
