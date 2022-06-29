package ufv.extraordinaria.dis.csd.TWEETs;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class tweetService extends ufv.extraordinaria.dis.csd.Service {

    public ArrayList<tweet> readTweets() {
        var twitter = gson.fromJson(recuperar_tweets_JSON(), tweet.class);
        return twitter.ge
    }



}
