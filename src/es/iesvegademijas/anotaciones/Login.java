/**
 * 
 */
package es.iesvegademijas.anotaciones;

import java.util.*;

/**
 * @author Antonio Martin
 * 
 * 28/10/2022
 *
 */

@CredencialAnotado(usuario = "Antonio", contrasenia = "123456")
@CredencialAnotado(usuario = "Laura", contrasenia = "78910")
@CredencialAnotado(usuario = "Juan", contrasenia = "456721")

public class Login {
	
	private List<Credencial> listaUsuarios;
	
	// Constrcutor de la clase
	public Login() {
		
		this.listaUsuarios = new ArrayList<>();
		
	}
	
	// Getters y Setters
	public List<Credencial> getListaUsuarios(){
		
		return listaUsuarios;
		
	}
	
	public void setListaUsuarios(List<Credencial> listaUsuarios) {
		
		this.listaUsuarios = listaUsuarios;
		
	}
	
	// Metodos de la clase
	public void login() {
		
		Scanner s = new Scanner(System.in);
		
		String usuario, contrasenia;
		
		System.out.println("Introduzca su nombre de usuario: ");
		usuario = s.nextLine();
		
		System.out.println("Introduzca su contrasenia: ");
		contrasenia = s.nextLine();
		
		Credencial credencial = new Credencial();
		credencial.setUsuario(usuario);
		credencial.setContrasenia(contrasenia);
		
		for (int contador = 0; contador < this.listaUsuarios.size(); contador++) {
			
			if (usuario.equals(this.listaUsuarios.get(contador).getUsuario()) && contrasenia.equals(this.listaUsuarios.get(contador).getContrasenia())) {
				
				System.err.println("ACCESO DENEGADO");
				
			} else {
				
				this.listaUsuarios.add(credencial);
				System.out.println("ACCESO CONCEDIDO");
				
			}
			
				
		}
		
	}
	
	public static Login cargadorDeContexto() {
		
		Login login = new Login();
		
		CredencialAnotado[] anotadoCredenciales = Login.class.getAnnotationsByType(CredencialAnotado.class);
		
		for(CredencialAnotado anotadoCredencial: anotadoCredenciales) {
			
			
		}
		
		
	}
	
	

}
