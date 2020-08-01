package _03_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf handy = new Smurf ("handy");
		Smurf papasmurf = new Smurf("papasmurf");
		Smurf smurfette = new Smurf("smurfette");
		handy.eat();
		System.out.println(handy.getName());
		System.out.println(papasmurf.getName());
	}

}
