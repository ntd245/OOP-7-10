public class Animal {
    protected boolean swim = false;
    protected boolean walk = false;
    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
    public boolean canSwim() {
        return this.swim;
    }

    public boolean canWalk() {
        return this.walk;
    }
}
