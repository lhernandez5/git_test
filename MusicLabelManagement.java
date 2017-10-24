/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musiclabelmanagement;

import java.util.*;
import BookClasses.*;

/**
 *
 * @author luzhernandez
 */
public class MusicLabelManagement {

    private ArrayList<MusicGroup> groups = new ArrayList<MusicGroup>();
    private ArrayList<Album> albums = new ArrayList<Album>();
    private ArrayList<Song> songs = new ArrayList<Song>();
    private Song song;
    boolean keepPlaying = true;

    /**
     * Constructor
     */
    public MusicLabelManagement() {
        initialize();
        Scanner s = new Scanner(System.in);

        while (keepPlaying) {
            System.out.println();
            System.out.println("Would you like to listen to some music?");
            System.out.println();
            System.out.println("Type Y/y for YES or N/n for NO.");
            char listen = s.next().charAt(0);
            if (listen == 'y' || listen == 'Y') {
                System.out.println("Which music group do you want to listen to?");
                System.out.println("1. Beatles");
                int group = s.nextInt();
                if (group == 1) {

                    System.out.println("Which ablum do you want to listen to?");
                    System.out.println("1. Greatest Hits");

                    int album = s.nextInt();
                    if (album == 1) {
                        System.out.println("Please indicate below which song you would like to listen to:");
                        System.out.println("1. Can't Buy Me Love");
                        System.out.println("2. Penny Lane");
                        System.out.println("3. Yellow Submarine");
                        System.out.println("4. Paperback Writer");
                        System.out.println("5. HardDaysNight");

                        int ans = s.nextInt();
                        if (ans == 1) {
                            song = songs.get(0);
                            System.out.println("Playing " + song.getSong().toString());
                            song.play();
                        } else if (ans == 2) {
                            song = songs.get(1);
                            System.out.println("Playing " + song.getSong().toString());
                            song.play();
                        } else if (ans == 3) {
                            song = songs.get(2);
                            System.out.println("Playing " + song.getSong().toString());
                            song.play();
                        } else if (ans == 4) {
                            song = songs.get(3);
                            System.out.println("Playing " + song.getSong().toString());
                            song.play();
                        } else if (ans == 5) {
                            song = songs.get(4);
                            System.out.println("Playing " + song.getSong().toString());
                            song.play();
                        }
                        if (album == 2) {
                            System.out.println("There are unfortunately not songs here.");
                        }
                    }
                }
            } else {
                keepPlaying = false;
            }
        }
        System.out.println("Thank-you for listening! Good Bye!");

//        //add a bunch of music groups, songs and albums 
//        initialize();
//
//        // get interactive with the user, playing songs and letting them buy them
//        Scanner s = new Scanner(System.in);
//        // type a 0 to stop playing songs
//        try {
//            System.out.println("Jukebox starting. Type a '1' to play a song. Type a '0' to end.");
//            while (s.nextInt() != 0) {
//                jukebox();
//                System.out.println("Type a '1' to play another song. Type a '0' to end.");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Sorry, but you can only type integers. Jukebox ending.");
//        }
//
//        // when done with interactive portion, 
//        // iterate through the record label's groups, printing out revenues of each
//        for (MusicGroup group : groups) {
//            System.out.println(group.getGroupName() + " has earned " + group.getEarnings() + " so far.");
    }

    public void initialize() {

        FileChooser.setMediaPath("/Users/luzhernandez/NetBeansProjects/MediaSources/");

        // create the first group (Beatles)
        MusicGroup beatles = new MusicGroup("Beatles", "Paul McCartney");
        beatles.addMember("Ringo Star");
        beatles.addMember("John Lennon");
        beatles.addMember("George Harrison");
        // add to list of record label's groups
        groups.add(beatles);
        // create new album
        Album album1 = new Album("Greatest Hits", "Random Person", 9.99f, beatles);

//       ***** Change the song file names below to match song snippet files that you downloaded at the beginning ****
//       ****** otherwise you will be listening to 'thisisatest' over and over again! ******
        Song song1 = new Song(new Sound(FileChooser.getMediaPath("Can'tBuyMeLove.wav")), "Can't Buy Me Love", "random dude", beatles, 0.01f, 0.99f);
        beatles.addSong(song1);
        songs.add(song1);
        album1.addSong(song1);
        Song song2 = new Song(new Sound(FileChooser.getMediaPath("PennyLane.wav")), "Penny Lane", "random dude", beatles, 0.01f, 0.99f);
        beatles.addSong(song2);
        songs.add(song2);
        album1.addSong(song2);
        Song song3 = new Song(new Sound(FileChooser.getMediaPath("YellowSubmarine.wav")), "Yellow Submarine", "random dude", beatles, 0.01f, 0.99f);
        beatles.addSong(song3);
        songs.add(song3);
        album1.addSong(song3);
        Song song4 = new Song(new Sound(FileChooser.getMediaPath("PaperbackWriter.wav")), "Paperback Writer", "random dude", beatles, 0.01f, 0.99f);
        beatles.addSong(song4);
        songs.add(song4);
        album1.addSong(song4);
        Song song5 = new Song(new Sound(FileChooser.getMediaPath("HardDaysNight.wav")), "Hard Day's Night", "random dude", beatles, 0.01f, 0.99f);
        beatles.addSong(song5);
        album1.addSong(song5);
        songs.add(song5);

        // add this album to beatles list of albums
        beatles.addAlbum(album1);
        // add this album to the record label's list of albums
        albums.add(album1);
    }

//   public void jukebox(){
//       int index = (int)(Math.random()*songs.size());
//        Song song = songs.get(index);
//        System.out.println("Playing " + song.getSong() + " by " + song.getGroup() + ", written by: " + song.getWriter());
//        song.play();
//        System.out.println("Would you like to purchase this song? (Y/N)");
//        Scanner sc = new Scanner(System.in);
//        char c = sc.next().charAt(0);
//        if (c == 'Y' || c == 'y') {
//            song.purchase();
//            System.out.println("Thank-you for your purchase!");
//        } 
//
//   }
    
}
