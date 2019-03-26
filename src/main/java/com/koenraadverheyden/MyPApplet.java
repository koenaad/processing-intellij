package com.koenraadverheyden;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet {

    private PImage kunlaboraLogo;

    @Override
    public void settings() {
        size(400, 400);
        smooth(8);
    }

    @Override
    public void setup() {
        blendMode(BLEND);

        kunlaboraLogo = loadImage("kunlabora.png");
    }

    @Override
    public void draw() {
        // clear window
        background(0xFF);

        int squareSize = 100;

        // 1 param: gray scale
        // 0x00 = black, 0xFF = white
        stroke(0x00);
        fill(0xCC);

        rect(50, 50, squareSize, squareSize);

        // 3 params: R, G, B
        // 0x00 -> 0xFF = intensity
        stroke(0xFF, 0x33, 0x70);
        fill(0xFF, 0x33, 0x70);

        rect(250, 50, squareSize, squareSize);

        // 4 params: R, G, B, A
        // 0x00 = transparent, 0xFF = solid
        noStroke();
        fill(0xFF, 0x33, 0x70, 0x77);

        rect(25, 225, squareSize, squareSize);
        rect(75, 275, squareSize, squareSize);

        image(kunlaboraLogo, 250, 250, squareSize, squareSize);
    }
}
