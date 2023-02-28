package aula;

public class Aula {
	
	private Alumno[] alumnos;
	
	
	
	public Aula() {
		rellenarAlumnos();
		
	}
	
	public void rellenarAlumnos() {
		
		alumnos = new Alumno[30];
		int posicion = 0;
		
		for(int i=0; i< alumnos.length ; i++) {
			
			alumnos[i] = new Alumno("DAW" + i) ;
		}
	}
	
	


	@Override
	public String toString() {
		return "Aula [alumnos:"+ alumnos + "]";
	}
	
	

}
