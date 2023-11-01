/*
  https://www.codewars.com/kata/building-blocks/
 */

package com.softserve.homework03.additionaltask;

public class Block{
    private int width;
    private int length;
    private int height;

    public Block(int[] sides) {
        this.width = sides[0];
        this.length = sides[1];
        this.height = sides[2];
    }

    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }
    public int getVolume() {
        return getWidth() * getLength() * getHeight();
    }
    public int getSurfaceArea() {
        return 2 * (getLength() * getHeight()) + 2 * (getLength() * getWidth()) + 2 * (getWidth() * getHeight());
    }
}