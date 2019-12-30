package persoonVraag;

import java.util.Arrays;

public class Fashionista extends Person{
public Fashionista() {
	super();
}

@Override
public void showMyHobbies() {
	System.out.println("I am faschionista");
	
}

@Override
public String toString() {
	return "Fashionista [getWeigth()=" + getWeigth() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress()
			+ ", getPets()=" + Arrays.toString(getPets()) + ", getHobbies()=" + Arrays.toString(getHobbies())
			+ ", getHouse()=" + getHouse() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}


}
