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
	
	
	
	
}
