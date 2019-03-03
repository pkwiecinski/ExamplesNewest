package pl.saltsoft;

import com.google.gson.Gson;

public class Serializer {

    public void doSerialize(Pizza pizza){
        Gson gson = new Gson();
        String json = gson.toJson(pizza);
        System.out.println(json);
    }


    public void deSerialize(){

    }
}
