package ufv.extraordinaria.dis.csd.Shared;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;



public abstract class Service { //   ../../../../../resources/
    public final String fichero_almacen = "TWEETS_guardados.json";
    public static final Gson gson = new Gson();


    public File getFile() {
        var URL = getClass().getClassLoader().getResource(fichero_almacen);
        assert URL != null;
        URI uri = null;

        try {
            uri = URL.toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        assert uri != null;
        return new File(uri);

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
        String estado;

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
