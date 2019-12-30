package persoonVraag;

public class Appperson {

	public static void main(String[] args) {
Address addressgamer = new Address("Wilselsesteenweg",197,3010,"leuven");
House housegamer = new House(addressgamer);
Gamer gamer = new Gamer();
Fashionista fashionista = new Fashionista();
Dprinting printer = new Dprinting();



fashionista.addHobby(printer);
printer.setLocatie(addressgamer);
HobbyRoom room = new HobbyRoom();
room.setHoppy(printer);
housegamer.setHobby(room);

//housegamer.getHobby().setHoppy(printer);
gamer.addHobby(printer);
 System.out.println();

  
  System.out.println(gamer);
  System.out.println(housegamer);
  

	}

}
