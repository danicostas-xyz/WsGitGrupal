package _13_ClasesObjetosArraysGrupal;

import java.util.Arrays;

public class Usuario {
	private String id;
	private String nombre;
	private int[] valoraciones;
	

	public Usuario() {
		super();
	}

	public Usuario(String id, String nombre, int[] valoraciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.valoraciones = valoraciones;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", valoraciones=" + Arrays.toString(valoraciones) + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(int[] valoraciones) {
		this.valoraciones = valoraciones;
	}
	public double devolverValoracionMedia() {
		double media = 0;
		double suma = 0;
		for(int i = 0; i<this.valoraciones.length;i++) {
			suma += this.valoraciones[i];
		}
		media = suma/this.valoraciones.length;
		return media;
		
	}
	public void mostrarValoraciones() {
		
		for(int i = 0;i < this.valoraciones.length ;i++) {
			System.out.println("Lista de valoraciones");
			System.out.println("Valoracion  " + i + " : " +  this.valoraciones[i]);
			
		}
	}
	
	public int devolverPuntuacionesMasAltas(double nota) {
		int notas_mayores = 0;
		for (double d : valoraciones) {
			if (d>nota) {
				notas_mayores++;
			}

		}
		return notas_mayores;
	}
	
	public boolean devolverMayorOMenorMediaValoracion(double nota) {
		double media = this.devolverValoracionMedia();
		
		boolean flag = false;
		if (nota>media) {
			flag= true;
		}
		return flag;
	}
	
	public boolean devolverMayorOMenorMediaValoracionTernario(double nota) {
		return (nota>this.devolverValoracionMedia())?true:false;
	}
	
	
	
	
}
