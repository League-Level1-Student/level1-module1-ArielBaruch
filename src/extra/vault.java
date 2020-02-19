package extra;

public class vault{
	int secretCode;
	public vault(int secret) {
		this.secretCode = secret;
	}
public static void main(String[] args) {
	
	
}
 boolean tryCode(int number) {
	if(secretCode == number) {
		return true;
	}
	else {return false; }
}
}
