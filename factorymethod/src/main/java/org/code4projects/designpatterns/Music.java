package org.code4projects.designpatterns;

/*
 * Music
 *
 * This is a genereic interface for game musics.
 */
interface Music {
    // play the music    
    void play();

    // stop the music
    void stop();

    // pause the music
    void pause();

    // set/unset the music being played in loop
    void setLooping(boolean looping);

    // set the volume
    void setVolume(float volume);

    // test if music is playing    
    public boolean isPlaying();

    // test if music is stopped
    public boolean isStopped();

    // test if music is looping
    public boolean isLooping();

    // destroy the music object
    public void dispose();
}
