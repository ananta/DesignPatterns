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
class RoundedSquare implements  Shape{
    public void draw(){
        System.out.println("Drawing Rounded Square");
    }
}
class RoundedRectangle implements  Shape{
    public void draw(){
        System.out.println("Drawing RoundedRectangle");
    }
}

abstract class AbstractFactory {
    abstract Shape getShape(String type);
}
class ShapeFactory extends AbstractFactory{
    public Shape getShape(String type){
        if (type == "Square") return new Square();
        return new Rectangle();
    };
}
class RoundedShapeFactory extends AbstractFactory{
    public Shape getShape(String type){
        if (type == "Square") return new RoundedSquare();
        return new RoundedRectangle();
    };
}
class FactoryProducer {
    public static AbstractFactory generateFactory(boolean rounded){
        if(rounded) return new RoundedShapeFactory();
        return new ShapeFactory();
    }
}

class Client {
    public static void main(String[] args){
        AbstractFactory roundedFactory = FactoryProducer.generateFactory(true);
        AbstractFactory simpleFactory = FactoryProducer.generateFactory(false);
        roundedFactory.getShape("Square").draw();
        simpleFactory.getShape("Square").draw();
    }
}