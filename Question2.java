public class Question2 {
    public static void main(String[] args){
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Circle c = new Circle(5,5);
        Ellipse e = new Ellipse(7,7);
        Square s =new Square(6,6);
        Shape figerf;
        figerf = r;
        System.out.println("Area is " + figerf.area());
        figerf = t;
        System.out.println("Area is " + figerf.area());
        figerf = c;
        System.out.println("Area is " + figerf.area());
        figerf = e;
        System.out.println("Area is " + figerf.area());
        figerf = s;
        System.out.println("Area is " + figerf.area());
    }
}
