package org.example.bridge;

import org.example.bridge.platforms.FacebookLive;
import org.example.bridge.platforms.IPlatform;
import org.example.bridge.platforms.TwitchTV;
import org.example.bridge.platforms.Youtube;
import org.example.bridge.transmissions.AdvancedLive;
import org.example.bridge.transmissions.Live;

//Disgne Pattern Brigde
public class MainBridge {
    public static void main(String[] args) {
        startLive(new Youtube());
        startLive(new TwitchTV());
        startLive(new FacebookLive());
    }

    public static void startLive(IPlatform platform){
//        System.out.println("... Aguarde!");
//        Live live = new Live(platform);
//        live.broadcasting();
//        live.result();
        System.out.println("Transmissão Avançada...aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }
}
