//copia github
/**
 * <u>4^ai</u>  13/05/2020
 * @author <bold>Fiorentino Agnese</bold>
 *
 */
public class FiorentinoClass {


public FiorentinoClass() {}

/**
 * classe di calcolo
 * @param b valore b
 * @param e valore e
 * @return val1
 */
public float cognomeMet(int b, int e) {
	int val1=1;
	for(int i=1;i<=e;i++) {      //correzione errore, indice e
		val1=val1*b;
	}
	return val1;
}

	/**
	 * classe main test
	 * @param args
	 */
	public static void main(String[] args) {
		FiorentinoClass f=new FiorentinoClass();
		System.out.println(f.cognomeMet(3,2));

	}

}
