

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar dop= new RaceCar("legbis", 5);
		// 2. Print the RaceCar's position in the race
		int num = dop.getPositionInRace();
		System.out.println(num);
		// 3. Crash the RaceCar
		dop.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		dop.pit();
		// 5. Help the car move into first place.
		dop.overtake();
	}
}
