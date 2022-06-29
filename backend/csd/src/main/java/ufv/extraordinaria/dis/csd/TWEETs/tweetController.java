package ufv.extraordinaria.dis.csd.TWEETs;


import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class tweetController {

    private final ufv.extraordinaria.dis.csd.TWEETs.tweetService tweetService;
    private Gson gson = new Gson();

    public tweetController(ufv.extraordinaria.dis.csd.TWEETs.tweetService tweetService) { this.tweetService = tweetService; }

    @GetMapping(value = "/get/tweets", produces = "application/json")
    public ArrayList<tweet> getTweets() { return tweetService.readTweets(); }

    @GetMapping(value = "/borrarTweet/{ID}")
    public String borrarTweet(@PathVariable Long ID) { return tweetService.borrar_tweet(ID); }

    @PostMapping(value = "/addTweet")
    public String addTweet(@RequestBody tweet ts) { return tweetService.crear_tweet(ts); }





}
