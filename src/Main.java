public class Main {
    public static void main(String[] args) {

        Dog Jack_Russell = new Dog();
        Dog Huskie = new Dog();

        Jack_Russell.running(150); //dog ran 150 meters
        Jack_Russell.swimming(15); //dog can't do that

        Huskie.running(600); //dog can't do that
        Huskie.swimming(7); //dog swam 7 meters

        Cat Farshik = new Cat();
        Cat Matroskin = new Cat();
        Cat Garfield = new Cat();

        Farshik.run(150);  //cat ran 150 meters
        Farshik.swim(100); //cat can't swim

        Bowl bowl = new Bowl(1);
        bowl.addFood(15);

        Cat[] catsArray = {Farshik, Matroskin, Garfield};

        for (Cat cat : catsArray) {
            cat.eatFromBowl(bowl, 9);
            System.out.println(cat.satiety);
        }
    }
}