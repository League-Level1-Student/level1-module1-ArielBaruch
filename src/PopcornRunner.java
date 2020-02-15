
public class PopcornRunner {
public static void main(String[] args) {
	Microwave wave = new Microwave();
	Popcorn popcorn = new Popcorn("butter");
	wave.putInMicrowave(popcorn);
	wave.setTime(6);
	wave.startMicrowave();
	popcorn.applyHeat();
	
}
}
