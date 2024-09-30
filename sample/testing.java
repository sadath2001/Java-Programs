package com.sample;
class example{
    private int id;
    private  String name;

    public  String getName() {
        return name;
    }
    public  int getID() {
        return id;
    }
    public  void setID(int a) {
        id=a;
    }
    public  void setName(String name) {
        this.name=name;
    }
}
public class testing {
    public static void main(String[] args) {
        example inst=new example();
        inst.setID(12);
        System.out.println(inst.getID());
        example isn2=new example();
        System.out.println(isn2.getID());
        inst.setName("Sa");
        inst.getName();
    }
}
