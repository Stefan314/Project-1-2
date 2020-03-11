package com.crazyputting.objects;

import com.badlogic.gdx.math.Vector3;


public class Terrain {
    private double height;
    private double width;
    private Vector3 startPos;
    private Vector3 endPos;

    public Terrain(double ourHeight, double ourWidth, Vector3 startingPoint, Vector3 endingPoint) {
        this.height = ourHeight;
        this.width = ourWidth;
        this.startPos = startingPoint;
        this.endPos = endingPoint;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Vector3 getStartPos() {
        return startPos;
    }

    public Vector3 getEndPos() {
        return endPos;
    }
}
