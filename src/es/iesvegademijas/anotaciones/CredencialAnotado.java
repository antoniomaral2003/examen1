/**
 * 
 */
package es.iesvegademijas.anotaciones;

import java.lang.annotation.*;

/**
 * @author Antonio Martin
 * 
 * 28/10/2022
 *
 */

@Repeatable(Credenciales.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface CredencialAnotado {
	
	String usuario();
	String contrasenia();
	

}
