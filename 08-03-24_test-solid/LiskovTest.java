

public class LiskovTest {

    static class Shape {
        protected int area;
    
        public int getArea() {
            return area;
        }

        public void setWidth(int width){};
    
        public void setHeight(int height){};
        
    }
    
    static class Rectangle extends Shape {
        private int width;
        private int height;
    
        public void setWidth(int width) {
            this.width = width;
        }
    
        public void setHeight(int height) {
            this.height = height;
        }
    
        @Override
        public int getArea() {
            return width * height;
        }
    }
    
    static class Square extends Rectangle {
    
        public void setSide(int side) {
            this.setWidth(side);
            this.setHeight(side);
        }
        public void setWidth(int width) {
            setSide(width);
        }
    
        public void setHeight(int height) {
            setSide(height);
        }
    }



    public static void calculateArea(Shape shape) {
        // Use the shape object without knowing its specific type
        int area = shape.getArea();
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);

        Rectangle rect = new Square();
        rect.setWidth(0);


        Square square = new Square();
        square.setSide(5);

        calculateArea(rectangle); // Output: Area: 50
        calculateArea(square); // Output: Area: 25
    }
}