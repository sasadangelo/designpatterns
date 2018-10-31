package org.code4projects.designpatterns;

/*
 * The generic interface to manage a Game screen.
 */
public interface Screen {
    // a screen must update and draw a game screen
    void update();
    void draw();
}
