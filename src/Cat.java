
public class Cat extends Animals {

    private static int catCount = 0;
    public boolean satiety = false;

    public Cat() {
        catCount++;
    }
    public void eatFromBowl(Bowl bowlForFood, int foodToEat) {
        if (bowlForFood.getAmountFood() >= foodToEat) {
            System.out.println("Кот ест");
            satiety = true;
        } else {
            System.out.println("Кот голодный");
        }
    }

    @Override
    public void running(int distance) {
        if (distance >= 0 && distance <= 200) {
            System.out.println("Кот бежит " + distance + " метров");
        } else System.out.println("Это плохо для котика");
    }

    @Override
    public void swimming(int distance) {
        System.out.println("Кот не любит воду");
    }

}