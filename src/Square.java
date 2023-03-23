public class Square {

    private double lenght;
    private double width;

    // constructor method
    public Square(double length, double width) {
        this.lenght = length;
        this.width = width;
    }

    // Getter
    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    // Setter
 /*   public void setLenght(double newLenth) {
        this.lenght = newLenth;
        System.out.println("Length: " + newLenth);
    }

    public void setWidth(double newWidth) {
        this.width = newWidth;
        System.out.println("Width: " + newWidth);
    }*/


    public void calculateSquare() {
        if (lenght <= 0 || width <= 0) {
            System.out.println("Invalid Square! with length " + lenght + " and width " + width);

        } else {
            System.out.println("Valid Square! with length " + lenght + " and width " + width);
            calculatePerimeter();
            calculateArea();
        }
    }

    public void calculatePerimeter() {
        double perimeter = 2 * lenght + 2 * width;
        System.out.println("Perimeter " + perimeter);
    }

    public void calculateArea() {
        double area = lenght + width;
        System.out.println("Area " + area);
    }


}


