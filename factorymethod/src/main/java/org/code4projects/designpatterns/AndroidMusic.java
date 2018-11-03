package org.code4projects.designpatterns;

/*
 * AndroidMusic
 *
 * This is the concrete class that play music on Android systems.
 */
public class AndroidMusic implements Music {
    // the music file to play
    private String filename;

    public AndroidMusic(String filename) {
        this.filename=filename;
        // other code here ...
    }

    // play the music    
    public void play() {
        // code here ...
    } 

    // stop the music
    public void stop() {
        // code here ...
    }

    // pause the music
    public void pause() {
        // code here ...
    }

    // set/unset the music being played in loop
    public void setLooping(boolean looping) {
        // code here ...
    }

    // set the volume
    public void setVolume(float volume) {
        // code here ...
    }

    // test if music is playing
    public boolean isPlaying() {
        // code here ...
        return true;
    }

    // test if music is stopped
    public boolean isStopped() {
        // code here ...
        return false;
    }

    // test if music is looping
    public boolean isLooping() {
        // code here ...
        return true;
    }

    // destroy the music object
    public void dispose() {
        // code here ...
    }
}
