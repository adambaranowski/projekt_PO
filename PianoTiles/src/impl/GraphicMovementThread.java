package impl;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class GraphicMovementThread extends Thread {
    private int y1 = -200;
    private int y2 = -250;
    private int y3 = -300;
    private int y4 = -350;
    Random random = new Random();

    private boolean ifCrossTheBoard = false;

    public boolean getIfCrossTheBoard() {
        return ifCrossTheBoard;
    }

    HashSet<Integer> randomNumsSet = new LinkedHashSet<Integer>();
    int[] randomNums = new int[4];


    public void run() {

            try {


                while (true) {
                    sleep(5);
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
                    randomNumsSet.clear();


                    if (y1 > 300 || y2 > 300 || y3 > 300 || y4 > 300) {
                        ifCrossTheBoard=true;
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public void key1Up(){
        y1 = randomNums[0] * (random.nextInt(50)+30) - 250;
    }
    public void key2Up(){
        y2 = randomNums[1] * (random.nextInt(50)+30) - 300;
    }

    public void key3Up(){
        y3 = randomNums[2] * (random.nextInt(50)+30)- 250;
    }

    public void key4Up(){
        y4 = randomNums[3] * (random.nextInt(50)+30) - 350;
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
