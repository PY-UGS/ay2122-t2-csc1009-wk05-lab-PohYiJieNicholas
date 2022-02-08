public class Triangle extends Shape{
    public Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    
    public double area(){
        System.out.println("Inside Area of Triangle.");
        return 0.5 * dim1 * dim2;
    }
}
