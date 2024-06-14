public class Triangle implements Figures {
    private String backgroundColor;
    private String borderColor;
    private double a;
    private double b;
    private double c;
    private double h;
    public Triangle(String backgroundColor, String borderColor, double a, double b, double c, double h) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    public double areaCalculation(){
        return a * h / 2;
    };
    public double perimeterCalculation(){
        return a + b + c;
    };

    public void printInfo() {
        System.out.println("Triangle : ");
        System.out.println(
                "\t background color - " + backgroundColor + "\n"
                        + "\t border color - " + borderColor + "\n"
                        + "\t area - " + areaCalculation() + "\n"
                        + "\t perimeter - " + perimeterCalculation() + "\n"
        );
    }
}
