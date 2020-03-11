package com.crazyputting.states.menus;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.crazyputting.CrazyPutting;
import com.crazyputting.managers.GameStateManager;

public class MainMenu extends GameState {
    private SpriteBatch spriteBatch;
    private final String title = "CrazyPutting";
    private Stage stage;
    private Skin skin;
    private TextureAtlas atlas;
    private Viewport viewport;
    private Texture img;
    private Image background;
    private BitmapFont comicFont;

    public MainMenu(GameStateManager gsm){
        super(gsm);
    }

    @Override
    public void init() {
    spriteBatch = new SpriteBatch();
        viewport = new FitViewport(CrazyPutting.width, CrazyPutting.height,CrazyPutting.cam);
        viewport.apply();
        img = new Texture("mainMenu.jpg");
        background = new Image(img);
        comicFont = new BitmapFont(Gdx.files.internal("comic/raw/font-export.fnt"));
        stage = new Stage(viewport, spriteBatch);
        atlas = new TextureAtlas("comic/skin/comic-ui.atlas");
        skin = new Skin(Gdx.files.internal("comic/skin/comic-ui.json"));
        CrazyPutting.cam.update();

    }

    @Override
    public void update(float dt) {
        handleInput();

    }

    @Override
    public void draw() {
        Gdx.input.setInputProcessor(stage);

        Table table = new Table();
        TextButton newGame = new TextButton("Play", skin);
        TextButton preferences = new TextButton("Settings", skin);
        TextButton exit = new TextButton("Exit", skin);
        table.add(newGame).fillX().uniformX();
        table.row().pad(50, 0, 50, 0);
        table.add(preferences).fillX().uniformX();
        table.row();
        table.add(exit).fillX().uniformX();

        table.setFillParent(true);
        stage.addActor(background);

        stage.addActor(table);
        Gdx.gl.glClearColor(.1f, .12f, .16f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
        spriteBatch.begin();
        comicFont.getData().setScale(3,3);
        comicFont.draw(spriteBatch,title,400,540);
        spriteBatch.end();


    }

    @Override
    public void handleInput() {

    }

    @Override
    public void dispose() {

    }
}
