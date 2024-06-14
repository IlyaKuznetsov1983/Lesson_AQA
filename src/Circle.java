public class Circle implements Figures {
    private String backgroundColor;
    private String borderColor;
    private double r;

    public Circle(String backgroundColor, String borderColor, double r) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.r = r;
    }

    public double calculationArea() {
        return 3.14 * (r * r);
    };
    public double calculationPerimeter() {
        return  2 * 3.14 * r;
    };

    public void printInfo() {
        System.out.println("Circle: ");
        System.out.println(
                "\t background color - " + backgroundColor + "\n"
                        + "\t border color - " + borderColor + "\n"
                        + "\t area - " + calculationArea() + "\n"
                        + "\t perimeter - " + calculationPerimeter() + "\n"
        );
    }
}
