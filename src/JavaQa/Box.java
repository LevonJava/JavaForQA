package JavaQa;

public class Box {
    double width;
    double height;
    double depth;

    @Override
    public String toString() {
        return "Box{" +
                "width = " + width +
                ", height = " + height +
                ", depth = " + depth +
                '}';
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 9;
        mybox2.height = 6;
        mybox2.depth = 3;

        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
        System.out.println(mybox1);
        System.out.println(mybox2);
        System.out.println();

        Box b1 = new Box();
        Box b2 = b1;
        b1 = null;
        System.out.println(b1);
        System.out.println(b2);

    }

}

