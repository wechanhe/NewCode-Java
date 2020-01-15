package base;

/**
 *
 */
public class Demo {
    public static void main(String[] args){
//        Integer x = new Integer(123);
//        Integer y = new Integer(123);
//        System.out.println(x==y);
//        Integer z = Integer.valueOf(123);
//        Integer k = Integer.valueOf(123);
//        System.out.println(z==k);

        // String Pool
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1.hashCode()+","+s2.hashCode()+","+s1==s2);
        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println(s3==s4);
    }
}
