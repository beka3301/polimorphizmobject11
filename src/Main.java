public class Main {
    public static void main(String[] args) {
        Animal cow1 = new Cow("Уй1", 7);
        Animal cow2 = new Cow("Уй2", 6);
        Animal cow3 = new Cow("Уй3", 8);


        Animal hors1 = new Hors("Ат1", 5);
        Animal hors2 = new Hors("Ат2", 8);
        Animal hors3 = new Hors("Ат3", 7);

        Animal sheep1 = new Sheep("Кой1", 3);
        Animal sheep2 = new Sheep("Кой2", 5);
        Animal sheep3 = new Sheep("Кой3", 6);

        Animal[] animals = {cow1, cow2, cow3, hors1, hors2, hors3, sheep1, sheep2, sheep3};

        Cow[] cows = new Cow[3];
        Hors[] hors = new Hors[3];
        Sheep[] sheep = new Sheep[3];
        int a = 0;
        int b = 0;
        int c = 0;
        for (Animal animal : animals) {
            if (animal instanceof Cow) {
                cows[a] = (Cow) animal;
                a++;
            } else if (animal.getClass()== Hors.class) {
                hors[b] = (Hors) animal;
                b++;
            } else {
                sheep[c] = (Sheep) animal;
                c++;
            }
        }
        for (Cow cowe : cows) {
            System.out.print(cowe);
            cowe.gives();
            cowe.cow();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Hors hors4 : hors) {
            System.out.print(hors4);
            hors4.gives();
            hors4.hors();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (Sheep sheep4 : sheep) {
            System.out.print(sheep4);
            sheep4.gives();
            sheep4.sheep();
        }
    }
    }
