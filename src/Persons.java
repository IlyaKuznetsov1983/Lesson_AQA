public class Persons {
    private String fio;
    private int age;
    private String email;

    public int getAge() {
        return this.age;
    }

    public Persons(String fio, String email, int age) {
        this.fio = fio;
        this.email = email;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("fio" + " " + this.fio + " " + "email" + " " + this.email + "age" + " " + this.age);
    }
}
