package edu.unca.csci201;
public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector3D subtract(Vector3D other) {
        return new Vector3D(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public double dotProduct(Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector3D crossProduct(Vector3D other) {
        double resultX = this.y * other.z - this.z * other.y;
        double resultY = this.z * other.x - this.x * other.z;
        double resultZ = this.x * other.y - this.y * other.x;
        return new Vector3D(resultX, resultY, resultZ);
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // You can add more operations as needed

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D vector2 = new Vector3D(4.0, 5.0, 6.0);

        Vector3D sum = vector1.add(vector2);
        Vector3D difference = vector1.subtract(vector2);
        double dotProduct = vector1.dotProduct(vector2);
        Vector3D crossProduct = vector1.crossProduct(vector2);
        double magnitude = vector1.magnitude();

        System.out.println("Vector1: " + vector1);
        System.out.println("Vector2: " + vector2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Dot Product: " + dotProduct);
        System.out.println("Cross Product: " + crossProduct);
        System.out.println("Magnitude of Vector1: " + magnitude);
    }
}
