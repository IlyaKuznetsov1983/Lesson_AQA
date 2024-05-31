public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Persons[] persons =
                new Persons[]{
                        new Persons("Efremov", "Director","ivan@mail.ru", 987654321 , 100500, 47),
                        new Persons("Castaneda", "Manager","carlos@gmail.com", 123456789,334455,33),
                        new Persons("Strugatsky", "Postman" , "strugatkybrothers@mail.ru", 99988877,1010101,53),
                        new Persons("Glukhovsky", "Writer", "metro2033@mail.ru", 77777777, 1000000, 27),
                        new Persons("Pelevin", "Doctor", "sigmundinacafe@mail.ru", 3030303, 999000, 49)};

        for(int i = 0; i < persons.length; ++i) {
            if (persons[i].getAge() > 40) {
                persons[i].printInfo();
            }

                    Park park = new Park();

                    park.addAttraction("American Road", "8.00 - 22.00", 5.50);
                    park.addAttraction("Jumper \"last life\"", "9.00 - 21.00", 1.50);
                    park.addAttraction("Ozz", "8.00 - 20.00", 7.00);
                    park.addAttraction("Great Wall", "9.00 - 18.00", 4.00);
                    park.addAttraction("Machu Picchu", "8.00 - 15.00", 6.00);

                    System.out.println(park.toString().replace("[", "")
                            .replace("]", ""));
                }
            }
        }


