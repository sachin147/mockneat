package com.mockneat.sources.alphabets;

/**
 * Created by andreinicolinciobanu on 20/12/2016.
 */
public enum Colors {

    ABSOLUTE_ZERO("Absolute Zero", "#0048BA", 0, 28, 73, 217),
    ACID_GREEN("Acid Green", "#B0BF1A", 69, 75, 10, 65),
    AERO("Aero", "#7CB9E8", 49, 73, 91, 206),
    AERO_BLUE("Aero Blue", "#C9FFE5", 79, 100, 90, 151),
    AFRICAN_VIOLET("African Violet", "#B284BE", 70, 52, 75, 288),
    AIR_FORCE_BLUE_RAF("Air Force Blue (RAF)", "#5D8AA8", 36, 54, 66, 204),
    AIR_FORCE_BLUE_USAF("Air Force Blue (USAF)", "#00308F", 0, 19, 56, 220);
    //TODO complete the rest

    private String name;
    private String hex;
    private int R;
    private int G;
    private int B;
    private int hue;

    Colors(String name, String hex, int r, int g, int b, int hue) {
        this.name = name;
        this.hex = hex;
        R = r;
        G = g;
        B = b;
        this.hue = hue;
    }

    public String getName() {
        return name;
    }

    public String getHex() {
        return hex;
    }

    public int getR() {
        return R;
    }

    public int getG() {
        return G;
    }

    public int getB() {
        return B;
    }

    public int getHue() {
        return hue;
    }
}