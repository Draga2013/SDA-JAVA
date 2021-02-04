package Fundamentals;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
// Metoda equals -- suprascrie metoda equals
    public boolean equals(Dog dog) {
        return (this.name == dog.getName());
    }
}
