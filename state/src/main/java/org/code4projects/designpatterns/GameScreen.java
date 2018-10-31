package org.code4projects.designpatterns;

import java.util.Map;
import java.util.EnumMap;

/*
 * The generic interface to manage a Game screen.
 */
public class GameScreen implements Screen {
    // A map that associate to each game state the relative state class used to
    // manage the state
    private Map<World.GameState, GameState> states = new EnumMap<>(World.GameState.class);

    public GameScreen() {
        states.put(World.GameState.Paused, new GamePaused());
        states.put(World.GameState.Ready, new GameReady());
        states.put(World.GameState.Running, new GameRunning());
        states.put(World.GameState.GameOver, new GameOver());

        // other stuff
    }

    // update the screen calling the update method of the current state
    public void update() {
        states.get(World.getInstance().getState()).update();

        // other stuff
    }

    // draw the screen calling the draw method of the current state
    public void draw() {
        states.get(World.getInstance().getState()).draw();

        // other stuff
    }
}
