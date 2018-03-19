package com.oliinyk;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        PositionData.loadCache();

        Position clonedPosition =  PositionData.getPosition(1);
        clonedPosition.work();

        Position clonedPosition1 = PositionData.getPosition(2);
        clonedPosition1.work();
    }
}
