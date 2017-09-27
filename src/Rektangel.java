// Define the rectangle class with two constructors
class Rektangel {
    double width;
    double hight;
    /** Construct a rectangle with hight and width = 1 - this is the no-arg constructor*/
    Rektangel() {
        width = 1;
        hight = 1;
    }
    /** Construct a rectangle with specified hight and width */
    Rektangel (double newWidth, double newHight ) {
        width = newWidth;
        hight = newHight;    }

    /** Return the area of this rectangle */
    double getArea() { return width * hight; }
    /** Return the perimeter of this rectangle*/
    double getPerimeter() { return (2 * (width + hight));    }


}