package org.example;
public class Dev {


    private  int age= 8;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    private Computer comp;





    public Dev()
    {

        System.out.println("Dev Constructor");

    }



    public void build()
    {
        System.out.println("Working on Spring boot");
        comp.compile();

    }

}
