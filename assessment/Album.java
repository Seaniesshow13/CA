//Sean Hall T00198189 CA

package assessment;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Arrays;

public class Album {
    private String name;
    private Song Tracks[];
    private String producer;
    private int releaseYear;

    int tracknum = 3; // this is to test the play track method


    public Album(String name, Song Song[], String producer, int releaseYear) {
        setName(name);
        setTracks(Song);
        setProducer(producer);
        setReleaseYear(releaseYear);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //this.name = name;

        if (this.name != null) {
            this.name = name;
        } else
            System.out.print("No name specified");
    }

    public Song[] getTracks() {
        return Arrays.copyOf(Tracks, Tracks.length);
    }

    public void setTracks(Song[] song) {
        Tracks = song;
    }

    public String getProducer() {
        return producer;
    }



    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getNumberOfTracks() {
        int noOfTracks = 0;


        for (int i = 0; i < getTracks().length; i++) {
            if (Tracks[i] != null)
                noOfTracks++;

        }

        return noOfTracks;
    }

    public int getPlayingTime() {
        int playTime = 0;

        for(int i = 0;i< getTracks().length;i++){
            if(Tracks[i] != null){
                playTime += Tracks[i].getDuration();

            }
        }


        return playTime;
    }






    public void playTrack(tracknum) {


        if(tracknum<5){
            JOptionPane.showMessageDialog(null,"You are playing" + Tracks[tracknum],"good track number",JOptionPane.INFORMATION_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null , "An invalid track number was supplied","bad track Number",JOptionPane.ERROR_MESSAGE);
        }



    }

    public void shuffle() {
        // this method would take in the output of the confirmDialog box

        //run an if statment to decide if the use wants to shuffle the playlist
        //if the user says no it is skipped
        //if the user says yes then a new array of the same length is made


    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", Song=" + Arrays.toString(Tracks) +
                ", producer='" + producer + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }


}



