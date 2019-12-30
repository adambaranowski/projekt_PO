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
        keys.put("39", "039-d#.wav");
        keys.put("40", "040-e.wav");
        keys.put("41", "041-f.wav");
        keys.put("42", "042-f#.wav");
        keys.put("43", "043-g.wav");
        keys.put("44", "044-g#.wav");
        keys.put("45", "045-a.wav");
        keys.put("46", "046-a#.wav");
        keys.put("47", "047-b.wav");
        keys.put("48", "048-c.wav");
        keys.put("49", "049-c#.wav");
        keys.put("50", "050-d.wav");
        keys.put("51", "051-d#.wav");
        keys.put("52", "052-e.wav");
        keys.put("53", "053-f.wav");
        keys.put("54", "054-f#.wav");
        keys.put("55", "055-g.wav");
        keys.put("56", "056-g#.wav");
        keys.put("57", "057-a.wav");
        keys.put("58", "058-a#.wav");
        keys.put("59", "059-b.wav");
        keys.put("60", "060-c.wav");
        keys.put("61", "061-c#.wav");
        keys.put("62", "062-d.wav");
        keys.put("63", "063-d#.wav");
        keys.put("64", "064-e.wav");
        keys.put("65", "065-f.wav");
        keys.put("66", "066-f#.wav");
        keys.put("67", "067-g.wav");
        keys.put("68", "068-g#.wav");
        keys.put("69", "069-a.wav");
        keys.put("70", "070-a#.wav");
        keys.put("71", "071-b.wav");
        keys.put("72", "072-c.wav");
        keys.put("73", "073-c#.wav");
        keys.put("74", "074-d.wav");
        keys.put("75", "075-d#.wav");
        keys.put("76", "076-e.wav");
        keys.put("77", "077-f.wav");
        keys.put("78", "078-f#.wav");
        keys.put("79", "079-g.wav");
        keys.put("80", "080-g#.wav");
        keys.put("81", "081-a.wav");
        keys.put("82", "082-a#.wav");
        keys.put("83", "083-b.wav");
        keys.put("84", "084-c.wav");
        keys.put("85", "085-c#.wav");
        keys.put("86", "086-d.wav");

    }

    public String getFileName(String key){
        return keys.get(key);
    }
}
