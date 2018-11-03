package org.code4projects.designpatterns;

/*
 * Sound
 *
 * This is a genereic interface for game sound like explosion, shot and so on.
 */
interface Sound {
    // play the sound at a given volume
    void play(float volume);

    // destroy the sound object to free memory
    void dispose();
}
