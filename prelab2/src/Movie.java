/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hidayah
 */
public class Movie extends VideoTape {

    public String director;
    public String rating;

    public Movie(String director, String rating, String ttl, int lngth) {
        super(ttl, lngth);
        this.director = director;
        this.rating = rating;
    }

    public Movie(String director, String rating, String ttl) {
        super(ttl);
        this.director = director;
        this.rating = rating;
    }

    public void show() {
        //System.out.println(title + ", " + length + " min. available:" + avail);
        super.show();
        System.out.println("dir: " + director + " " + rating);

    }
}
