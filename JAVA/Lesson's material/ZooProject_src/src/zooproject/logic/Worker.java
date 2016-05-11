
package zooproject.logic;

import zooproject.abstraction.Eatable;

public class Worker {
    public static void just_do_it(Eatable e){
        int n = Eatable.SIZE;
        e.eat();
    }
}
