package impl;

import java.util.HashMap;

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

    public double getKey1x() {
        return key1x;
    }

    public void setKey1x(double key1x) {
        this.key1x = key1x;
    }

    public double getKey2x() {
        return key2x;
    }

    public void setKey2x(double key2x) {
        this.key2x = key2x;
    }

    public double getKey3x() {
        return key3x;
    }

    public void setKey3x(double key3x) {
        this.key3x = key3x;
    }

    public double getKey4x() {
        return key4x;
    }

    public void setKey4x(double key4x) {
        this.key4x = key4x;
    }

    public double getKey1y() {
        return key1y;
    }

    public void setKey1y(double key1y) {
        this.key1y = key1y;
    }

    public double getKey2y() {
        return key2y;
    }

    public void setKey2y(double key2y) {
        this.key2y = key2y;
    }

    public double getKey3y() {
        return key3y;
    }

    public void setKey3y(double key3y) {
        this.key3y = key3y;
    }

    public double getKey4y() {
        return key4y;
    }

    public void setKey4y(double key4y) {
        this.key4y = key4y;
    }

    /*
    private HashMap<String, Integer> positionY = new HashMap<String, Integer>();
    private HashMap<String, Integer> positionX = new HashMap<String, Integer>();

    public HashMap<String, Integer> getPositionY() {
        return positionY;
    }

    public void setPositionY(HashMap<String, Integer> positionY) {
        this.positionY = positionY;
    }

    public HashMap<String, Integer> getPositionX() {
        return positionX;
    }

    public void setPositionX(HashMap<String, Integer> positionX) {
        this.positionX = positionX;
    }

    public ButtonsPosition(int key1x, int key2x, int key3x, int key4x, int key1y, int key2y, int key3y, int key4y){
        positionY.put("key1", key1y);
        positionY.put("key2", key2y);
        positionY.put("key3", key3y);
        positionY.put("key4", key4y);

        positionX.put("key1", key1x);
        positionX.put("key2", key2x);
        positionX.put("key3", key3x);
        positionX.put("key4", key4x);
    }*/

}
