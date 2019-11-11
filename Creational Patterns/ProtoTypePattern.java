interface Shape extends Cloneable{
    Shape makeCopy();
};

class Square implements  Shape{
    public String message = "Unknown";
    public Square(String data){ this.message = data;}
    public Square makeCopy(){
        Square sq = null;
        try{
            sq = (Square) super.clone();
            return sq;
        }catch(Exception ex){
            System.out.println("Exception found!");
        }
        return  null;
    }
};

class Client {
    public static void main(String[] args){
        Square sq1 = new Square("I am ananta");
        Square sq2 = sq1.makeCopy();
        System.out.println(sq1.message);
        System.out.println(sq2.message);
    };
}