package com.koenraadverheyden;

import processing.core.PApplet;

import java.io.File;

public final class Main {

    public static void main(String[] args) {
        if (args.length >= 1) {
            if (!new File(args[0]).isDirectory()) {
                System.err.println("The supplied argument [" + args[0] + "] is not a valid directory");
                System.exit(1);
            }

            // This does not always work properly, check PApplet::calcSketchPath for details
            System.setProperty("user.dir", args[0]);

        } else {
            System.out.println("User directory is not set, this might cause issues reading and writing files");
        }

        String javaVersion = System.getProperty("java.version");
        if (!javaVersion.startsWith("1.")) {
            System.err.println("JRE seems to have a higher version then Java 8 [java.version = " + javaVersion + "]. " +
                "This will probably cause trouble down the road...");
        }

        PApplet.main(MyPApplet.class);
    }
}
