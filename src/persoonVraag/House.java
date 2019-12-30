package persoonVraag;

public class House {
public Address adress = new Address();
public HobbyRoom hobby = new HobbyRoom();
public LivingRoom room = new LivingRoom();
public House() {
	super();
}
public House(Address adress, HobbyRoom hobby, LivingRoom room) {
	super();
	this.adress = adress;
	this.hobby = hobby;
	this.room = room;}
public House(Address adress) {
	super();
	this.adress = adress;
}
public HobbyRoom getHobby() {
	return hobby;
}
public void setHobby(HobbyRoom hobby) {
	this.hobby = hobby;
}



public Address getAdress() {
	return adress;
}
public void setAdress(Address adress) {
	this.adress = adress;
}
public LivingRoom getRoom() {
	return room;
}
public void setRoom(LivingRoom room) {
	this.room = room;
}
@Override
public String toString() {
	return "House [adress=" + adress + ", hobby=" + hobby + ", room=" + room + "]";
}





}
