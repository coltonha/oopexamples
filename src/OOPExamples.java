public class OOPExamples {
    public static void main(String[] args) {
        Circle c1= new Circle();
        
        
        Circle c2=new Circle(2.0);
        c1=c2;
        System.out.println(c1);
        System.out.println(c2);
        c1.setRadius(-1);
        System.out.println("c1's radius is "+c1.getRadius());

        Rectangle r1= new Rectangle();
        Triangle t1= new Triangle();


    }
}
