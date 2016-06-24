/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 18, 2016
 * Version: 1.0
 */
package genericproject;

public class ObjectBox {

    private Object n;

    public void add(Object n) {
        this.n = n;
    }

    public Object get() {
        return n;
    }
}
