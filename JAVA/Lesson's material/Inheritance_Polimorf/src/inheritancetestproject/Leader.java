
package inheritancetestproject;


public class Leader extends Student {

    private String phoneNumber;
    public int mark;
    
    public Leader() {
        System.out.println("Leader default constructor");
        super.mark = 10;
    }

    public Leader(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Leader(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
        System.out.println("Leader constructor with params");
    }   
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void eat(){
        super.eat();
        System.out.println("+ eat in Leader...");
    }
    
   
    
}
