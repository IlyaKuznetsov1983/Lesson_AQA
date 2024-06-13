public class Dog extends Animals {

    private static int dogCount = 0;

    public Dog() {
        dogCount++;
    }


    @Override

    public void run(int distance) {
        if (distance >= 0 && distance <= 500) {
            System.out.println("Собака бежит " + distance + " метров");
        } else System.out.println("Собака не хочет");
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0 && distance <= 10) {
            System.out.println("Собака плывет " + distance + " метров");
        } else System.out.println("Собака устал");
    }
}