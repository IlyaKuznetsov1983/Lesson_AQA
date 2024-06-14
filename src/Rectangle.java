public class Rectangle implements Figures {
    private String backgroundColor;
    private String borderColor;
    private double a;
    private double b;

    public Rectangle(String backgroundColor, String borderColor, double a, double b) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.a = a;
        this.b = b;
    }

    public double calculationArea() {
        return a * b;
    }

    public double calculationPerimeter() {
        return 2 * (a + b);
    }

    public void printInfo() {
        System.out.println("Rectangle: ");
        System.out.println(
                "\t background color - " + backgroundColor + "\n"
                        + "\t border color - " + borderColor + "\n"
                        + "\t area - " + calculationArea() + "\n"
                        + "\t perimeter - " + calculationPerimeter() + "\n"
        );
    }
}
