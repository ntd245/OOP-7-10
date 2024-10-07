public class Farm {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Animal a1 = new Animal("pig");
        Animal a2 = new Animal("fish");
        Animal a3 = new Animal("duck");
        animals[0] = a1;
        animals[1] = a2;
        animals[2] = a3;
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
