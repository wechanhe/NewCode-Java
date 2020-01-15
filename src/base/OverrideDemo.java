package base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 */
class SuperClass{
    protected List<Integer> func() throws Throwable{
        return new ArrayList<>();
    }
}

class SubClass extends SuperClass{
    public ArrayList<Integer> func() throws Exception{
        return new ArrayList<>();
    }
}

public class OverrideDemo {
}
