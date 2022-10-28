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

@Retention(RetentionPolicy.RUNTIME)
public @interface Credenciales {
	
	CredencialAnotado[] value();

}
