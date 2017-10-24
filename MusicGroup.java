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
public class MusicGroup {
    private float earnings;
    private String groupName;
    private ArrayList<Song> songs = new ArrayList<Song>();
    private ArrayList<String> performers = new ArrayList<String>();
    private ArrayList<Album> albums = new ArrayList<Album>();

    public MusicGroup(String groupName, String memberName) {
        this.groupName = groupName;
        this.earnings = 0.0f;
        performers.add(memberName);
    }
    
    public void addMember(String name){
        performers.add(name);
    }
    
    public void addSong(Song song){
        
    }

    public float getEarnings() {
        // recalculate total earnings
        earnings = 0.0f;
        for (Album a : albums) {
            earnings += a.getEarnings();
        }
        for (Song s : songs) {
            earnings += s.getEarnings();
        }
        return earnings;
    }

    public String getGroupName() {
        return groupName;
    }

    public void addAlbum(Album album){
        albums.add(album);
        
    }
    
    
}
