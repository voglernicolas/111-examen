package tercer.examen;

import java.util.Date;

public class Reserva {

	private Date fechaReserva;
	private Equipo equipo1;
	private Equipo equipo2;
	
	public Reserva(Date fecha, Equipo equipo1, Equipo equipo2) {
		this.fechaReserva = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}
	
	
	// Setters
	public void setFechReserva(Date fecha){
		this.fechaReserva = fecha;
	}
	
	public void setEquipo1(Equipo e1){
		this.equipo1 = e1;
	}
	
	public void setEquipo2(Equipo e2){
		this.equipo2 = e2;
	}
	
	
	
	// Getters
	public Equipo getEquipo1(){
		return equipo1;
	}
	
	public Equipo getEquipo2(){
		return equipo2;
	}

}