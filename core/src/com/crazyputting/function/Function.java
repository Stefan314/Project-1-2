package com.crazyputting.function;

import com.badlogic.gdx.math.Vector3;

public interface Function {

        public double evaluate(Vector3 p);
        public Vector3 gradient(Vector3 p);
}
