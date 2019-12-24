package tests;

import impl.MusicReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MusicReaderTest {

    @Test
    public void getSong() throws IOException {

        MusicReader musicReader = new MusicReader("src/impl/Song1.txt");
        List<String> songFromClass = musicReader.getSong();
        List<String> songReal = new ArrayList<>();

        songReal.add("#Song1#120");
        songReal.add("#40#4");
        songReal.add("#41#4");
        songReal.add("#42#4");

        Assert.assertEquals(songReal, songFromClass);
}
}
