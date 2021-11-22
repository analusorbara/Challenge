package com.analu.challenge2;

public class Information {

    private String name;
    private String nationality;
    private String bigDream;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBigDream() {
        return bigDream;
    }

    public void setBigDream(String bigDream) {
        this.bigDream = bigDream;
    }

    public Information() {

        name = "Analu Sorbara";
        nationality = "Brazilian";
        bigDream = "Being an example of a successful professional for other women who want to start the IT field.";
    }
}
