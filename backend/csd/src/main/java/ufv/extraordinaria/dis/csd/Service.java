package ufv.extraordinaria.dis.csd;

import com.google.gson.Gson;
import ufv.extraordinaria.dis.csd.TWEETs.tweet

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;



public class Service {
    public final String fichero_almacen = "TWEETS_guardados.json";
    public static final Gson gson = new Gson();


    public File getFile() {
        var URL = getClass().getClassLoader().getResource((fichero_almacen));
        URI url = null;

        try {
            url = URL.toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return new File(url);

    }


    public String recuperar_tweets_JSON(){
        var file = getFile();

        String tweets_devolver = "";

        try {
            tweets_devolver = Files.readString(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tweets_devolver;
    }

    public String guardar_tweet(String tweet) {
        File file = getFile();
        String estado = "";

        try {
            FileWriter guarda = new FileWriter(file);
            guarda.write(tweet);
            guarda.close();
            estado = "Exito al guardar";
        } catch (IOException e) {
            e.printStackTrace();
            estado = "Error al guardar";
        }

        return estado;
    }



}
