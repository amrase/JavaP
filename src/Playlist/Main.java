package Playlist;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer","Deep Purple");
        album.addSong("Soldier of fortune",4.6);
        album.addSong("You can't do it right",4.22);
        album.addSong("The gypsy",5.1);
        album.addSong("High ball shouter",3.35);
        album.addSong("Holy man",4.6);
        albums.add(album);


        album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock",5.44);
        album.addSong("Evil walks",3.33);
        album.addSong("Breaking the rules",5.32);
        album.addSong("Snowballed",4.13);
        album.addSong("Night of the long knives",5.12);
        albums.add(album);

        LinkedList<Song> playlist =  new LinkedList<Song>();
        albums.get(0).addToPlaylist("Stormbringer",playlist);
        albums.get(0).addToPlaylist("Holy man",playlist);
        albums.get(0).addToPlaylist("The gypsy",playlist);
        albums.get(0).addToPlaylist("Speed king",playlist);//Doest exist
        albums.get(0).addToPlaylist(9,playlist);

        albums.get(1).addToPlaylist(8,playlist);
        albums.get(1).addToPlaylist(3,playlist);
        albums.get(1).addToPlaylist(2,playlist);
        albums.get(1).addToPlaylist(24,playlist);


        play(playlist);


    }

    public static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No song in playlist.");
            return;
        }
        else{
            System.out.println("Now playlist " +  listIterator.next().toString());
        }


        while(!quit){
            int actions = scanner.nextInt();
            scanner.nextLine();
            switch (actions){
                case 0:
                    System.out.println("Playlist complete");
                    quit=  true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+ listIterator.next().toString());
                    }
                    else{
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Not playing " + listIterator.previous().toString());
                    }
                    else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }

                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.hasPrevious());
                        }
                        else {
                            if(listIterator.hasNext()){
                                System.out.println("Now replaying "+ listIterator.hasNext());
                                forward=true;
                            }
                            else{
                                System.out.println("We have reached the end of the list");
                            }
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }
                        else if(listIterator.hasPrevious()){
                            System.out.println("Now playinh " + listIterator.previous());
                        }
                    }
            }
        }
    }


    public static void printMenu(){
        System.out.println("Available actions:");
        System.out.println("0 - rto quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay current song\n"+
                "4 - to list songs in the playlist\n"+
                "5 - print available actions."
                );
    }

    public static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("============================");
    }



}
