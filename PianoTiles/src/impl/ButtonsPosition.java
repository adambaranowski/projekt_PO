package impl;

public class ButtonsPosition {

    private double key1x;
    private double key2x;
    private double key3x;
    private double key4x;

    private double key1y;
    private double key2y;
    private double key3y;
    private double key4y;


    public ButtonsPosition(double key1x, double key2x, double key3x, double key4x, double key1y, double key2y, double key3y, double key4y) {
        this.key1x = key1x;
        this.key2x = key2x;
        this.key3x = key3x;
        this.key4x = key4x;
        this.key1y = key1y;
        this.key2y = key2y;
        this.key3y = key3y;
        this.key4y = key4y;
    }

    public void UpdatePosition(int y1, int y2, int y3, int y4){
        key1y = y1;
        key2y = y2;
        key3y = y3;
        key4y = y4;
        key1x = 2;
        key2x = 77;
        key3x = 152;
        key4x = 227;
    }


    public double getKey1x() {
        return key1x;
    }
    public double getKey2x() {
        return key2x;
    }
    public double getKey3x() {
        return key3x;
    }
    public double getKey4x() {
        return key4x;
    }
    public double getKey1y() {
        return key1y;
    }
    public double getKey2y() {
        return key2y;
    }
    public double getKey3y() {
        return key3y;
    }
    public double getKey4y() {
        return key4y;
    }
}
