package ufv.extraordinaria.dis.csd.TWEETs;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import ufv.extraordinaria.dis.csd.Shared.TWITTER;

@Service
public class tweetService extends ufv.extraordinaria.dis.csd.Shared.Service {

    public ArrayList<tweet> readTweets() {
        var twitter = gson.fromJson(recuperar_tweets_JSON(), TWITTER.class);
        return twitter.getTweets();
    }


    public String crear_tweet(tweet ts) {
        String estado;
        var tweets = gson.fromJson(recuperar_tweets_JSON(), TWITTER.class);

        tweets.getTweets().add(ts);
        estado = guardar_tweet(gson.toJson(tweets));

        return estado;
    }

    public String borrar_tweet(Long ID) {
        var tweets = gson.fromJson(recuperar_tweets_JSON(), TWITTER.class);
        String estado = "Tweet no encontrado.";

        for(tweet ts : tweets.getTweets()) {
            if (ts.getID() == ID) {
                tweets.getTweets().remove(ts);
                guardar_tweet(gson.toJson(tweets));
                estado = "Tweet borrado.";
                break;
            }
        }
        return estado;
    }



}
