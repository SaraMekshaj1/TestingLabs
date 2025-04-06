package Lab1Testing;

public class Rectangle {
    int x,y;

    public Rectangle(int length,int width){
        this.x=length;
        this.y=width;
    }
    public int getArea(){
        return x*y;
    }
    public int getPerimeter(){
        return 2*(x+y);
    }

}
