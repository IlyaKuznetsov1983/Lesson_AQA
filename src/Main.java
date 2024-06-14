public class Main {
    public static void main(String[] args) {

        Dog Jack_Russell = new Dog();
        Dog Huskie = new Dog();

        Jack_Russell.running(150);
        Jack_Russell.swimming(15);

        Huskie.running(600);
        Huskie.swimming(7);

        Cat Farshik = new Cat();
        Cat Matroskin = new Cat();
        Cat Garfield = new Cat();

        Farshik.running(170);
        Farshik.swimming(100);

        Bowl bowl = new Bowl(10);
        bowl.addFood(16);

        Cat[] catsArray = {Farshik, Matroskin, Garfield};

        for (Cat cat : catsArray) {
            cat.eatFromBowl(bowl, 8);
            System.out.println(cat.satiety);

            Figures circle = new Circle("зеленый", "оранжевый", 4);
            circle.printInfo();
            Figures triangle = new Triangle("желтый", "серый", 12, 14, 16, 10);
            triangle.printInfo();
            Figures rectangle = new Rectangle("коричневый", "розовый", 15, 20);
            rectangle.printInfo();


        }
    }
}