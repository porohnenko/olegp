package model.entity.abstractEntity;

public abstract class Duck {

    private Flyable flyable;
    private Quackable quackable;
    
    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }
    
    public void fly(){
        flyable.fly();
    }
    
    public void quack(){
        quackable.quack();
    }
    
    public void swim() {
        System.out.println("I'm swimming...");
    }  

    public abstract void display();
}
