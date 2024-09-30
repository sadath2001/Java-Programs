package com.sample;
class example1{
    int id;
    String name;
    public example1(int a,String b)
    {
        this.id=a;
        name=b;
    }
}
public class constructor {
    public static void main(String[] args) {
        example1 obj=new example1(12,"Sadath");
        System.out.println(obj.id);
        System.out.println(obj.name);
    }
}
