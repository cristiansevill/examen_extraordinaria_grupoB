package ufv.extraordinaria.dis.csd.TWEETs;


import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class tweetController {

    private final tweetService t_service;
    private Gson gson = new Gson();

    public tweetController(tweetService t_service) { this.t_service = t_service; }

    @GetMapping(value = "/getTweets", produces = "application/json")
    public ArrayList<tweet> getTweets() { return t_service.readTweets(); }

    @GetMapping(value = "/borrarTweet/{ID}")
    public String borrarTweet(@PathVariable Long ID) { return t_service.borrar_tweet(ID); }

    @PostMapping(value = "/addTweet")
    public String addTweet(@RequestBody tweet ts) { return t_service.crear_tweet(ts); }


}
