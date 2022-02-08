public class Ellipse extends Shape{
    public Ellipse(double dim1, double dim2){
        super(dim1, dim2);
        
    }
    
    public double area(){
        System.out.println("Inside Area of Ellipse.");
        return PI * dim1 * dim2;
    }
}
