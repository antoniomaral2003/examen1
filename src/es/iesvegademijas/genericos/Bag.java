/**
 * 
 */
package es.iesvegademijas.genericos;

import java.util.*;

/**
 * @author usuario
 *
 */
public class Bag<E> {
	
	private LinkedList<E> lista;
	
	// Constructor de la clase
	public Bag() {
		
		this.lista = new LinkedList<>();
		
	}
	
	// Metodos de la clase
	public void add(E e) {
		
		if (this.lista.contains(e)) {
			
			this.lista.add(e);
			
		} else {
			
			this.lista.add(e);
			
		}
		
	}
	
	public void add(E e, int n) {
		
		for (int contador = 0; contador < n; contador++) {
			
			this.lista.add(e);
			
		}
		
	}
	
	public int getCount(E e) {
		
		int bolsas = 0;
		
		for (int contador = 0; contador < this.lista.size(); contador++) {
			
			if (this.lista.contains(e)) {
				
				bolsas++;
				
			}
			
		}
		
		return bolsas;
		
	}
	
	public void remove(E e) {
		
		this.lista.remove(e);
		
	}
	
	public void remove(E e, int n) {
		
		for (int contador = 0; contador < n; contador++) {
			
			this.lista.remove(e);
			
		}
		
	}
	
	public int size() {
		
		return this.lista.size();
		
	}
	
	@Override
	public String toString() {
		
		for (int contador = 0; contador < this.lista.size(); contador++) {
			
			return this.lista.get(contador).toString();
			
		}
		
		return null;
		
	}
	
	
	

}
