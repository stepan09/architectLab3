package com.oliinyk;

import java.util.Hashtable;

public class PositionData {

    private static Hashtable<Integer, Position> positionMap = new Hashtable<Integer, Position>();

    public static Position getPosition(int positionId) throws CloneNotSupportedException {
        Position cachedPosition = positionMap.get(positionId);
        return (Position) cachedPosition.clone();
    }

    public static void loadCache(){
        Coach coach = new Coach(1);
        positionMap.put(coach.getId(), coach);

        Cleaner cleaner = new Cleaner(2);
        positionMap.put(cleaner.getId(), cleaner);

    }
}
