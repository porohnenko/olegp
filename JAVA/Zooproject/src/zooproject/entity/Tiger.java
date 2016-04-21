/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooproject.entity;

/**
 *
 * @author olegp
 */
public class Tiger {

    public class Tiger extends Animal {

        private abstract void eat() {
            System.out.println("Tiger is eating...");
        }
    }
