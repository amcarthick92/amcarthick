interface Soundable{
	public void sound();
}

interface nonSoundable{
	public void nonSound();
}
interface Parrot{
	public void parrot();
}
interface Swimable{
	public void swim();
}
interface Metamorphosis{
	public void family();
}
interface Crawlable{
	public void crwal();
}
class Animal{
	void walk(){
		System.out.println("Animal can walk");
	}
}
class Bird extends Animal{
	void fly(){
		System.out.println("Bird can fly");
	}
	void sing(){
		System.out.println("Bird can sing");
	}
}
class Fish extends Animal{
	void sing(){
		System.out.println("Fish can not sing");
	}
	void walk(){
		System.out.println("Fish can not walk");
	}
	void swim(){
		System.out.println("Fish can swim");
	}
}
class Shark extends Fish{
	void size(){
		System.out.println("Shark's are large");
	}
	void colour(){
		System.out.println("Shark colour is grey");
	}
	void food(){
		System.out.println("Shark can eat other fish");
	}
}
class Clowfish extends Fish{
	void size(){
		System.out.println("Clowfish are small");
	}
	void colour(){
		System.out.println("Clowfish are orange colour");
	}
}
class Dolphins extends Duck implements Swimable{
	
}
class Duck extends Bird implements Soundable,Swimable,Parrot{
	public void sound(){
		System.out.println("Qack,quack");
	}
	public void swim(){
		System.out.println("Duck can swim");
	}
	public void parrot(){
		
	}
}
class Chicken extends Animal implements Soundable{
	public void sound(){
		System.out.println("Cluck, cluck");
	}
}
class Dog extends Animal implements Parrot{
	public void parrot(){
		System.out.println("Woof, woof");
	}
}
class Cat extends Animal implements Parrot{
	public void parrot(){
		System.out.println("Meow");
	}
}
class Butterfly extends Bird implements nonSoundable,Metamorphosis{
	public void nonSound(){
		System.out.println("Butterfly can not sound");
	}
	public void family(){
		System.out.println("Butterfly comes from Caterpillar");
	}
}
class Caterpillar extends Butterfly implements Crawlable{

	public void crwal() {
		System.out.println("A caterpillar can walk (crwal)");
	}
}



public class Solution {
public static void main(String[] args) {
	Bird bird = new Bird();
	Duck duck = new Duck();
	Chicken chicken = new Chicken();
	Dog dog = new Dog();
	Cat cat = new Cat();
	Roaster roaster = new Roaster();
	Shark shark = new Shark();
	Clowfish clowfish = new Clowfish();
	Dolphins dolphins = new Dolphins();
	Butterfly butterfly = new Butterfly();
	Caterpillar caterpillar = new Caterpillar();
	bird.walk();
	bird.fly();
	bird.sing();
	duck.sound();
	new Roaster(){
	}.sound();
	dog.parrot();
	cat.parrot();
	roaster.parrot();
	duck.sound();
	shark.sing();
	shark.size();
	dolphins.swim();
	butterfly.fly();
	butterfly.nonSound();
	caterpillar.family();
	caterpillar.crwal();
}
}
