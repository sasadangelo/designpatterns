package org.code4projects.designpatterns;

/*
 * AndroidGame
 *
 * This is the class that will be invoked when the Game app is started up on
 * Android system. The real class must be a little different because it should
 * extends the Android Activity class. However, to simplify the things and
 * let you understand the main concepts I simply use a normal class.
 */
public class AndroidGame implements Game {
    private Audio audio;

    // The constructor will create the Audio and other subsystems. They will
    // be assigned to statisc variables in Gdx class so that they can be
    // quickly accessed in client code with Gdx.audio.
    public AndroidGame() {
        this.audio= new AndroidAudio();
        Gdx.audio=this.audio;
    }

    // return the audio subsystem
    public Audio getAudio() {
        return audio;
    }
}
