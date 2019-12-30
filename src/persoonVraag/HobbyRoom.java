package persoonVraag;

public class HobbyRoom {
public Hobby hoppy;

public Hobby getHoppy() {
	return hoppy;
}

public void setHoppy(Hobby hoppy) {
	this.hoppy = hoppy;
}

@Override
public String toString() {
	return "HobbyRoom [hoppy=" + hoppy + "]";
}
    
}
