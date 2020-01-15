package base;

/**
 *
 */
abstract class AbstractClass{
    private int x;
    public abstract void func1();
    public void func2(){
        System.out.println("func2");
    }
}

class A extends AbstractClass{
    @Override
    public void func1() {
        System.out.println("base.A:func1");
    }
}

class B extends AbstractClass{
    @Override
    public void func1() {
        System.out.println("base.B:func1");
    }
}

public class AbstractDemo{
    public static void func(AbstractClass c){
        c.func1();
    }
    public static void main(String[] args){
        func(new A());
    }
}
