/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetestproject;

/**
 *
 * @author olegp
 */
public class Leader extends Student {

    private String phoneNumber;

    public Leader() {
        System.out.println("Leader default c");

    }

    //Student s = new Student();
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Leader(String phoneNumber) {
        super();
    }

    public Leader(String phoneNumber) {
        super();
    }
}
