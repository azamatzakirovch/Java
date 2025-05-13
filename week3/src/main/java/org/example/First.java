package org.example;

public class First {

    double length = 1, height = 1;

    public void setLength(double newLength) {
        if (newLength > 0.0 && newLength < 20.0) {
            length = newLength;
        } else {
            System.out.println("Invalid length. Must be > 0.0 and < 20.0");
        }
    }

    public void setHeight(double newHeight) {
        if (newHeight > 0.0 && newHeight < 20.0) {
            height = newHeight;
        } else {
            System.out.println("Invalid height. Must be > 0.0 and < 20.0");
        }
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double size(){
        return getLength() * getHeight();
    }

    public double perimeter(){
        return (getLength() + getHeight()) * 2;
    }


    public static void main(String[] args){
        System.out.println("==================TASK1==================");
        First first = new First();
        System.out.println(first.size());
    }
}
