package creational_dp.Singleton;
// there would be a problem with singleton when dealing with multi threading

import java.io.Serializable;

// therefore this approach is called lazy initialization
public class singleton implements Serializable{
    // this is to prevent the different hascodes being come while serializable and deserializable also makes it point to the same object
    // this method is called during the deserialization of the object,and this calls the already created object
    //this method will not solve the issue when reflections are used
     protected Object readResolve(){
        return getInstance();
    }
   private singleton(){
    }
   private static singleton instance=null;
   public static singleton getInstance(){
    if(instance==null){
        instance=new singleton();
    }
    return instance;
   }
   public void sample(){
       System.out.println("Sample method called");
   }


}
