package zooproject.entity;

import zooproject.entity.Animal;

public class Monkey extends Animal {

    private abstract void eat() {
        System.out.println("Monkey is eating...");
    }
}
