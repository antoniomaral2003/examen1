/**
 * 
 */
package es.iesvegademijas.anotaciones;

/**
 * @author Antonio Martin
 * 
 * 28/10/2022
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		Login login = Login.cargadorDeContexto();
		
		login.login();
		
		System.out.println(login.toString());
		

	}

}
