public class Colors {
    public static void main (String [] args) {
        printColor();
    }
     public static void printColor() {
        int value = 777;
        if (value <=0) {
            System.out.println("red");
        } if (value>0 && value<100) {
            System.out.println("yellow");
         } if (value>100) {
            System.out.println("green");
         }
     }
}
