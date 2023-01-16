public class  Cow extends Animal {

    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    void gives() {
        System.out.print(" gives milk,");
    }
    public void cow() {
        System.out.println("good apetit");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
