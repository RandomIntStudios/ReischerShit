package com.ristudios.objectoriented;

public abstract class Bundy {
    protected final String surname;
    protected String prename;
    protected boolean male;

    public Bundy(String prename, boolean male){
        this.surname = "Bundy";
        this.prename = prename;
        this.male = male;
    }

    public abstract String toText();

}
