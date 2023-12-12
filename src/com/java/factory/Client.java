package com.java.factory;

public class Client {
    public static void main(String[] args){
        // triangle
        Polygon polygon = PolygonFactory.getInstance(3);
        System.out.println(polygon.getType());

        // square
        Polygon square = PolygonFactory.getInstance(4);
        System.out.println(square.getType());

        // pentagon
        Polygon pentagon = PolygonFactory.getInstance(5);
        System.out.println(pentagon.getType());

    }
}
