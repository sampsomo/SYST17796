package studentlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class Student {
    private String name;
    private int ID;
    private String DoB;
    int maxHours;
    
    public Student()
    {
        name = "Name Not Set";
        ID = 0;
    }
    //main constractor 
    public Student(String givenName, int givenID)
    {
          this.name = givenName;
          this.ID = givenID;
    }
    //this method set the value of the name propety
    //we dont neet to use this because we are using different name 
    public void setName(String givenName)
    {
       name = givenName;
    }
    
    public String getName()
    {
           return name;
    }
    
    public void setID (int givenID)
    {
        this.ID = givenID;
    }
    
    public int getID ()
    {   
        return ID;
    }

    /**
     * @return the DoB
     */
    public String getDoB() {
        return DoB;
    }
    public String toString(){
    return "student";
}

    /**
     * @param DoB the DoB to set
     */
    public String toString(){
        return "student";
    }
    /*public void setDoB(String DoB) {
        this.DoB = DoB;
    }*/
}
