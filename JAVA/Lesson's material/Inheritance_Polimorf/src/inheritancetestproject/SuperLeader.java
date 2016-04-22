/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetestproject;

public class SuperLeader extends Leader {

    private String cups;

    public SuperLeader() {
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" + eat in SuperLeader");
    }

    
    
    public SuperLeader(String name,
            String phoneNumber,
            String cups) {
        super(name, phoneNumber);
        this.cups = cups;
        System.out.println("SuperLeader constructor with params");
    }

    public SuperLeader(String phoneNumber) {
        super(phoneNumber);
    }

 }
