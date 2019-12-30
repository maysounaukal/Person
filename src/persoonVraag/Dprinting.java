package persoonVraag;

public class Dprinting extends Hobby{
public Dprinting() {
	
}
public void setLocation(Address location) {
	super.setLocatie(location);
}
public Address getLocation() {
	return super.getLocatie();
}
@Override
public String toString() {
	return "Dprinting []";
}

}
