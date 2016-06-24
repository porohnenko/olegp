/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 18, 2016
 * Version: 1.0
 */
package genericproject;

public class SuperBox<T> {

    private T n;

    public void add(T n) {
        this.n = n;
    }

    public T get() {
        return n;
    }

    @Override
    public String toString() {
        return "SuperBox{" + "n=" + n.toString() + '}';
    }
    
    
}
