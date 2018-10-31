package org.code4projects.designpatterns;

/*
 * GameState
 *
 * This class represents the abstract class of our state pattern. It represents
 * a generic game state. Whenever a game is in a given state it must implements
 * two state:
 * - update, to update the game state
 * - draw, to draw the game
 */
abstract class GameState {
    // update the game state
    abstract void update();
    // draw the game state
    abstract void draw();
}
