package extra;

public class JamesBond {
public static void main(String[] args) {
	JamesBond B = new JamesBond();
	vault n = new vault(11353);
	boolean l = n.tryCode(11353);
	System.out.println(l);
}

 int findCode(vault V) {
	for(int i = 0; i<1000000; i++) {
	
		vault H = new vault(); 
		boolean J = H.tryCode(100);
	
		if(J == true) {
		return i;
	}
	
	}
	return -1;
 }
}

