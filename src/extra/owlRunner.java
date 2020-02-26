package extra;

public class owlRunner {
public static void main(String[] args) {
	owl ow = new owl("insects", 0);
	ow.hoot();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ow.scream();
System.out.println(ow.favoriteFood);
System.out.println(ow.numberOfFriends);
}
}
