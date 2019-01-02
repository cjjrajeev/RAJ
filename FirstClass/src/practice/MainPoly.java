package practice;

 class Animal {
	public void sound() {
		System.out.println("Animal is making sound");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("Meow  Meow");
	}

}

public class MainPoly {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.sound();
		a=new Dog();
		a.sound();
	}
}
