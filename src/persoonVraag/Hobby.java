package persoonVraag;

public  abstract class Hobby {

	private double TimePerWeek;
	private String name;
	private Address locatie;
	//private static int count ;
	public HobbyRoom hobby = new HobbyRoom();
	public Hobby() {
		super();
	}
	public Hobby(double timePerWeek, String name, Address locatie, HobbyRoom hobby) {
		super();
		TimePerWeek = timePerWeek;
		this.name = name;
		this.locatie = locatie;
		this.hobby = hobby;
	}
	public Address getLocatie() {
		return locatie;
	}
	public void setLocatie(Address locatie) {
		this.locatie = locatie;
	}
	@Override
	public String toString() {
		return "Hobby [TimePerWeek=" + TimePerWeek + ", name=" + name + ", locatie=" + locatie + ", hobby=" + hobby
				+ "]";
	}
	
	
	
	

}
