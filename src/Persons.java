public class Persons {
    private String fio;
    private String post;
    private int age;
    private int telephone;
    private int cash;
    private String email;

    public int getAge() {
        return this.age;
    }

    public Persons(String fio,String post, String email, int telephone, int cash, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.cash = cash;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("fio" + " " + this.fio + "post" + " " + this.post + " " + "email" + " " + this.email + " " + "age" + " " + this.age);
    }
}
