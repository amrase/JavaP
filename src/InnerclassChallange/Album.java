package InnerclassChallange;

import Playlist.Song;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;

    public Album() {
        this.songs = new ArrayList<Song>();
    }

    public boolean addASong(Song song){
        if(songs.contains(song)){
            return false;
        }
        this.songs.add(song) ;
        return true;
    }

    public Song findSong(String title){
        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return  null;
    }

    public Song findSong(int trackNumber){
        int index = trackNumber-1;
        if((index>0)&&(index<songs.size())){
            return songs.get(index);
        }
        return null;
    }
}

class SonG {
    private String title;
    private double duration;
    private ArrayList<String> tracks;

    public SonG(String title, double duration) {
        this.title = title;
        this.duration = duration;
        this.tracks = new ArrayList<>();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
