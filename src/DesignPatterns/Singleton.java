package DesignPatterns;

class SingletonClass {

    private static SingletonClass singletonObj = null;

    String s;
    private SingletonClass() {
        s = "This is singleton class obj";
    }

    static SingletonClass getSingletonObj() {
        if(singletonObj==null) {
            singletonObj = new SingletonClass();
        }
        return singletonObj;
    }
}

public class Singleton {
    public static void main(String[] args) {
        SingletonClass x = SingletonClass.getSingletonObj();
        SingletonClass y = SingletonClass.getSingletonObj();

        if(x==y) {
            System.out.println("Both x & y pointing to same memory location on heap");
        }
        else {
            System.out.println("x & y pointing to different memory location on heap");
        }
    }
}