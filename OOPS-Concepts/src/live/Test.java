package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Veena veena = new Veena();
		veena.play();

		Saxophone saxophone = new Saxophone();
		saxophone.play();
		
		Playable pv = veena;
		pv.play();

		Playable ps = saxophone;
		ps.play();

	}

}
