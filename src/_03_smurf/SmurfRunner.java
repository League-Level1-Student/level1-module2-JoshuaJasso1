package _03_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf handy = new Smurf ("Handy Smurf");
		Smurf papasmurf = new Smurf("Papasmurf");
		Smurf smurfette = new Smurf("Smurfette");
		handy.eat();
		System.out.println(handy.getName());
		System.out.println(papasmurf.getName());
		System.out.println(smurfette.getName());
		System.out.println(handy.getHatColor("White"));
		System.out.println(papasmurf.getHatColor("Red"));
		System.out.println(smurfette.getHatColor("White"));
		System.out.println(handy.isGirlOrBoy("boy"));
		System.out.println(papasmurf.isGirlOrBoy("boy"));
		System.out.println(smurfette.isGirlOrBoy("girl"));


	}

}
