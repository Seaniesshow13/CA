//Sean Hall T00198189 CA
package assessment;

import javax.swing.*;
import java.util.Arrays;

public class TestAlbum {


    public static void main (String[] args){


        Song s1 = new Song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
        Song s2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song s3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song s4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song s5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);


        //Song track[] = track[4];
        track[0] = s1;
        track[1] = s2;
        track[2] = s3;
        track[3] = s4;
        track[4] = s5;





        Album a1 = new Album("Now thats what i call Music 98", track , "Universal Music", 2016);


        JOptionPane.showMessageDialog(null, a1 , "Album Information",JOptionPane.INFORMATION_MESSAGE);

        int  tracknum = Integer.parseInt(JOptionPane.showInputDialog("Which track number would you like to play?"));

        JOptionPane.showConfirmDialog(null,"Would you like to shuffle the playlist","ShufflePlaylist?",JOptionPane.YES_NO_OPTION);
    }
}
