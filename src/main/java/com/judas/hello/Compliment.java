package com.judas.hello;

public class Compliment {

    private String text;
    Compliment(String text){this.text = text;}

    Compliment() {}

    public String getText(){ return text; }

    public void setText(String text) {this.text = text;}
}
