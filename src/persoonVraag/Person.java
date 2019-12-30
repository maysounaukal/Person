package persoonVraag;

import java.util.Arrays;

public abstract class Person {
	private double weigth;
	private int age;
	private static int count;
	private Address address;
	private Pet[] pets;
	private Hobby[] hobbies = new Hobby[0];
	private House house;
	
	public abstract void showMyHobbies();

	public Person() {
		super();
	}

	public Person(double weigth, int age, Address address, Pet[] pets, Hobby[] hobbies, House house) {
		super();
		this.weigth = weigth;
		this.age = age;
		this.address = address;
		this.pets = pets;
		this.hobbies = hobbies;
		this.house = house;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Pet[] getPets() {
		return pets;
	}

	public void setPets(Pet[] pets) {
		this.pets = pets;
	}

	public Hobby[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(Hobby[] hobbies) {
		this.hobbies = hobbies;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	
	
	
public void addHobby(Hobby hobby) {
		hobbies = Arrays.copyOf(hobbies, hobbies.length +1);

		hobbies[hobbies.length-1] = hobby;

	
	} 

	

	public void addPet(Pet pet) {

		pets = Arrays.copyOf(pets, pets.length +1);

		pets[pets.length-1] = pet;

	}

	@Override
	public String toString() {
		return "Person [weigth=" + weigth + ", age=" + age + ", address=" + address + ", pets=" + Arrays.toString(pets)
				+ ", hobbies=" + Arrays.toString(hobbies) + ", house=" + house + "]";
	}
	

}
