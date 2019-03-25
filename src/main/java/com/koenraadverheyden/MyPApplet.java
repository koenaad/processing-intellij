package com.koenraadverheyden;

import processing.core.PApplet;

public class MyPApplet extends PApplet {

    public static PApplet getPApplet() {
        return pApplet;
    }

    private static PApplet pApplet;

    private final boolean captureFrames = false;

    private BouncyImage kunlaBounce;

    @Override
    public void settings() {
        size(400, 400);
    }

    @Override
    public void setup() {
        pApplet = this;

        kunlaBounce = new BouncyImage("kunlabora.png", width / 2f, height / 2f, 50, 50);
    }

    @Override
    public void draw() {
        background(0xFF);

        kunlaBounce.update();
        kunlaBounce.draw(this);

        if (captureFrames) {
            saveFrame("frames/frame-####.gif");
        }
    }
}
