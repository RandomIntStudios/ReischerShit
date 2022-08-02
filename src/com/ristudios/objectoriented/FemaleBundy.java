package com.ristudios.objectoriented;

public class FemaleBundy extends Bundy{
    @Override
    public String toText() {
        return "Mrs. " + prename + " " + surname;
    }

    public FemaleBundy(String prename){
        super(prename, false);
    }
}
