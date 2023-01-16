public class Sheep extends Animal {
    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    void gives() {
        System.out.print(" The sheep can give meat and wool,");
    }

    public void sheep() {
        System.out.println("Есть польза от мясо ");
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
