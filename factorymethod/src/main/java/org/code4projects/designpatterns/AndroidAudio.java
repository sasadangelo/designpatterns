package org.code4projects.designpatterns;

/*
 * AndroidAudio
 *
 * This is the concrete factory method class used to create sounds and musics
 * for Android systems
 */
public class AndroidAudio implements Audio {
    // factory method for Music objects
    public Music newMusic(String filename) {
        return new AndroidMusic(filename);
    }

    // factory method for Sound objects
    public Sound newSound(String filename) {
        return new AndroidSound(filename);
    }
}
