package OpenClose;
import java.util.ArrayList;
import java.util.List;


public class OpenClose_badcase {

    public static class Shape { 

    }


    public static class Square extends Shape{
        public int size;

        public Square(int size) {
            this.size = size;
        }
        
    }

    public static class Rectangle  extends Shape { 
        public int width;
        public int height;

        public Rectangle(int width,int height) {
            this.width = width;
            this.width = height;
        }
    }

    public static class Triangle extends Shape {
        public int width;
        public int height;
        public Triangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        
    }

    public void AreaCalculator() {
        List<Shape> shapes = new ArrayList();
        shapes.add(new Rectangle(3,3));
        shapes.add(new Triangle(3,3));
        shapes.add(new Square(3));

        for (Shape shape : shapes) {
                if (shape instanceof Rectangle) {
                    //handle logic calculate
                }

                if (shape instanceof Triangle) {
                    // hanlde logic calculate
                }
        }
        
    }


    /* 
     * you have to implement every logic of each shape in one class, so when u add new class, you have to modify the AreaCalculator
    */


    public static void main(String[] args) {
        
    }
}
