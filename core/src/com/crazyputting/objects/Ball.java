package com.crazyputting.objects;

import com.badlogic.gdx.math.Vector3;

public class Ball {
    private final double mass = 0.0;
    private final double diameter = 0.0;
    private Vector3 velocity = new Vector3();
    private Vector3 position;
    public boolean colliding = false;
    public boolean stopped = false;

    public double getMass(){
        return mass;
    }
    public double getDiameter(){
        return diameter;
    }


}
