package edu.unca.csci201;


public class Main {

    public static void main(String[] args) {
        Sphere s1 = new Sphere("baseball", 1.43);
        Sphere s2 = new Sphere("eyeball", 0.475);
        Cube c1 = new Cube("rubik's cube", 2.126, "multi color");
        Cube c2 = new Cube("sugar cube",5.241, "white");
        
        System.out.println(s1.getShapeName());
        System.out.println(s1.getVolume());
        
        System.out.println(s2.getShapeName());
        System.out.println(s2.getRadius());
        
        System.out.println(c1.getShapeName());
        System.out.println(c1.getColor());
        
        System.out.println(c2.getShapeName());
        System.out.println(c2.getSideLength());
        System.out.println(c2.getVolume());
    }

}
