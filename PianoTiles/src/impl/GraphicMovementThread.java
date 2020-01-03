package impl;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class GraphicMovementThread extends Thread {
    private int y1 = -200;
    private int y2 = -250;
    private int y3 = -300;
    private int y4 = -350;
    Random random = new Random();


    HashSet<Integer> randomNumsSet = new LinkedHashSet<Integer>();
    int[] randomNums = new int[4];


    public void run() {

            try {

                //sleep(500);
                while (true) {
                    sleep(10);
                    y1 += 1;
                    y2 += 1;
                    y3 += 1;
                    y4 += 1;


                    while(true){
                        randomNumsSet.add(random.nextInt(5));
                        if(randomNumsSet.size()==4){
                            break;
                        }
                    }

                    int i = 0;
                    for (int x: randomNumsSet
                         ) {
                        randomNums[i]=x;
                        i++;
                    }
                    //System.out.println(randomNumsSet.toString());
                    randomNumsSet.clear();



                    if (y1 > 300) {
                        y1 = randomNums[0] * 50 - 200;
                    }
                    if (y2 > 300) {
                        y2 = randomNums[1] * 50 - 200;
                    }
                    if (y3 > 300) {
                        y3 = randomNums[2] * 50 - 200;
                    }
                    if (y4 > 300) {
                        y4 = randomNums[3] * 50 - 200;
                    }

                }



            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getY3() {
        return y3;
    }

    public int getY4() {
        return y4;
    }
}
