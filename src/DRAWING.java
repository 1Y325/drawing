abstract class shape{
    abstract  void draw();
    abstract  void erase();
}
class circle extends shape{
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    void erase() {
        System.out.println("erase circle");
    }
}
class triangle extends shape{
    @Override
    void draw() {
        System.out.println("draw triangle");
    }

    @Override
    void erase() {
        System.out.println("erase triangle");
    }
}
class square extends shape{
    @Override
    void draw() {
        System.out.println("drwaing square");
    }

    @Override
    void erase() {
        System.out.println("erase square");
    }
}
class DRAWING{
    public static void main(String[] args) {
        //circle obj1 = new circle();
        shape c=new circle();
        shape b = new triangle();
        shape a = new square();
        c.draw();
        c.erase();
        System.out.println("--------------------");
        b.draw();
        b.erase();
        System.out.println("--------------------");
        a.draw();
        a.erase();
    }
}
