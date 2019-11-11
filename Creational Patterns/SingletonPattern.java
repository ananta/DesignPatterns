class SingleTon {
    private static SingleTon sg = new SingleTon();
    SingleTon(){}
    public static SingleTon getInstance(){
        return  sg;
    }
    public void getMemoryInfo () {
       System.out.println(System.identityHashCode(sg));
    }
};

class Client {
    public static void main(String[] args){
        // Let's create two objects from the same class SingleTon and check their memory address in the system
        SingleTon sg = SingleTon.getInstance();
        sg.getMemoryInfo();
        SingleTon sg2 = SingleTon.getInstance();
        sg2.getMemoryInfo();
    }
}