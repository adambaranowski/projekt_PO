package impl;

import java.util.HashMap;

public class KeyMap {

    private HashMap<String, String> keys = new HashMap<String, String>();
    //key.put(klucz czyli numer dzwięku, wartość czyli faktyczna nazwa pliku wav)


    public KeyMap() {

        //key.put(klucz czyli numer dzwięku, wartość czyli faktyczna nazwa pliku wav)

        keys.put("36", "036-c.wav");
        keys.put("37", "037-c#.wav");
        keys.put("38", "038-d.wav");
    }

    public String getKey(String key){
        return "xd";
    }
}
