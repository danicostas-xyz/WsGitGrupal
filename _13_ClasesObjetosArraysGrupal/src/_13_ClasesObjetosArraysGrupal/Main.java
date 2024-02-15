package _13_ClasesObjetosArraysGrupal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		Usuario usuario3 = new Usuario(0, null, null);

		Usuario[] arrayUsuarios = new Usuario[3];
		arrayUsuarios[0] = usuario1;
		arrayUsuarios[1] = usuario2;
		arrayUsuarios[2] = usuario3;

		pedirDatosUsuario(usuario1, scanner);
		pedirDatosUsuario(usuario2, scanner);
		pedirDatosUsuario(usuario3, scanner);

		for (Usuario usuario : arrayUsuarios) {
			System.out.println(usuario);
		}

		for (int i = 0; i < arrayUsuarios.length; i++) {
			System.out.println("[Usuario " + (i + 1) + "]");
			System.out.println("-----------");
			System.out.println(arrayUsuarios[i].toString());
			
			System.out.println("Valoración media: " + arrayUsuarios[i].valoracionMedia());
			
			arrayUsuarios[i].mostrarValoraciones();
			
			int valoracion = 0;
			do {
				System.out.println();
				System.out.println("Ingresa un número, entre el 0-10 para saber las valoraciones superiores:");
				valoracion = scanner.nextInt();
			if(valoracion > 10 || valoracion < 0) {
				System.err.println("-> Fuera de rango");
			}
			}while(valoracion > 10 || valoracion < 0);
			
			System.out.println();
			arrayUsuarios[i].valoracionesSuperiores(valoracion);

			System.out.println("La valoración media es menor a " + valoracion + "?");
			 System.out.println(arrayUsuarios[i].compararValoracionMedia(valoracion));
			 System.out.println();
			 System.out.println("[Usuario " + (i + 1) + "] Fin del la Información.");
			 System.out.println("-----------------------------------");
			 System.out.println();
		}

	}

	private static void pedirDatosUsuario(Usuario usuario, Scanner scanner) {

		System.out.println("NUEVO USUARIO");
		System.out.println("-------------");

		System.out.println("Ingresa un [ID] (Utilizar solo num. enteros):");
		usuario.id = scanner.nextInt();

		System.out.println("Ingresa un [Nombre]:");
		usuario.nombre = scanner.nextLine();
		usuario.nombre = scanner.nextLine();

		System.out.println("Ingresa la cantidad de [Valoraciones posibles]:");
		int cantidadValo = scanner.nextInt();

		int[] valoraciones = new int[cantidadValo];
		usuario.valoraciones = valoraciones;

		for (int i = 1; i <= cantidadValo; i++) {
			System.out.println("Ingresa la [Valoración " + i + "] (El rango debe ser 1-10):");
			int valoracion = scanner.nextInt();
			if (valoracion <= 10 & valoracion > 0) {
				usuario.valoraciones[i - 1] = valoracion;
			} else {
				System.err.println("-> Fuera de rango");
				System.out.println();
				i--;
			}
		}
		clearConsole();
	}
	
	public static void clearConsole() {
		for(int i = 0; i < 25; i++)
		System.out.println();
	}

}
