package tercer.examen;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Equipo {

	private String nombre;
	private List<String> jugadores = new ArrayList<String>();
	private int max_jugadores;
	
	public Equipo(String nombre, int jugador){
		this.nombre = nombre;
		this.max_jugadores = jugador;
	}

	
	
	// Setters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setMaxJugadores(int max_jugadores){
		this.max_jugadores = max_jugadores;
	}
	// Ejercicio 2
	public void addJugador(String nombre){
		
		this.jugadores.add(nombre);
	}
	
	
	
	// Getters
	public String getNombre(){
		return this.nombre;
	}
	
	public void getJugador(){	
		for (String temp: this.jugadores) {
			System.out.println(temp);
		}
		
	}
	public int getMaxJugadores(){
		return this.max_jugadores;
	}
	
	
	
	
	/*private boolean hayJugadoresRepetidos(Equipo e1, Equipo e2){
		
		e1.getJugador();

		List<String> jugadores;
		
		
		Iterator<String> iter = jugadores.iterator();
		
		if(iter.hasNext()){
			System.out.println(iter);
		}
		
		return true;
	}*/
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Equipo e1 = new Equipo("Equipo-1",12);

		e1.addJugador("Carlos");
		e1.addJugador("Carla");
		e1.addJugador("Y");
			
			
		e1.getJugador();


	}
}
