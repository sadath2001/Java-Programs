package creational_dp.Singleton;

import java.io.Serializable;

public class syncronized_singleton implements Serializable{
    private static syncronized_singleton instance;
    private syncronized_singleton() {
    }

    // approach 1: this will make the entire method synchronized i.e all threads even if the object is crated should wait individually
    public static synchronized syncronized_singleton getInstance() {
        if (instance == null) {
            instance = new syncronized_singleton();
        }
        return instance;
    }

    //approach2: this will make the object synchronized i.e only while creating object should wait
    public static syncronized_singleton getInstance2() {
        if (instance == null) {
            synchronized (syncronized_singleton.class) {
                if (instance == null) {
                    instance = new syncronized_singleton();
                }
            }
        }
        return instance;
    }
    public void sample() {
        System.out.println("This is a synchronized singleton class");
    }
}


//ps: even if the program is syncronized, it can break by using serialization i.e converting the object to byte form and transfering
// basically object -> byte form -> transfer over network -> recieve the file -> byte form -> back to object