package ufv.extraordinaria.dis.csd.TWEETs;

import java.util.ArrayList;

public class TWITTER {
    private ArrayList<tweet> tweets;

    // cons
    public TWITTER(ArrayList<tweet> tweets) {
        this.tweets = tweets;
    }

    // gets
    public ArrayList<tweet> getTweets() { return tweets; }

    // sets
    public void setTweets(ArrayList<tweet> tweets) { this.tweets = tweets; }

}
