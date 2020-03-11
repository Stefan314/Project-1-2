package com.crazyputting.engine;

import com.crazyputting.engine.solver.Euler;
import com.crazyputting.objects.Ball;
import com.crazyputting.objects.Terrain;


public class Engine {
    private Ball ball;
    private Terrain terrain;
    private Euler solver;

    public Engine(Ball yourBall, Terrain yourTerrain, Euler yourSolver) {
        this.ball = yourBall;
        this.terrain = yourTerrain;
        this.solver = yourSolver;
    }

}
