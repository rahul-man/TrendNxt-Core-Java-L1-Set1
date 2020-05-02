package Automobile.twowheeler;

public class Main {

	public static void main(String[] args) {

		Hero hero = new Hero("Glamour 125", "DL6SAC0993", "Rahul Mandal", 85);
		hero.displayHero();
		hero.radio();

		System.out.println();

		Honda honda = new Honda("Shine", "DL6S4C1848", "Rahul Mandal", 110);
		honda.displayHonda();
		honda.cdplayer(1);
	}

}
