import java.lang.Math;

public class CircleFromSimpleGeometricObject extends GeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject(){

    }

    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius; 
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }

    public double getDiameter(){
        double diameter = 2 * this.radius;
        return diameter;
    }

    public void printCircle(){
        double area = getArea();
        double perimeter = getPerimeter();
        double diameter = getDiameter();

        System.out.println("The radius is " + this.radius);
        System.out.println("The area is " + area);
        System.out.println(" The perimeter is " + perimeter);
        System.out.println(" The diameter is " +diameter);
    }
}
