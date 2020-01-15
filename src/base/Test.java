package base;

/**
 *
 */

abstract class Cat {
    public Cat(){

    }
    public static void sayHi() {
        System.out.println("abstract class");
    }
}

interface myInterface{
    public void say();
}

public class Test extends Cat implements myInterface{
    @Override
    public void say() {
        System.out.println("override");
    }

    public static void main(String[] args){
        Test test = new Test();
        test.sayHi();
    }
}
