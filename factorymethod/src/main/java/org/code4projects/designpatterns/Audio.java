package org.code4projects.designpatterns;

/*
 * Audio
 *
 * This is the factory method interface used to create sounds and musics.
 */
interface Audio {
    // factory method for Music objects
    Music newMusic(String filename);

    // factory method for Sound objects
    Sound newSound(String filename);
}
