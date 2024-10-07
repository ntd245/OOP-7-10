public class Animal {
    protected boolean swim = false;
    protected boolean walk = false;
    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        if(name.equals("pig"))
        {
            this.swim = false;
            this.walk = true;
        }
        else if(name.equals("duck")) {
            this.swim = true;
            this.walk = true;
        }
        else if(name.equals("fish")) {
            this.swim = true;
            this.walk = false;
        }
        this.name = name;
    }

    public boolean canSwim() {
        return this.swim;
    }

    public boolean canWalk() {
        return this.walk;
    }
}
