package LinkedList;

import java.util.*;

public class PlayList {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> Album = new ArrayList<Album>();

    public static void main(String[] args){
        Album album = new Album("tennessee", "taylor");

        album.addSong("welcome", 4.23);
        album.addSong("close", 4.30);
        album.addSong("jefferson", 4.20);
        album.addSong("knox", 5.23);
        album.addSong("nashville", 4.20);
        Album.add(album);

        album = new Album("Nara", "Tim Godfrey");

        album.addSong("nara", 4.20);
        album.addSong("you are welcome", 5.32);
        album.addSong("at the center of it", 4.22);
        album.addSong("more than gold", 3.50);
        album.addSong("psalms 34", 4.12);
        Album.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        Album.get(0).addToPlayList("nashville", playList);
        Album.get(0).addToPlayList(3, playList);
        Album.get(0).addToPlayList("knox", playList);
        Album.get(0).addToPlayList("NASHVILLE", playList);  //not in the list
        Album.get(1).addToPlayList("psalms 34", playList);
        Album.get(1).addToPlayList(1, playList);
        Album.get(1).addToPlayList(4, playList);
        Album.get(1).addToPlayList(43, playList); // not in the list

        listen(playList);

    }

    public static void listen(LinkedList<Song> playList){
        boolean quit = true;
        boolean isForward = true;
        ListIterator<Song> listIteratior = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("There is no song in the play list");
        }else{
            System.out.println("Now Playing "+listIteratior.next().toString());
        }

        while(quit){
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    System.out.println("Available options: press ");
                    System.out.println(" 0 - print available menu" +
                            "\n 1 - play next song" +
                            "\n 2 - play prev song" +
                            "\n 3 - repeat the song" +
                            "\n 4 - list song in the playlist" +
                            "\n 5 - remove current song from playlist" +
                            "\n 6 - stop playlist");
                    break;
                case 1:
                    if(!isForward){
                        if(listIteratior.hasNext()) {
                            listIteratior.next();
                            isForward = true;
                        }
                    }
                    if (listIteratior.hasNext()){
                        System.out.println("Now playing "+listIteratior.next().toString());
                    }else{
                        System.out.println("At the end of playlist");
                    }
                    break;
                case 2:
                    if(isForward){
                        if(listIteratior.hasPrevious()) {
                            listIteratior.previous();
                            isForward = false;
                        }
                    }
                    if(listIteratior.hasPrevious()){
                        System.out.println("Now playing "+listIteratior.previous().toString());
                    }else{
                        System.out.println("At the start of playlist");
                    }
                    break;
                case 3:
                    if(isForward){
                        System.out.println("Now playing "+listIteratior.previous().toString());
                        isForward = false;
                    }else{
                        System.out.println("Now playing "+listIteratior.next().toString());
                        isForward = true;
                    }
                    break;
                case 4:
                    Iterator<Song> iterator = playList.iterator();
                    System.out.println("========================");
                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    System.out.println("========================");
                    break;
                case 5:
                    if(playList.size() > 0){
                        listIteratior.remove();
                        if (listIteratior.hasNext()){
                            System.out.println("Now playing "+listIteratior.next());
                        }else if(listIteratior.hasPrevious()){
                            System.out.println("Now playing "+listIteratior.previous());
                        }
                    }
                    break;
                case 6:
                    System.out.println("End playlist");
                    quit = false;
                    break;
            }


        }


    }






}
