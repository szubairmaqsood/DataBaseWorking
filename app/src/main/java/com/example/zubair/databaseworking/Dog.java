package com.example.zubair.databaseworking;

public class Dog {
    //Attributes of Dog to be stored

    private String m_Name;
    private String m_breed;
    private String m_Gender;
    private double m_Weight;

    //Accessors and Modifiers of field members

    public Dog()
    {
        this.m_Name="Empty";
        this.m_breed="Empty";
        this.m_Gender="Empty";
        this.m_Weight=0;
    }

    public Dog(String Name,String Breed,String Gender,double Weight)
    {
        this.m_Name=Name;
        this.m_breed=Breed;
        this.m_Gender=Gender;
        this.m_Weight=Weight;

    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public String getM_breed() {
        return m_breed;
    }

    public void setM_breed(String m_breed) {
        this.m_breed = m_breed;
    }

    public String getM_Gender() {
        return m_Gender;
    }

    public void setM_Gender(String m_Gender) {
        this.m_Gender = m_Gender;
    }

    public double getM_Weight() {
        return m_Weight;
    }

    public void setM_Weight(double m_Weight) {
        this.m_Weight = m_Weight;
    }
}
