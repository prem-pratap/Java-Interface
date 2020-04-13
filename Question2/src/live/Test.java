package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {

	public static void main(String[] args) {
		Veena vobj=new Veena();
		System.out.println("Calling method using instance of Veena class");
		vobj.play();
		Saxophone sobj=new Saxophone();
		System.out.println("Calling method using instance of Saxophone class");
		sobj.play();
		Playable playobj;
		playobj=new Veena();
		System.out.println("Calling method of Veena class using instance of Playable interface");
		playobj.play();
		playobj=new Saxophone();
		System.out.println("Calling method of Saxophone class using instance of Playable interface");
		playobj.play();

	}

}
