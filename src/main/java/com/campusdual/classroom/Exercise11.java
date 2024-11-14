package com.campusdual.classroom;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");


        System.out.println(redRemote.turnOn());
        System.out.println(redRemote.channel);
        redRemote.channelUp();
        System.out.println(redRemote.channel);
        redRemote.channelDown();
        System.out.println(redRemote.channel);
        redRemote.channelDown();
        System.out.println(redRemote.channel);
        redRemote.volumeUp();
        redRemote.volumeDown();
        System.out.println(redRemote.volume);
        redRemote.volume=0;
        System.out.println(redRemote.volume);
        redRemote.volumeDown();
        System.out.println(redRemote.volume);
        System.out.println(redRemote.getColor());
        System.out.println(redRemote.turnOff());




    }

}