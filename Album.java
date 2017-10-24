/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musiclabelmanagement;
import java.util.ArrayList;


/**
 *
 * @author luzhernandez
 */
public class Album {
    private float earnings;
    private MusicGroup group;
    private int numPurchases;
    private String title;
    private ArrayList<Song> songs = new ArrayList<Song>();
    private float albumPrice;
    private String producer;

    public Album(String title, String producer, float albumPrice, MusicGroup group) {
        this.title = title;
        this.albumPrice = albumPrice;
        this.producer = producer;
        this.group = group;
        this.numPurchases = 0;
        this.earnings = 0.0f;
    }

    public void addSong(Song song){
        songs.add(song);
    }
    
    public float getEarnings() {
        return earnings;
    }

    public MusicGroup getGroup() {
        return group;
    }

    public String getTitle() {
        return title;
    }

    public float getAlbumPrice() {
        return albumPrice;
    }

    public String getProducer() {
        return producer;
    }
    
    public void playAlbum(boolean shuffle){
        if (!shuffle) {
            for (Song s : songs ) {
                s.play();
            }
        } else {
            // need to shuffle songs, create array of booleans set to false
            boolean[] playedSong = new boolean[songs.size()];
            for (int i = 0; i < songs.size(); i++) {
                playedSong[i] = false;
            }
            // now, keep generating random index of song that hasn't been played
            for (int i = 0; i < songs.size(); i++) {
                int index = -1;
                while (true) {
                    index = (int)(Math.random()*songs.size());
                    if (playedSong[i] == false) break;
                }
                // got index, play song, set boolean flag
                songs.get(index).play();
                playedSong[index] = true;
            }
        }

    }
    
    public void purchase(){
        numPurchases++;
        earnings += albumPrice;
    }          
    
}
