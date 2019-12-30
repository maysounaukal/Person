package persoonVraag;

public abstract class Pet {
private int weigth;
private int age;
private String name;
protected int realAge;
public abstract void beCute();
public Pet() {
	super();
}
public Pet(int weigth, int age, String name, int realAge) {
	super();
	this.weigth = weigth;
	this.age = age;
	this.name = name;
	this.realAge = realAge;
}




}
