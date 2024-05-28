public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Persons[] persons =
                new Persons[]{
                        new Persons("Efremov", "ivan@mail.ru", 47),
                        new Persons("Castaneda", "carlos@gmail.com", 33),
                        new Persons("Strugatsky", "strugatkybrothers@mail.ru", 53),
                        new Persons("Glukhovsky", "metro2033@mail.ru", 27),
                        new Persons("Pelevin", "sigmundinacage@mail.ru", 49)};

        for(int i = 0; i < persons.length; ++i) {
            if (persons[i].getAge() > 40) {
                persons[i].printInfo();
            }
        }

    }
}