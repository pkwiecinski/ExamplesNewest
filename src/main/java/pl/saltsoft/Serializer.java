package pl.saltsoft;

import com.google.gson.Gson;

public class Serializer {

    public void doSerialize(Pizza pizza){
        Gson gson = new Gson();
        String json = gson.toJson(pizza);
        System.out.println(json);
    }


    public Pizza deSerialize(String pizz){
        Gson gson = new Gson();
        Pizza bestpizza = gson.fromJson(pizz, Pizza.class);
        return bestpizza;
    }
}
