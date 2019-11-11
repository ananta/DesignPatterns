interface Shape{
    void draw();
}
class Square implements  Shape{
    public void draw(){
        System.out.println("Drawing Square");
    }
}
class Rectangle implements  Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Circle implements  Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
};

class Factory {
    Shape generateShape(String shape){
        switch (shape){
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
            default:
                return null;
        }
    };
};

class Client {
    public static void main(String[] args){
        Shape square = new Factory().generateShape("Square");
        Shape rectangle = new Factory().generateShape("Rectangle");
        Shape circle = new Factory().generateShape("Circle");
        square.draw();
        rectangle.draw();
        circle.draw();
    }
}