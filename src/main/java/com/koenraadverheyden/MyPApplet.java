package com.koenraadverheyden;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet {

    private PImage kunlaboraLogo;

    @Override
    public void settings() {
        size(400, 400);
    }

    @Override
    public void setup() {
        kunlaboraLogo = loadImage("kunlabora.png");
    }

    @Override
    public void draw() {
        background(0xFF);

        imageMode(CENTER);
        image(kunlaboraLogo, width / 2f, height / 2f);
    }
}
