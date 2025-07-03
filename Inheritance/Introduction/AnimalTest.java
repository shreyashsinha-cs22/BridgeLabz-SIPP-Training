import java.util.*;
class Animal {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

// Subclass Bird
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}

// Main class to demonstrate polymorphism
public class AnimalTest {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("kutte ka naam ");
		String s1=sc.nextLine();
		System.out.print("kutte ke umar ");
		int n=sc.nextInt();
		System.out.println("billi ka naam ");
		String s2=sc.nextLine();
		System.out.println("billi ke umar ");
		int b=sc.nextInt();
		System.out.println("chidiya ka naam ");
		String s3=sc.nextLine();
		System.out.println("chidiya ke umar ");
		int c=sc.nextInt();
        Animal dog = new Dog(s1, n);
        Animal cat = new Cat(s2, b);
        Animal bird = new Bird(s3, c);

        // Store in an array and demonstrate polymorphism
        Animal[] animals = {dog, cat, bird};

        System.out.println("--- Animal Sounds ---");
        for (Animal a : animals) {
            System.out.println("Name: " + a.name + ", Age: " + a.age);
            a.makeSound();  // Dynamic method dispatch
        }
    }
}
