package testsinglentonclass;


public class SingletonDemo01 {

    private static SingletonDemo01 instance = null;

    public static SingletonDemo01 getInstance(){
        if (instance == null){
            SingletonDemo01 sd01;
            synchronized (SingletonDemo01.class){
                sd01 = instance;
                if (sd01 == null){
                    synchronized (SingletonDemo01.class){
                        if (sd01 == null){
                            sd01 = new SingletonDemo01();
                        }
                    }
                }
            }
        }
        return instance;
    }

    private SingletonDemo01(){

    }
}
