
public class polymorphisms {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        shape.area();
        circle.area();
        square.area();
    }
    
}


class Shapes {
    void area() {
        System.out.println("I am in shapes");
    }

//      Early binding: check notes
//    final void area() {
//        System.out.println("I am in shapes");
//    }
}


class Circle extends Shapes{

    // this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation
    void area() {
        System.out.println("Area is pi * r * r");
    }
}

class Square extends Shapes{
    void area() {
        System.out.println("Area is square of side");
    }
}