public class RectangleFromSimpleGeometricObject extends GeometricObject{
    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject(){}

    public RectangleFromSimpleGeometricObject(double width, double height){
        this.width = width;
        this.height = height;
    }

    public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        double area = this.width * this.height;
        return area;
    }

    public double getPerimeter(){
        double perimeter = (this.width * 2) + (this.height * 2);
        return perimeter;
    }
    
}
