public class Challenge6 {
    void main() {
        System.out.println("-------------------------");
        Shape s = new Shape();
        s.setColor("BLue");
        s.calculateArea();
        System.out.println("-------------------------");
        CCircle cc = new CCircle(24d, "White");
        System.out.println(cc.getColor());
        cc.calculateArea();
        System.out.println("-------------------------");
        CRectangle cr = new CRectangle(24, 5, "Pink");
        System.out.println(cr.getColor());
        cr.calculateArea();
    }

    class Shape {
        private String color;

        Shape() {
        }

        Shape(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void calculateArea() {
            System.out.println("THe area for the shape is cacluated" + color);
        }
    }

    class CCircle extends Shape {
        double radius;

        CCircle(double radius, String color) {
            super(color);
            this.radius = radius;
        }

        @Override
        public void calculateArea() {
            System.out.println("The area of the circle: " + (Math.PI * radius * radius));
        }


    }

    class CRectangle extends Shape {
        int length;
        int breadth;

        CRectangle(int length, int breadth, String color) {
            super(color);
            this.breadth = breadth;
            this.length = length;
        }

        @Override
        public void calculateArea() {
            System.out.println("The area of the Rectangle: " + (length * breadth));
        }
    }
}
