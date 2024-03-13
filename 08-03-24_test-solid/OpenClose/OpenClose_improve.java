package OpenClose;
import java.util.ArrayList;
import java.util.List;


public class OpenClose_improve {

    public static abstract class Shape { 
        abstract void area();
    }


    public static class Square extends Shape{
        public int size;

        public Square(int size) {
            this.size = size;
        }

        @Override
        void area() {
            // TODO Auto-generated method stub
            
        }

        
        
    }

    public static class Rectangle  extends Shape { 
        public int width;
        public int height;

        public Rectangle(int width,int height) {
            this.width = width;
            this.width = height;
        }

        @Override
        void area() {
            // TODO Auto-generated method stub
            
        }
    }

    public static class Triangle extends Shape {
        public int width;
        public int height;
        public Triangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        void area() {
            // TODO Auto-generated method stub
            
        }

        
    }

    public void AreaCalculator() {
        List<Shape> shapes = new ArrayList();
        shapes.add(new Rectangle(3,3));
        shapes.add(new Triangle(3,3));
        shapes.add(new Square(3));

        for (Shape shape : shapes) {
                shape.area();
        }
        
    }


    /* 
     * you have to implement every logic of each shape in one class, so when u add new class, you have to modify the AreaCalculator
    */


    public static void main(String[] args) {
        
    }
}
