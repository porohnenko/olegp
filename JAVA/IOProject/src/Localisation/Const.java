/**
 * Lab work №
 * Theme:
 * Group: PV1-15PO
 * Author: Oleg Porohnenko
 * Date: Jun 15, 2016
 * Version: 1.0
 */
package Localisation;

import java.util.Locale;
import java.util.ResourceBundle;

public class Const {

    public static Locale locale = Locale.getDefault();

    private static ResourceBundle bundle = ResourceBundle.getBundle("student", locale);

    public static final String STUDENT = bundle.getString("student.student");
    public static final String NAME = "student.name";
    public static final String MARK = "student.mark";
    public static final String ABILITY = "student.ability";

}
