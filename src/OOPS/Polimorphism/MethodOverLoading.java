package OOPS.Polimorphism;

/*
class having multiple methods with same name but diff no. of arguments or argument type
 */
class Adder{
    static int add(int a,int b) {
        return a+b;
    }
    static int add(int a,int b,int c) {
        return a+b+c;
    }
}

public class MethodOverLoading {
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }
}