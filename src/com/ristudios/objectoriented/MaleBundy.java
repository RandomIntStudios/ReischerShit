package com.ristudios.objectoriented;

public class MaleBundy extends Bundy{

    @Override
    public String toText() {
        return "Mr. " +prename + " " + surname;
    }

    public MaleBundy(String prename){
        super(prename, true);
    }

}
