package org.code4projects.designpatterns;

public class World {
    // the possible game status values
    public enum GameState {
        Ready,
        Running,
        Paused,
        GameOver
    }
    // field containing the game status
    GameState state = GameState.Ready;

    // the private static instance used to implement the Singleton pattern.
    private static World instance;

    // The World class is a Singleton and for this reason the constructor is
    // private
    private World() {
        // ...
    }

    // the getInstance method of the Lazy Singleton
    public static World getInstance() {
        if (instance == null) {
            instance = new World();
        }
        return instance;
    }

    public GameState getState() {
        return state;
    }

    public void setState(GameState state) {
        this.state = state;
    }
}
