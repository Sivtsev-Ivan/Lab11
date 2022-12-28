package Lab11;

public class test {
    public static void main(String[] argc) {
        Triangle tr = new Triangle(3, 4, 5);
        tr.print();
        tr.perimeter();
        tr.area();
        Rectangle rc = new Rectangle(3, 4);
        rc.print();
        rc.perimeter();
        rc.area();
        Massiv arr = new Massiv(4);
        arr.enter();
        arr.print();
        arr.sort();
        arr.print();
    }
}
