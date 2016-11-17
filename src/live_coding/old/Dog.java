package live_coding.old;

public class Dog {

    private String name;
    private int age;
    private String breed;
    private int barkCount = 0;
    private boolean tired = false;

    public Dog(String breed) {
        this.name = null;
        this.age = 0;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark() {
        if (barkCount >= 3) {
            tired = true;
        }
        if (tired) {
            System.out.println("Too tired!");
        } else {
            System.out.println("Voff");
            barkCount++;
        }
    }

    public void bark(int count) {
        for (int i = 0; i <count; i++) {
            bark();
        }
    }

}
