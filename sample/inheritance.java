package com.sample;
 class Myexception extends Exception
{
    @Override
    public  String toString()
    {
        return super.toString() + "Hey mama";
    }
    public String ArithmeticException(String s)
    {
        return s;
    }
    public  String getMessage()
    {
        return super.getMessage();
    }
}
class inheritance {
    public static void main(String[] args) {
        int a=100;

        try
        {
            int b=0;
            int resu=a/b;
            System.out.println(resu);
        throw  new Myexception();

        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        int b=0;
        if(b==0)
        {
            try{
                throw ArithmeticException("yes brotjer");
            }
            catch (ArithmeticException e)
            {

            }

        }
        System.out.println("hey mama");
        //derived d=new derived(1);


    }
}
