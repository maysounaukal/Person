package persoonVraag;

public class Gamer extends Person{
	private String nickName;

	public Gamer() {
		super();
	}

	public Gamer(String nickName) {
		super();
		this.nickName = nickName;
	}

	@Override
	public void showMyHobbies() {
		System.out.println("I am gamer");
		}
	}
