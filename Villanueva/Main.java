public class Main {
    public static void main(String[] args) {
        System.out.println("************************************");
        Shape shape = new Shape("Blueberry", "Rough!");
        System.out.println("The color of the shape: " + shape.getColor());
        System.out.println("The texture of the shape: " + shape.getTexture ());
        System.out.println("************************************");
   
        Circle circle = new Circle("Violet", "Squishy", 120);
        System.out.println("The area of the circle: " + circle.getArea());
        System.out.println("The color of the circle: " + circle.getColor());
        System.out.println("The texture of the circle: " + circle.getTexture ());
        System.out.println("************************************");
       
        Cylinder cylinder = new Cylinder("SkyBlue", "Shiny", 100, 100);
        System.out.println("The volume of the cylinder: " + cylinder.getVolume());
        System.out.println("The color of the cylinder: " + cylinder.getColor());
        System.out.println("The texture of the cylinder: " + cylinder.getTexture ());
        System.out.println("************************************");
       
        Rectangle rectangle = new Rectangle("Sunburst Yellow", "Glossy", 11, 12);
        System.out.println("The area of the rectangle: " + rectangle.getArea());
        System.out.println("The color of the rectangle: " + rectangle.getColor());
        System.out.println("The texture of the rectangle: " + rectangle.getTexture ());
        System.out.println("************************************");
    
        Box box = new Box("Passion Orange", "Glossy", 10, 20, 30);
        System.out.println("The volume of the box: " + box.getVolume());
        System.out.println("The color of the box: " + box.getColor());
        System.out.println("The texture of the box: " + box.getTexture ());
        System.out.println("************************************");
        
        Triangle triangle = new Triangle("Moss Green", "Polished", 100, 50);
        System.out.println("The area of the triangle: " + triangle.getArea());
        System.out.println("The color of the triangle: " + triangle.getColor());
        System.out.println("The texture of the triangle: " + triangle.getTexture ());
        System.out.println("***********************************");
        
        Pyramid pyramid = new Pyramid("Taffeta White", "Skinned", 420, 960, 70);
        System.out.println("The volume of the pyramid: " + pyramid.getVolume());
        System.out.println("The color of the pyramid: " + pyramid.getColor());
        System.out.println("The texture of the pyramid : " + pyramid.getTexture ());
        System.out.println("***********************************");

        Square square = new Square("Midnight Black", "Striped", 69);
        System.out.println("The area of the square: " + square.getArea());
        System.out.println("The color of the square: " + square.getColor());
        System.out.println("The texture of the square: " + square.getTexture ());
        System.out.println("***********************************");
        
        Cube cube = new Cube("Dark Black", "Grainy", 500);
        System.out.println("The volume of the cube : " + cube.getVolume());
        System.out.println("The color of the cube : " + cube.getColor());
        System.out.println("The texture of the cube: " + cube.getTexture ());
        System.out.println("***********************************");
        
    }
}
