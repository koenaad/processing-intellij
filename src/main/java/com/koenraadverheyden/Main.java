package com.koenraadverheyden;

import processing.core.PApplet;

import java.io.File;

public final class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Expected exactly one argument: the user directory.");
            System.exit(1);
        }
        if (!new File(args[0]).isDirectory()) {
            System.err.println("The supplied argument [" + args[0] + "] is not a valid directory.");
            System.exit(1);
        }

        // This does not always work properly, check PApplet::calcSketchPath for details
        System.setProperty("user.dir", args[0]);

        PApplet.main(MyPApplet.class);
    }
}
