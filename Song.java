/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musiclabelmanagement;
import BookClasses.*;

/**
 *
 * @author luzhernandez
 */
public class Song {
    private float earnings;
    private MusicGroup group;
    private int numPlays;
    private int numPurchases;
    private float royalty;
    private Sound song;        
    private float songPrice;
    private String writer;
    private String title;       

    public Song(Sound song, String title, String writer, MusicGroup group, float royalty, float songPrice) {
        this.group = group;
        this.royalty = royalty;
        this.song = song;
        this.songPrice = songPrice;
        this.writer = writer;
        this.earnings = 0.0f;
        this.numPlays = 0;
        this.numPurchases = 0;
    }

   
    public MusicGroup getGroup() {
        return group;
    }

   
    public Sound getSong() {
        return song;
    }

    
    public float getEarnings() {
        return earnings;
    }

    public String getWriter() {
        return writer;
    }

    public void play(){
        song.blockingPlay();
        earnings += royalty;
        numPlays++;
    }
    
    public void purchase(){
        earnings += songPrice;
        numPurchases++;
    }
    
    
}
