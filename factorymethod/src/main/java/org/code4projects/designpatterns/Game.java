package org.code4projects.designpatterns;

/*
 * Game
 *
 * This is a genereic interface that represents the game. In this example we
 * we only have a method to return the Audio system.
 */
interface Game {
    // return the audio subsystem
    Audio getAudio();
}
