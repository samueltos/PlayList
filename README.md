# PlayList
Hello everyone,
My name is Sam. This is a java program that allow user to add songs from different album class to a playlist. It is model after regular audio or music player. In which a user can add songs from different artist and many albums.
There are three files(Song, Album, PlayList). 

The song class has the record of song title and duration of the songs.
The Album class has the collections of songs. The record of songs are kept using arrayList. Method such as adding new song, and finding a song is defined and implemented. There is some level of validation to see if the song is already in the album or not before being added again.

The method to add songs to playlist was handled in two ways: 
(1) by tracknumber of the song in an album
(2) by the title of the song

The PlayList class implement, manipulate and uses both the song and album class. LinkedList was used as the playlist which uses keep tracks of the song added to the playlist from different albums. User can use the following menu option to control the playlist.
 0 - print available menu
 
 1 - play next song
 
 2 - play prev song
 
 3 - repeat the current song
 
 4 - list song in the playlist
 
 5 - remove current song from playlist
 
 6 - stop playlist
