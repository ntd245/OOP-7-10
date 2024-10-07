public class Farm {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Pig a1 = new Pig("pig");
        Fish a2 = new Fish("fish");
        Duck a3 = new Duck("duck");
        animals[0] = (Animal) a1;
        animals[1] = (Animal) a2;
        animals[2] = (Animal) a3;
        System.out.println("swim:");
        for (int i = 0; i < animals.length; i++) {
            if(animals[i].canSwim()) {
                System.out.println(animals[i].name + " ");
            }
        }
        System.out.println("walk:");
        for (int i = 0; i < animals.length; i++) {
            if(animals[i].canWalk()) {
                System.out.println(animals[i].name + " ");
            }
        }
    }
}
