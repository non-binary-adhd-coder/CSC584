/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hidayah
 */
public class TapeStore {

    public static void main(String args[]) {
        VideoTape item1 = new VideoTape("Jaws", 120);
        Movie item2 = new Movie("Columbus", "PG", "Spielberg",120 );
        item1.show();
        item2.show();
    }
}
