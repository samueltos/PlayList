package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> album;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.album = new ArrayList<>();
    }

    public void addSong(String songName, double duration){
        if(findSong(songName) == -1) {
            album.add(new Song(songName, duration));
        }else{
            System.out.println("song already in album");
        }
    }

//    public void deleteSong(String songName){
//        int position = findSong(songName);
//        if(position == -1) {
//            album.remove(position);
//        }else{
//            System.out.println("song is not in the album");
//        }
//
//    }

    private int findSong(String songName){
        for(int i=0; i < album.size(); i++){
            if(album.get(i).getTitle().equals(songName)){
                return i;
            }
        }return -1;
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber -1;
        if((index >= 0) && (index < this.album.size())){
            playList.add(this.album.get(index));
            return true;
        }else{
            System.out.println("this album does not have track number"+trackNumber);
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        int position = findSong(title);
        if(position != -1){
            playList.add(this.album.get(position));
            return true;
        }else{
            System.out.println(title+" is not in the album");
            return false;
        }
    }

}
