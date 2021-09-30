package com.kodilla.patterns.builder.bicmac;

import java.util.ArrayList;
import java.util.List;

public class Bicmac {

    String bun;
    String sauce;
    List<String> ingradients;
    int burgers;

    public static class BicmacBuilder{

        String bun;
        String sauce;
        List<String> ingradients= new ArrayList<>();
        int burgers;

        public BicmacBuilder Bun (String bun){
            this.bun = bun;
            return this;
        }
        public BicmacBuilder Sauce (String sauce){
            this.sauce =sauce;
            return this;
        }
        public BicmacBuilder Ingradients(String ingradients){
            this.ingradients.add(ingradients);
            return this;
        }
        public BicmacBuilder Burgers(int burgers){
            this.burgers = burgers;
            return this;
        }
        public Bicmac build(){
            return new Bicmac(bun,sauce,burgers,ingradients);
        }
    }

    private Bicmac(String bun,String sauce,int burgers,List<String> ingradients){
        this.bun = bun;
        this.sauce =sauce;
        this.ingradients = ingradients;

    }

    public String getBun(){
        return this.bun;
    }
    public String getSauce(){
        return sauce;
    }
    public List<String> getIngradients(){
        return ingradients;
    }
    public int getBurgers(){
        return burgers;
    }
    @Override
    public String toString(){
        return  " bun " + bun+" sauce "+sauce+" burgers "+burgers+" ingradients "+ingradients;
    }
}
