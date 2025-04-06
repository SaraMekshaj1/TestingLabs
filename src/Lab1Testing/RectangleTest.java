package Lab1Testing;

public class RectangleTest {
    public static void main(String[]args){
        Rectangle r1=new Rectangle(3,6);
        int area=r1.getArea();
       int perimeter= r1.getPerimeter();
       System.out.println("Area"+area+", perimeter:"+perimeter);
    }
}
