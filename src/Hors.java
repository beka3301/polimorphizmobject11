public class Hors extends Animal {

    public Hors(String name, int age) {
        super(name, age);
    }

    @Override
    void gives() {
        System.out.print(" The horse can give kumys,");
    }
    public void hors() {
        System.out.println("Жакшы чуркайт ");
    }

    @Override
    public String toString() {
        return "Hors{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
