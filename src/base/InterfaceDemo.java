package base;

/**
 *
 */
interface I1{
    // 接口只能有常量，默认修饰符public static final
    public static final int x = 1;
    public void func1();
//    public void func2();
}

class C1 implements I1{
    public void func1(){
        System.out.println("base.C1:base.I1");
    }
}

class C2 implements I1{
    public void func1(){
        System.out.println("base.C2:base.I1");
    }
}

public class InterfaceDemo {
    public static void func(I1 i){
        i.func1();
    }
    public static void main(String[] args){
        func(new C1());
    }
}
