package com.jbalceda;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> myAlbum;

    public Album(String name) {
        this.name = name;
        this.myAlbum = new ArrayList<>();
    }
    public boolean addSong(String songName, String duration){
       int songExists = findSong(songName);
        if (songExists < 0 ){
            this.myAlbum.add(new Song(songName,duration));
            return true;
        }
        return  false;
    }
    public Song getSong(String songName){
        int songExists = findSong(songName);
        if (songExists >= 0){
            return this.myAlbum.get(songExists);
        }
        return null;
    }
    private int findSong(String songName){
        for (int i=0; i<this.myAlbum.size(); i++){
            if(this.myAlbum.get(i).getTitle().equals(songName)){
                return i;
            }
        }
        return -1;
    }

/*    public Song findClassSong(String songName){
*        for (Song checkSong: this.myAlbum){
*            if(checkSong.getTitle().equals(songName)){
*                return checkSong;
*            }
*        }
*        return null;
*    }
*/
}
