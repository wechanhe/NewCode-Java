package base;

/**
 *
 */
class SuperExample{
    protected int x;
    protected int y;
    public SuperExample(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void func(){
        System.out.println("base.SuperExample.func()");
    }
}

class SuperExtendExample extends SuperExample{
    private int z;
    public SuperExtendExample(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    @Override
    public void func() {
        super.func();
        System.out.println("base.SuperExtendExample.func()");
    }
}

public class SuperDemo {
    public static void main(String[] args){
        SuperExample e = new SuperExtendExample(1,2,3);
        e.func();
    }
}
