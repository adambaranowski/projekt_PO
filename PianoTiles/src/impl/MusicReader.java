package impl;

import api.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MusicReader implements Reader{

    private List<String> song = new LinkedList<>();
    private String fileName;

    @Override
    public void readSong() throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        
        String line = bufferedReader.readLine();
        while (line != null){
            song.add(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        fileReader.close();
    }

    //GETTERY

    public List<String> getSong() {
        return song;
    }

    public String getFileName() {
        return fileName;
    }

    //SETTERY


    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    //CONSTRUCTOR

    public MusicReader(String fileName) {
        this.fileName = fileName;
    }

    public MusicReader(){
    }

}
