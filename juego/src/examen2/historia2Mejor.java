package examen2;

import java.util.Scanner;
import java.util.Random;

//Declaracion de la clase personaje
class Personaje {
	String espada;
	String arco;
	String lanza;
	String escudo;
	int monedasPlata;
	int monedasBronce;
	int experiencia;
	int pocionCuracion;
	int pocionMana;
	int presencia;

	Personaje() {
		monedasPlata = 10;
		monedasBronce = 80;
		experiencia = 0;
		pocionCuracion = 0;
		pocionMana = 0;
		presencia = 0;
	}
}

//Declaracion de la clase mercader
class Mercader {
	boolean ayudarMercader;

	Mercader() {
		ayudarMercader = false;
	}
}

//Inicio del codigo main
public class historia2Mejor {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		Personaje personaje = new Personaje();
		Mercader mercader = new Mercader();
		Random R = new Random();
		boolean repeticion = true;
		final int premio = 20;
		String cerrar = null;

		// Prologo de la historia
		System.err.println("Las acciones que cambien tu destino se mostraran en rojo");
		System.out.println("");
		System.out.println("Había una vez un intrépido aventurero llamado Eirik, cuya vida tomó un giro inesperado. ");
		System.out.println("L enfrentarse a un dragón furioso en las profundidades de un bosque oscuro, Eirik cayó ");
		System.out.println("sintiendo cómo la oscuridad lo envolvía.");
		System.out.println("Sin embargo, en ese momento de desesperación,");
		System.out
				.println("la diosa Freiren intervino. Con un destello de luz divina, Eirik volvió a abrir los ojos, ");
		System.out.println("pero no sin condiciones.");
		System.out.println("Freiren le encomendó una misión:");
		System.out.println(
				"1: recuperar un antiguo tesoro quele pertenecía y que yacía perdido en algún rincón del mundo");
		System.out.println("2: Y que su cuerpo seria controlado por un ser del mas alla");

		System.out.println("");
		System.out.println(
				"-----------------------------------------------------------------------------------------------");

		System.out.println("DESPIERTA");
		System.out.println("Nada es real");
		System.out.println("DIA:1");
		System.out
				.println("Abres los ojos y te encuentras en la ciudad Santa donde veneran a los 4 héroes legendarios,");
		System.out.println(
				"para poder pasar tu aventura tendrás que venerar a uno de los héroes debido a la religión del continente");
		System.err.println(
				"¿Cuál eliges? 1: Heroe de la Espada, 2: Heroe del Arco, 3: Heroe de la lanza, 4: Heroe del Escudo ");
		int heroes = S.nextInt();
		// elecion de clase la cual iba tener sistema de experiencia para subir el grado
		// de las armas, "esperiencia no incluida"
		// al tener que elegir entre varias opciones es switch es que mejor viene
		switch (heroes) {
		case 1:
			personaje.espada = "Espada";
			System.out.println(
					"Al elegir al héroe de la espada se te otorgó una espada de bronce y unas pociones de mana");
			personaje.pocionMana += 2;
			break;
		case 2:
			personaje.arco = "Arco";
			System.out.println("Al elegir al héroe del arco se te otorgó un arco de bronce y unas pociones de mana");
			personaje.pocionMana += 2;
			break;
		case 3:
			personaje.lanza = "Lanza";
			System.out.println(
					"Al elegir al héroe de la lanza se te otorgó una lanza de bronce y unas pociones de curación");
			personaje.pocionMana += 2;
			break;
		case 4:
			personaje.escudo = "Escudo";
			System.out.println(
					"Al elegir al héroe del escudo se te otorgó un escudo. Sientes una presencia, pero no sabes qué es");
			personaje.presencia += 1;
			break;
		default:
			System.out.println("Opción no válida.");
			return;
		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------");

		System.out.println(
				"Al salir de la ciudad marcas tu rumbo hacia donde te dictó la diosa, a las regiones olvidadas del norte,");
		System.out.println("las cuales llevan deshabitadas desde el gran cataclismo, lo que provocó su estado.");
		System.out.println(
				"Tienes " + personaje.monedasPlata + " monedas de plata y " + personaje.monedasBronce + " de bronce");
		System.err.println("¿Alquilamos un carruaje para llegar más rápido por 8 monedas de plata? SI/NO");
		String Carruaje = S.next();
		// Eleccion simple de if/else mediante el .equals
		if (Carruaje.equalsIgnoreCase("SI")) {
			System.out.println("Era un timo y no viene nadie además de que pierdes las 8 monedas");
			personaje.monedasPlata -= 8;
		} else {
			System.out.println("Vas andando como todo un machote");
		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------");

		System.out.println("Mientras vas andando te encuentras un mercader que está siendo atacado");
		System.out.println("Al no querer más problemas intentas irte");
		System.out.println("Te alejas pero una palabra empieza a pasar por la cabeza hasta el punto que duele");
		System.out.println("¿Le ayudarás?");
		// bucle do while hasta elegir la opcion deseada en este caso mediante numeros
		do {
			System.err.println("¿Vas a ayudarle? SI=1/NO=2");
			int ayudar = S.nextInt();

			if (ayudar == 1) {
				mercader.ayudarMercader = true;
			} else {
				System.out.println("Te duele más la cabeza");
			}

		} while (!mercader.ayudarMercader);

		System.out.println("Inesperadamente consigues salvarle ");
		System.out.println("Este te propone que lo protejas hasta que llegue a la próxima ciudad");
		System.out.println("Tú aceptas a cambio de algo de oro");
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
		// inicia bucle for 4 repeticiones
		// debido a las repeticiones que se tiene que hacer las cuales son las mismas
		// duarante un timepo programado era la mejor para batalla por dias
		for (int dia = 2; dia <= 5; dia++) {
			System.out.println("Día " + dia);

			// Lógica para recompensas o consecuencias
			boolean encuentroConBandidos = false;

			String decisionRutas = "";
			// elecion de ruta depende de la que eligas tendras mas prob de que salgan
			// bandiados
			if (encuentroConBandidos) {
				System.out.println("Ganas 5 monedas de plata por repeler el ataque de los bandidos.");
				personaje.monedasPlata += 5;
			} else {
				System.out.println("¿Qué ruta elegirás? 'segura' o 'peligrosa'");
				decisionRutas = S.next();
				// inicio segura
				if (decisionRutas.equalsIgnoreCase("segura")) {
					int spawnRateFacil = R.nextInt(10 - 1);
					int DiceLuck = R.nextInt(11);
					// probablidad de encuntro
					System.out.println("El viaje fue más largo pero seguro. Te sientes descansado.");

					if (spawnRateFacil < 4) {
						System.out.println("Te encuentras con bandidos");
						if (DiceLuck % 2 == 0) {
							System.out.println("Pero los derrotaste");
							System.out.println("Ganas 5 monedas de plata por repeler el ataque de los bandidos.");
							System.out.println(
									"-----------------------------------------------------------------------------------------------");
							personaje.monedasPlata += 5;
							personaje.experiencia += 5;
						} else {
							System.out.println("Perdiste");
							System.out.println("Pierdes 5 monedas de plata por perder ante el ataque de los bandidos.");
							System.out.println(
									"-----------------------------------------------------------------------------------------------");
							personaje.monedasPlata -= 5;
							personaje.experiencia -= 3;
						}
					} else {
						System.out.println("No te encontraste con nadie");
						System.out.println(
								"-----------------------------------------------------------------------------------------------");
					}
					// inicio dificil
				} else {
					System.out.println("Te encuentras con desafíos inesperados en el camino.");
					int spawnRateDificil = R.nextInt(20);
					int DiceLuck = R.nextInt(11);
					// probablidad de encuntro
					if (spawnRateDificil > 2) {
						System.out.println("Te encuentras con bandidos");
						if (DiceLuck % 2 == 0) {
							System.out.println("Pero los derrotaste");
							System.out.println("Ganas 10 monedas de plata por repeler el ataque de los bandidos.");
							System.out.println(
									"-----------------------------------------------------------------------------------------------");
							personaje.monedasPlata += 10;
							personaje.experiencia += 10;
						} else {
							System.out.println("Perdiste");
							System.out
									.println("Pierdes 10 monedas de plata por perder ante el ataque de los bandidos.");
							System.out.println(
									"-----------------------------------------------------------------------------------------------");
							personaje.monedasPlata -= 10;
							personaje.experiencia -= 10;
						}
					}

				}
			}
		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
		// parte finaldel codigo en forma de final
		System.out.println("Al llegar a la ciudad el mercadar te da 20 monedas de plata y se va");
		personaje.monedasPlata += premio;
		System.out.println("Te acercas a una taberna");
		System.out.println("Cuesta 10 monedas de plata la noche y tienes " + personaje.monedasPlata + " monedas");
		System.err.println("¿Lo pagas? SI=1/NO=2");
		int pagar = S.nextInt();

		if (pagar == 1) {
			System.out.println("Descansas en la taberna y te tomas una buena siesta");
			System.out.println(
					"-----------------------------------------------------------------------------------------------");
			personaje.monedasPlata -= 10;
		} else {
			System.out.println("Te vas a un callejon e intentas dormir");
			System.out.println("Al despertar ves que te han robado el dinero");
			System.out.println("No te queda nada");
			System.out.println("Aun tienes tu arma");
			System.out.println(
					"-----------------------------------------------------------------------------------------------");
			personaje.monedasPlata -= personaje.monedasPlata;
			personaje.monedasBronce -= personaje.monedasBronce;
		}
		System.out.println("Dia 6");
		System.out.println("");
		System.out.println("¿Que vas a hacer hoy? 1:Explorar la cuidad 2:Ir a matar mountros");
		int ExplorarOmatar = S.nextInt();
		if (ExplorarOmatar == 1) {
			System.out.println("Vas andando por la ciudad, y te encuentras con el gremio de aventureros");
			System.out.println("Te adentras en el y te incribes para poder ");

		} else {
			int SalidaMatarMounstros = 0;
			for (int i = 10; i == SalidaMatarMounstros; i++) {
				String decisionRutas = "";
				if (i == 0) {
					System.out.println("Ganas 5 monedas de plata por repeler el ataque de los bandidos.");
					personaje.monedasPlata += 5;
				} else {
					System.out.println("¿Por donde vas? 'derecha' o 'izquierda'");
					decisionRutas = S.next();
					// inicio segura
					if (decisionRutas.equalsIgnoreCase("derecha")) {
						int spawnRateFacil = R.nextInt(10 - 1);
						int DiceLuck = R.nextInt(11);
						// probablidad de encuntro
						if (spawnRateFacil < 4) {
							System.out.println("Te encuentras con Goblins");
							if (DiceLuck % 2 == 0) {
								System.out.println("Pero los derrotaste");
								System.out.println("Ganas 5 monedas de plata por rasesinar a un grupo de goblins.");
								System.out.println(
										"-----------------------------------------------------------------------------------------------");
								personaje.monedasPlata += 5;
								personaje.experiencia += 5;
							} else {
								System.out.println("Perdiste");
								System.out.println("Pierdes 5 monedas de plata por perder ante el grupo de goblins.");
								System.out.println(
										"-----------------------------------------------------------------------------------------------");
								personaje.monedasPlata -= 5;
								personaje.experiencia -= 3;
							}
						} else {
							System.out.println("No te encontraste nada");
							System.out.println(
									"-----------------------------------------------------------------------------------------------");
						}
						// inicio dificil
					} else {
						System.out.println();
						int spawnRateDificil = R.nextInt(4);
						int DiceLuck = R.nextInt(11);
						// probablidad de encuntro
						if (spawnRateDificil > 2) {
							System.out.println("Te encuentras con un moblin");
							if (DiceLuck % 2 == 0) {
								System.out.println("Pero lo derrotaste");
								System.out.println("Ganas 10 monedas de plata por derrotar al moblin");
								System.out.println(
										"-----------------------------------------------------------------------------------------------");
								personaje.monedasPlata += 10;
								personaje.experiencia += 10;
							} else {
								System.out.println("Perdiste la pela");
								System.out.println("Pierdes 10 monedas de plata por perder ante el moblin");
								System.out.println(
										"-----------------------------------------------------------------------------------------------");
								personaje.monedasPlata -= 10;
								personaje.experiencia -= 10;
								SalidaMatarMounstros = S.nextInt();

								if (SalidaMatarMounstros == 1) {
									SalidaMatarMounstros = 10;
								}

							}

						}

					}
				}
			}
		}
	}
}