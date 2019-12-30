package persoonVraag;

public class Address {
	
@Override
	public String toString() {
		return "Address [nameStreet=" + nameStreet + ", numberStreet=" + numberStreet + ", postcode=" + postcode
				+ ", Gemeente=" + Gemeente + "]";
	}
public String nameStreet;
public int numberStreet;
public int postcode;
public String Gemeente;
public Address() {
	super();
}
public Address(String nameStreet, int numberStreet, int postcode, String gemeente) {
	super();
	this.nameStreet = nameStreet;
	this.numberStreet = numberStreet;
	this.postcode = postcode;
	Gemeente = gemeente;
}





}
