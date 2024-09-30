package creational_dp.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main {
    static void examples_serialization() throws Exception{

        //one way to break sigleton using serialize- deserialize
        singleton serialize=singleton.getInstance();

        ObjectOutputStream obj3=new ObjectOutputStream(new FileOutputStream("object.obj"));
        obj3.writeObject(serialize);
        obj3.close();

        ObjectInputStream obj4=new ObjectInputStream(new FileInputStream("object.obj"));
        singleton deserialize=(singleton)obj4.readObject();
        System.out.println("before serialization: "+serialize.hashCode());
        System.out.println("after serialization: "+deserialize.hashCode());

    }

    static void example_reflections() throws Exception{
        // another way to break singleton using reflections
        Constructor[] constructors_avalConstructors=singleton.class.getDeclaredConstructors();
        Constructor constructor=constructors_avalConstructors[0];
        constructor.setAccessible(true);
        singleton reflection_obj=(singleton)constructor.newInstance();
        singleton normal_object=singleton.getInstance();
        System.out.println("Reflection hash code "+reflection_obj.hashCode());
        System.out.println("Normal Hashcode: "+normal_object.hashCode());

        EnumSingleton.INSTANCE.someMethod();
    }
    public static void main(String[] args) {

        //lazysingleton
       /*  singleton obj1=singleton.getInstance();
        obj1.sample();

        //eager singleton
        singleton_2 obj2=singleton_2.getInstance();
        obj2.sample();*/
        try {
            example_reflections();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

        
    }
}
