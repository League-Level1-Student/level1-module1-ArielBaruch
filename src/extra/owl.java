package extra;



import java.applet.AudioClip;

import javax.swing.JApplet;



public class owl {
	
		
	
	 String favoriteFood;
	 int numberOfFriends;

	public owl(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	public void scream() {
		playSound1("owlScream.wav");
	}
	public void hoot() {
	playSound1("hoot.wav");
		
	}
	private void playSound1(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

	    sound.play();
	}
	
}
