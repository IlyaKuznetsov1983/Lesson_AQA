public class Dog extends Animals {
    private static int dogCount = 0;

    public Dog() {
        dogCount++;
    }

    @Override

    public void running(int distance) {
        if (distance >= 0 && distance <= 500) {
            System.out.println("Пёс пробежал " + distance + " метров");
        } else System.out.println("Пёс не хочет");
    }

    @Override
    public void swimming(int distance) {
        if (distance >= 0 && distance <= 10) {
            System.out.println("Пёс проплыл " + distance + " метров");
        } else System.out.println("Пёс устал как собака");
    }
}