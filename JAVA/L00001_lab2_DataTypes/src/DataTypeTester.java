
/**
 * group: PV1-15PO
 *
 * @date 24.02.2016
 * @author Oleg Porohnenko
 * @version 1.0
 */
public class DataTypeTester {

    public static void byteTesting(byte x, byte y) {

        byte z;
        //Arithmetic operators
        System.out.print("\t\"int\" with Arithmetic operators");
        z = (byte) (x + y);
        System.out.printf("\n%d + %d = %d", x, y, z);
        z = (byte) (x - y);
        System.out.printf("\n%d - %d = %d", x, y, z);
        z = (byte) (x * y);
        System.out.printf("\n%d * %d = %d", x, y, z);
        z = (byte) (x / y);
        System.out.printf("\n%d / %d = %d", x, y, z);
        z = (byte) (x % y);
        System.out.printf("\n%d %% %d = %d", x, y, z);
        System.out.printf("\n++%d = %d", z, ++z);
        System.out.printf("\n--%d = %d", z, --z);
        System.out.printf("\n%d++ = %d", z, z++);
        System.out.printf("\n%d-- = %d", z, z--);
        z = (byte) +x;
        System.out.printf("\n+%d = %d", x, z);
        z = (byte) -x;
        System.out.printf("\n-%d = %d", x, z);

        System.out.printf("\n\n\t\"int\" with Relational Operators:");
        System.out.printf("\n%d > %d --> %b", x, y, x > y);
        System.out.printf("\n%d >= %d --> %b", x, y, x >= y);
        System.out.printf("\n%d < %d --> %b", x, y, x < y);
        System.out.printf("\n%d <= %d --> %b", x, y, x <= y);
        System.out.printf("\n%d == %d --> %b", x, y, x == y);
        System.out.printf("\n%d != %d --> %b", x, y, x != y);
        System.out.println("\n");

        System.out.printf("\t\"int\" with Boolean Operators:");
        System.out.printf("\n%d > %d || %d < -%d --> %b", x, y, x, x, x > y || x < -x);
        System.out.printf("\n%d > %d | %d < -%d --> %b", x, y, x, x, x > y | x < -x);
        System.out.printf("\n%d < %d && %d > -%d --> %b", x, y, x, x, x < y && x > -x);
        System.out.printf("\n%d < %d & %d > -%d --> %b", x, y, x, x, x < y & x > -x);
        System.out.printf("\n!(%d > %d) --> %b", x, y, !(x > y));
        System.out.println("\n");

        System.out.printf("\t\"int\" with Ternary Operator:");
        System.out.printf("\n%d > %d ? %d : %d -> %d", x, y, x, y, x > y ? x : y);
        System.out.println("\n");

        System.out.printf("\t\"int\" with Bitwise Operators:\n");
        System.out.println("x = " + x + " --> " + Integer.toBinaryString(x));
        System.out.println("y = " + y + " --> " + Integer.toBinaryString(y));
        System.out.println(x + " & " + y + " = " + (x & y) + " (" + Integer.toBinaryString(x & y) + ")");
        System.out.println(x + " | " + y + " = " + (x | y) + " (" + Integer.toBinaryString(x | y) + ")");
        System.out.println(x + " ^ " + y + " = " + (x ^ y) + " (" + Integer.toBinaryString(x ^ y) + ")");
        System.out.println(x + " << " + y + " = " + (x << y) + " (" + Integer.toBinaryString(x << y) + ")");
        System.out.println(x + " >> " + y + " = " + (x >> y) + " (" + Integer.toBinaryString(x >> y) + ")");
        System.out.println("~" + x + " = " + (~x) + " (" + Integer.toBinaryString(~x) + ")");
        System.out.println("\n");
    }

    public static void shortTesting(short x, short y) {

        short z;

        //Arithmetic operators
        System.out.print("\t\"short\" with Arithmetic operators");

        //Arithmetic operators
        System.out.print("\t\"short\" with Arithmetic operators");
        z = (short) (x + y);
        System.out.printf("\n%d + %d = %d", x, y, z);
        z = (short) (x - y);
        System.out.printf("\n%d - %d = %d", x, y, z);
        z = (short) (x * y);
        System.out.printf("\n%d * %d = %d", x, y, z);
        z = (short) (x / y);
        System.out.printf("\n%d / %d = %d", x, y, z);
        z = (short) (x % y);
        System.out.printf("\n%d %% %d = %d", x, y, z);
        System.out.printf("\n++%d = %d", z, ++z);
        System.out.printf("\n--%d = %d", z, --z);
        System.out.printf("\n%d++ = %d", z, z++);
        System.out.printf("\n%d-- = %d", z, z--);
        z = (short) +x;
        System.out.printf("\n+%d = %d", x, z);
        z = (short) -x;
        System.out.printf("\n-%d = %d", x, z);

        System.out.printf("\n\n\t\"short\" with Relational Operators:");
        System.out.printf("\n%d > %d --> %b", x, y, x > y);
        System.out.printf("\n%d >= %d --> %b", x, y, x >= y);
        System.out.printf("\n%d < %d --> %b", x, y, x < y);
        System.out.printf("\n%d <= %d --> %b", x, y, x <= y);
        System.out.printf("\n%d == %d --> %b", x, y, x == y);
        System.out.printf("\n%d != %d --> %b", x, y, x != y);
        System.out.println("\n");

        System.out.printf("\t\"short\" with Boolean Operators:");
        System.out.printf("\n%d > %d || %d < -%d --> %b", x, y, x, x, x > y || x < -x);
        System.out.printf("\n%d > %d | %d < -%d --> %b", x, y, x, x, x > y | x < -x);
        System.out.printf("\n%d < %d && %d > -%d --> %b", x, y, x, x, x < y && x > -x);
        System.out.printf("\n%d < %d & %d > -%d --> %b", x, y, x, x, x < y & x > -x);
        System.out.printf("\n!(%d > %d) --> %b", x, y, !(x > y));
        System.out.println("\n");

        System.out.printf("\t\"short\" with Ternary Operator:");
        System.out.printf("\n%d > %d ? %d : %d -> %d", x, y, x, y, x > y ? x : y);
        System.out.println("\n");

        System.out.printf("\t\"short\" with Bitwise Operators:\n");
        System.out.println("x = " + x + " --> " + Integer.toBinaryString(x));
        System.out.println("y = " + y + " --> " + Integer.toBinaryString(y));
        System.out.println(x + " & " + y + " = " + (x & y) + " (" + Integer.toBinaryString(x & y) + ")");
        System.out.println(x + " | " + y + " = " + (x | y) + " (" + Integer.toBinaryString(x | y) + ")");
        System.out.println(x + " ^ " + y + " = " + (x ^ y) + " (" + Integer.toBinaryString(x ^ y) + ")");
        System.out.println(x + " << " + y + " = " + (x << y) + " (" + Integer.toBinaryString(x << y) + ")");
        System.out.println(x + " >> " + y + " = " + (x >> y) + " (" + Integer.toBinaryString(x >> y) + ")");
        System.out.println("~" + x + " = " + (~x) + " (" + Integer.toBinaryString(~x) + ")");
        System.out.println("\n");
    }

    public static void intTesting(int x, int y) {

        int z;
        //Arithmetic operators
        System.out.print("\t\"int\" with Arithmetic operators");
        z = x + y;
        System.out.printf("\n%d + %d = %d", x, y, z);
        z = x - y;
        System.out.printf("\n%d - %d = %d", x, y, z);
        z = x * y;
        System.out.printf("\n%d * %d = %d", x, y, z);
        z = x / y;
        System.out.printf("\n%d / %d = %d", x, y, z);
        z = x % y;
        System.out.printf("\n%d %% %d = %d", x, y, z);
        System.out.printf("\n++%d = %d", z, ++z);
        System.out.printf("\n--%d = %d", z, --z);
        System.out.printf("\n%d++ = %d", z, z++);
        System.out.printf("\n%d-- = %d", z, z--);
        z = +x;
        System.out.printf("\n+%d = %d", x, z);
        z = -x;
        System.out.printf("\n-%d = %d", x, z);

        System.out.printf("\n\n\t\"int\" with Relational Operators:");
        System.out.printf("\n%d > %d --> %b", x, y, x > y);
        System.out.printf("\n%d >= %d --> %b", x, y, x >= y);
        System.out.printf("\n%d < %d --> %b", x, y, x < y);
        System.out.printf("\n%d <= %d --> %b", x, y, x <= y);
        System.out.printf("\n%d == %d --> %b", x, y, x == y);
        System.out.printf("\n%d != %d --> %b", x, y, x != y);
        System.out.println("\n");

        System.out.printf("\t\"int\" with Boolean Operators:");
        System.out.printf("\n%d > %d || %d < -%d --> %b", x, y, x, x, x > y || x < -x);
        System.out.printf("\n%d > %d | %d < -%d --> %b", x, y, x, x, x > y | x < -x);
        System.out.printf("\n%d < %d && %d > -%d --> %b", x, y, x, x, x < y && x > -x);
        System.out.printf("\n%d < %d & %d > -%d --> %b", x, y, x, x, x < y & x > -x);
        System.out.printf("\n!(%d > %d) --> %b", x, y, !(x > y));
        System.out.println("\n");

        System.out.printf("\t\"int\" with Ternary Operator:");
        System.out.printf("\n%d > %d ? %d : %d -> %d", x, y, x, y, x > y ? x : y);
        System.out.println("\n");

        System.out.printf("\t\"int\" with Bitwise Operators:\n");
        System.out.println("x = " + x + " --> " + Integer.toBinaryString(x));
        System.out.println("y = " + y + " --> " + Integer.toBinaryString(y));
        System.out.println(x + " & " + y + " = " + (x & y) + " (" + Integer.toBinaryString(x & y) + ")");
        System.out.println(x + " | " + y + " = " + (x | y) + " (" + Integer.toBinaryString(x | y) + ")");
        System.out.println(x + " ^ " + y + " = " + (x ^ y) + " (" + Integer.toBinaryString(x ^ y) + ")");
        System.out.println(x + " << " + y + " = " + (x << y) + " (" + Integer.toBinaryString(x << y) + ")");
        System.out.println(x + " >> " + y + " = " + (x >> y) + " (" + Integer.toBinaryString(x >> y) + ")");
        System.out.println("~" + x + " = " + (~x) + " (" + Integer.toBinaryString(~x) + ")");
        System.out.println("\n");
    }
    
    public static void longTesting(long x, long y) {

        long z;
        //Arithmetic operators
        System.out.print("\t\"long\" with Arithmetic operators");
        z = x + y;
        System.out.printf("\n%d + %d = %d", x, y, z);
        z = x - y;
        System.out.printf("\n%d - %d = %d", x, y, z);
        z = x * y;
        System.out.printf("\n%d * %d = %d", x, y, z);
        z = x / y;
        System.out.printf("\n%d / %d = %d", x, y, z);
        z = x % y;
        System.out.printf("\n%d %% %d = %d", x, y, z);
        System.out.printf("\n++%d = %d", z, ++z);
        System.out.printf("\n--%d = %d", z, --z);
        System.out.printf("\n%d++ = %d", z, z++);
        System.out.printf("\n%d-- = %d", z, z--);
        z = +x;
        System.out.printf("\n+%d = %d", x, z);
        z = -x;
        System.out.printf("\n-%d = %d", x, z);

        System.out.printf("\n\n\t\"long\" with Relational Operators:");
        System.out.printf("\n%d > %d --> %b", x, y, x > y);
        System.out.printf("\n%d >= %d --> %b", x, y, x >= y);
        System.out.printf("\n%d < %d --> %b", x, y, x < y);
        System.out.printf("\n%d <= %d --> %b", x, y, x <= y);
        System.out.printf("\n%d == %d --> %b", x, y, x == y);
        System.out.printf("\n%d != %d --> %b", x, y, x != y);
        System.out.println("\n");

        System.out.printf("\t\"long\" with Boolean Operators:");
        System.out.printf("\n%d > %d || %d < -%d --> %b", x, y, x, x, x > y || x < -x);
        System.out.printf("\n%d > %d | %d < -%d --> %b", x, y, x, x, x > y | x < -x);
        System.out.printf("\n%d < %d && %d > -%d --> %b", x, y, x, x, x < y && x > -x);
        System.out.printf("\n%d < %d & %d > -%d --> %b", x, y, x, x, x < y & x > -x);
        System.out.printf("\n!(%d > %d) --> %b", x, y, !(x > y));
        System.out.println("\n");

        System.out.printf("\t\"long\" with Ternary Operator:");
        System.out.printf("\n%d > %d ? %d : %d -> %d", x, y, x, y, x > y ? x : y);
        System.out.println("\n");

        System.out.printf("\t\"long\" with Bitwise Operators:\n");
        System.out.println("x = " + x + " --> " + Integer.toBinaryString((int) x));
        System.out.println("y = " + y + " --> " + Integer.toBinaryString((int) y));
        System.out.println(x + " & " + y + " = " + (x & y) + " (" + Integer.toBinaryString((int) (x & y)) + ")");
        System.out.println(x + " | " + y + " = " + (x | y) + " (" + Integer.toBinaryString((int) (x | y)) + ")");
        System.out.println(x + " ^ " + y + " = " + (x ^ y) + " (" + Integer.toBinaryString((int) (x ^ y)) + ")");
        System.out.println(x + " << " + y + " = " + (x << y) + " (" + Integer.toBinaryString((int) (x << y)) + ")");
        System.out.println(x + " >> " + y + " = " + (x >> y) + " (" + Integer.toBinaryString((int) (x >> y)) + ")");
        System.out.println("~" + x + " = " + (~x) + " (" + Integer.toBinaryString((int) ~x) + ")");
        System.out.println("\n");
    }

    public static void floatTesting(double x, double y) {
        x = (float) x;
        y = (float) y;
        float z;

        //Arithmetic operators
        System.out.print("\n\t\"float\" with Arithmetic operators");

        z = (float) (y + x);
        System.out.printf("\n%.1f + %.1f = %.1f", x, y, z);
        z = (float) (x - y);
        System.out.printf("\n%.1f - %.1f = %.1f", x, y, z);
        z = (float) (x * y);
        System.out.printf("\n%.1f * %.1f = %f", x, y, z);
        z = (float) (x / y);
        System.out.printf("\n%.1f / %.1f = %.4f", x, y, z);
        z = (float) (x % y);
        System.out.printf("\n%.1f %% %.1f = %.1f", x, y, z);
        System.out.printf("\n++%.1f = %.1f", z, ++z);
        System.out.printf("\n--%.1f = %.1f", z, --z);
        System.out.printf("\n%.1f++ = %.1f", z, z++);
        System.out.printf("\n%.1f-- = %.1f", z, z--);
        z = (float) +x;
        System.out.printf("\n+%.1f = %.1f", x, z);
        z = (float) -x;
        System.out.printf("\n-%.1f = %.1f", x, z);

        System.out.print("\n\t\"float\" with Relational Operators:");
        System.out.printf("\n%.1f > %.1f --> %b", x, y, x > y);
        System.out.printf("\n%.1f >= %.1f --> %b", x, y, x >= y);
        System.out.printf("\n%.1f < %.1f --> %b", x, y, x < y);
        System.out.printf("\n%.1f <= %.1f --> %b", x, y, x <= y);
        System.out.printf("\n%.1f == %.1f --> %b", x, y, x == y);
        System.out.printf("\n%.1f != %.1f --> %b", x, y, x != y);

        System.out.printf("\t\"float\" with Boolean Operators:");
        System.out.printf("\n%.1f > %.1f || %.1f < -%.1f --> %b", x, y, x, x, x > y || x < -x);
        System.out.printf("\n%.1f > %.1f | %.1f < -%.1f --> %b", x, y, x, x, x > y | x < -x);
        System.out.printf("\n%.1f < %.1f && %.1f > -%.1f --> %b", x, y, x, x, x < y && x > -x);
        System.out.printf("\n%.1f < %.1f & %.1f > -%.1f --> %b", x, y, x, x, x < y & x > -x);
        System.out.printf("\n!(%.1f > %.1f) --> %b", x, y, !(x > y));
        System.out.println("\n");

        System.out.printf("\t\"float\" with Ternary Operator:");
        System.out.printf("\n%.1f > %.1f ? %.1f : %.1f -> %.1f", x, y, x, y, x > y ? x : y);
        System.out.println("\n");

    }

    public static void doubleTesting(double x, double y) {

        double z;

        //Arithmetic operators
        System.out.print("\n\t\"double\" with Arithmetic operators");

        z = x + y;
        System.out.printf("\n%.1f + %.1f = %.1f", x, y, z);
        z = x - y;
        System.out.printf("\n%.1f - %.1f = %.1f", x, y, z);
        z = x * y;
        System.out.printf("\n%.1f * %.1f = %.1f", x, y, z);
        z = x / y;
        System.out.printf("\n%.1f / %.1f = %.4f", x, y, z);
        z = x % y;
        System.out.printf("\n%.1f %% %.1f = %.1f", x, y, z);
        System.out.printf("\n++%.1f = %.1f", z, ++z);
        System.out.printf("\n--%.1f = %.1f", z, --z);
        System.out.printf("\n%.1f++ = %.1f", z, z++);
        System.out.printf("\n%.1f-- = %.1f", z, z--);
        z = +x;
        System.out.printf("\n+%.1f = %.1f", x, z);
        z = -x;
        System.out.printf("\n-%.1f = %.1f", x, z);

        System.out.print("\n\n\t\"double\" with Relational Operators:");
        System.out.printf("\n%.1f > %.1f --> %b", x, y, x > y);
        System.out.printf("\n%.1f >= %.1f --> %b", x, y, x >= y);
        System.out.printf("\n%.1f < %.1f --> %b", x, y, x < y);
        System.out.printf("\n%.1f <= %.1f --> %b", x, y, x <= y);
        System.out.printf("\n%.1f == %.1f --> %b", x, y, x == y);
        System.out.printf("\n%.1f != %.1f --> %b", x, y, x != y);

        System.out.printf("\t\"double\" with Boolean Operators:");
        System.out.printf("\n%.1f > %%.1f || %.1f < -%.1f --> %b", x, y, x, x, x > y || x < -x);
        System.out.printf("\n%.1f > %.1f | %.1f < -%.1f --> %b", x, y, x, x, x > y | x < -x);
        System.out.printf("\n%.1f < %.1f && %.1f > -%.1f --> %b", x, y, x, x, x < y && x > -x);
        System.out.printf("\n%.1f < %.1f & %.1f > -%.1f --> %b", x, y, x, x, x < y & x > -x);
        System.out.printf("\n!(%.1f > %.1f) --> %b", x, y, !(x > y));
        System.out.println("\n");

        System.out.printf("\t\"double\" with Ternary Operator:");
        System.out.printf("\n%.1f > %.1f ? %.1f : %.1f -> %.1f", x, y, x, y, x > y ? x : y);
        System.out.println("\n");

    }

    public static void charTesting(char ch0, char ch1) {

        System.out.println("\n\t\"char\" with Arithmetic operators:");
        System.out.println(ch0 + " + " + ch1 + " = " + (ch0 + ch1));
        System.out.println(ch0 + " - " + ch1 + " = " + (ch0 - ch1));
        System.out.println(ch0 + " / " + ch1 + " = " + (ch0 / ch1));
        System.out.println(ch0 + " * " + ch1 + " = " + (ch0 * ch1));
        System.out.println(ch0 + " % " + ch1 + " = " + (ch0 % ch1));
        System.out.println(ch0 + "++" + " = " + (ch0++));
        System.out.println(ch1 + "++" + " = " + (ch1++));
        System.out.println(ch0 + "--" + " = " + (ch0--));
        System.out.println(ch1 + "--" + " = " + (ch1--));
        System.out.println("++" + ch0 + " = " + (++ch0));
        System.out.println("++" + ch1 + " = " + (++ch1));
        System.out.println("--" + ch0 + " = " + (--ch0));
        System.out.println("--" + ch1 + " = " + (--ch1));

        System.out.printf("\n\t\"char\" with Boolean Operator:\n");
        System.out.println(ch0 + " > " + ch1 + " --> " + (ch0 > ch1));
        System.out.println(ch0 + " < " + ch1 + " --> " + (ch0 < ch1));
        System.out.println(ch0 + " >= " + ch1 + " --> " + (ch0 >= ch1));
        System.out.println(ch0 + " <= " + ch1 + " --> " + (ch0 <= ch1));
        System.out.println(ch0 + " == " + ch1 + " --> " + (ch0 == ch1));
        System.out.println(ch0 + " != " + ch1 + " --> " + (ch0 != ch1));

        System.out.printf("\n\t\"char\" with Bitwise Operators:\n");
        System.out.println(ch0 + " << " + ch1 + " = " + (ch0 << ch1) + " (" + Integer.toBinaryString(ch0 << ch1) + ")");
        System.out.println(ch0 + " >> " + ch1 + " = " + (ch0 >> ch1) + " (" + Integer.toBinaryString(ch0 >> ch1) + ")");
        System.out.println(ch0 + " >>> " + ch1 + " = " + (ch0 >>> ch1) + " (" + Integer.toBinaryString(ch0 >>> ch1) + ")");
        System.out.println("~" + ch0 + " --> " + (~ch0) + " (" + Integer.toBinaryString(~ch0) + ")");
        System.out.println("~" + ch1 + " --> " + (~ch1) + " (" + Integer.toBinaryString(~ch1) + ")");
        System.out.println(ch0 + " & " + ch1 + " --> " + (ch0 & ch1) + " (" + Integer.toBinaryString(ch0 & ch1) + ")");
        System.out.println(ch0 + " | " + ch1 + " --> " + (ch0 | ch1) + " (" + Integer.toBinaryString(ch0 | ch1) + ")");
        System.out.println(ch0 + " ^ " + ch1 + " --> " + (ch0 ^ ch1) + " (" + Integer.toBinaryString(ch0 ^ ch1) + ")");

        System.out.println("\n\t\"char\" with cast of types");
        System.out.println(ch0 + " = " + (int) ch0);
        System.out.println(ch1 + " = " + (int) ch1);

        System.out.printf("\n\t\"char\" with Ternary Operator:\n");
        System.out.println(ch0 + " > " + ch1 + " ? " + ch0 + " : " + ch1 + " --> " + (ch0 > ch1 ? ch0 : ch1));
    }

    public static void boolTesting(boolean b1, boolean b2) {
        System.out.printf("\n\t\"boolean\" with Comparison Operations:\n");
        System.out.printf("%b == %b --> %b\n", b1, b2, b1 == b2);
        System.out.printf("%b != %b --> %b\n", b1, b2, b1 != b2);

        System.out.printf("\n\t\"boolean\" with Logic Operations:\n");
        System.out.printf("%b == !%b --> %b\n", b1, b2, b1 == !b2);
        System.out.printf("%b != !%b --> %b\n", b1, b2, b1 != !b2);
        System.out.printf("%b & %b --> %b\n", b1, b2, b1 & b2);
        System.out.printf("%b | %b --> %b\n", b1, b2, b1 | b2);
        System.out.printf("%b ^ %b --> %b\n", b1, b2, b1 ^ b2);
        System.out.printf("(%b>%b) && (%b<%b) --> %b\n", b1, b2, b1, b2, b1 && b2);
        System.out.printf("(%b>%b) || (%b<%b) --> %b\n", b1, b2, b1, b2, b1 || b2);
    }
}
