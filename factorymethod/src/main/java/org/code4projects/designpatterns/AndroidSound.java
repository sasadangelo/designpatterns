package org.code4projects.designpatterns;

/*
 * AndroidSound
 *
 * This is the class used to manage sounds on Android systems.
 */
public class AndroidSound implements Sound {
    // the sound file to play
    private String filename;

    public AndroidSound(String filename) {
        this.filename=filename;
        // other code here ...
    }

    // play the sound at a given volume
    public void play(float volume) {
        // code here ...
    }

    // destroy the sound object to free memory
    public void dispose() {
        // code here ...
    }
}
