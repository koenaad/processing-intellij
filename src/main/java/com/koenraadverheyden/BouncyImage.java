package com.koenraadverheyden;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

import static com.koenraadverheyden.MyPApplet.getPApplet;
import static processing.core.PConstants.CORNER;

public class BouncyImage {

    private final PImage image;
    private final int width;
    private final int height;

    private PVector pos;
    private PVector vel;

    public BouncyImage(String file, float x, float y, int height, int width) {
        this.image = getPApplet().loadImage(file);
        this.width = width;
        this.height = height;

        this.pos = new PVector(x, y);
        this.vel = new PVector(randomSpeed(), randomSpeed());
    }

    private float randomSpeed() {
        return getPApplet().random(-2f, 2f);
    }

    public void update() {
        pos.add(vel);

        if (pos.x < 0 || pos.x + width >= getPApplet().width) {
            vel.x *= -1;
        }
        if (pos.y < 0 || pos.y + height >= getPApplet().width) {
            vel.y *= -1;
        }
    }

    public void draw(PApplet p) {
        p.imageMode(CORNER);
        p.image(image, pos.x, pos.y, width, height);
    }
}
