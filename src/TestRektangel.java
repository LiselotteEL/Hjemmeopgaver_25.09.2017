public class TestRektangel {
    public static void main(String[] args) {
    //Create a rectangle with width 4 and hight 40
        Rektangel rektangel1 = new Rektangel(4,40);

        Rektangel rektangel2 = new Rektangel (3.5, 35.9);

//prints "headline" for each rectangle
        System.out.println("Rektangel 1"
                + ("               Rektangel 2" + "\n"));

//prints an empty line
        System.out.println("           ");

//prints the width for both rectangle 1 og rectangle 2
        System.out.println("Bredde: " + rektangel1.width
                + "               Bredde: " + rektangel2.width + "\n");

//prints the hight for both rectangle 1 og rectangle 2
        System.out.println("Højde: " + rektangel1.hight
                + "               Højde: " + rektangel2.hight + "\n");

//prints the area for both rectangle 1 og rectangle 2
        System.out.println("Areal: " + rektangel1.getArea()
                + "              Areal: " + rektangel2.getArea() + "\n");

//prints the perimeter for both rectangle 1 og rectangle 2
        System.out.println("Omkreds: " + rektangel1.getPerimeter()
                + "             Omkreds: " + rektangel2.getPerimeter() + "\n");



    }
}

