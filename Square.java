public class Square extends Shape{
    public Square(double dim1, double dim2){
        super(dim1, dim2);
    }
    
    public double area(){
        System.out.println("Inside Area of Square.");
        return dim1 * dim2;
    }
}
