package com.test.imcproject;

import javax.swing.JOptionPane;

public class MainMenu {

	
	
	public static void main(String[] args) {
		double hombres1[] = new double[10];
		double mujeres1[] = new double[10];
		double hombres2[] = new double[10];
		double mujeres2[] = new double[10];
		double hombres3[] = new double[10];
		double mujeres3[] = new double[10];
		int mujIdx = 0;
		int homIdx = 0;
		// TODO Auto-generated method stub
		String grupo = "semestre", genero = " Genero del alumno(a) \n1. Mujer \n2. Hombre ", peso = "Cual es su peso",
				data = "Datos del alumno ", est = " Estatura ", estatura = " cual es su estatura", mensaje1 = " ",
				masa = " ", mensaje = " ", mal = " semestre no es";

		int Escuela = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Gupos de la escuela\n1.Grupo A\n2.Grupo B\n" + "3.Grupo C \nSeleccione un grupo:")), gen = 0, klg = 0;

		double mt = 0.0, imc = 0.0;

		switch (Escuela)

		{
		case 1:
			grupo += " 1, semestre 2 y semestre 3";
			for (int i = 1; i <= 2; i++) {
				gen = Integer.parseInt(JOptionPane.showInputDialog(genero));
				if (gen == 1) {
					mensaje1 += "\n Mujer ";
					klg = Integer.parseInt(JOptionPane.showInputDialog(peso));
					mt = Double.parseDouble(JOptionPane.showInputDialog(estatura));

					imc = klg / (mt * mt);
					mujeres1[mujIdx]=imc;
					mujIdx++;
					if (imc <= 19) {
						mensaje = "delgado";
					} else {
						if (imc > 19 && imc <= 24) {
							mensaje = "Peso ideal";
						} else {
							if (imc > 25 && imc <= 29) {
								mensaje = "Sobre peso";
							} else {
								if (imc > 30 && imc <= 40) {
									mensaje = "Obesidad";
								} else {
									if (imc > 40 && imc >= 41) {
										mensaje = "Obesidad grave";
									}
								}
							}

						}
					}
					{
						JOptionPane.showMessageDialog(null, data + "\n " + "Genero " + "Mujer" + "\n " + klg + " kg "
								+ " \n estatura " + mt + "mts \n " + " imc " + mensaje);
					}
				} else {
					if (gen == 2)
						mensaje1 += "\n Hombre ";
					klg = Integer.parseInt(JOptionPane.showInputDialog(peso));
					mt = Double.parseDouble(JOptionPane.showInputDialog(estatura));

					imc = klg / (mt * mt);
					hombres1[homIdx]=imc;
					homIdx++;
					if (imc <= 20) {
						mensaje = "delgado";
					} else {
						if (imc > 20 && imc <= 25) {
							mensaje = "Peso ideal";
						} else {
							if (imc > 25 && imc <= 30) {
								mensaje = "Sobre peso";
							} else {
								if (imc > 30 && imc <= 40) {
									mensaje = "Obesidad";
								} else {
									if (imc > 40 && imc >= 41) {
										mensaje = "Obesidad grave";
									}
								}
							}

						}
					}
					{
						JOptionPane.showMessageDialog(null, data + "\n " + "Genero " + " Hombre " + "\n " + klg + " kg "
								+ " \n estatura " + mt + " mts \n " + " imc " + mensaje);
					}
				}

			}
			break;
		case 2:
			grupo += " 4 y semestre 5";
			mujIdx = 0;
			for (int i = 1; i <= 2; i++) {
				gen = Integer.parseInt(JOptionPane.showInputDialog(genero));
				if (gen == 1) {
					mensaje1 += "\n Mujer ";
					klg = Integer.parseInt(JOptionPane.showInputDialog(peso));
					mt = Double.parseDouble(JOptionPane.showInputDialog(estatura));

					imc = klg / (mt * mt);
					mujeres2[mujIdx]=imc;
					mujIdx++;
					if (imc <= 19) {
						mensaje = "delgado";
					} else {
						if (imc > 19 && imc <= 24) {
							mensaje = "Peso ideal";
						} else {
							if (imc > 25 && imc <= 29) {
								mensaje = "Sobre peso";
							} else {
								if (imc > 30 && imc <= 40) {
									mensaje = "Obesidad";
								} else {
									if (imc > 40 && imc >= 41) {
										mensaje = "Obesidad grave";
									}
								}
							}

						}
					}
					{
						JOptionPane.showMessageDialog(null, data + "\n " + "Genero " + "Mujer" + "\n " + klg + " kg "
								+ " \n estatura " + mt + "mts \n " + " imc " + mensaje);
					}
				} else {
					if (gen == 2)
						mensaje1 += "\n Hombre ";
					homIdx = 0;
					klg = Integer.parseInt(JOptionPane.showInputDialog(peso));
					mt = Double.parseDouble(JOptionPane.showInputDialog(estatura));

					imc = klg / (mt * mt);
					hombres2[homIdx]=imc;
					homIdx++;
					if (imc <= 20) {
						mensaje = "delgado";
					} else {
						if (imc > 20 && imc <= 25) {
							mensaje = "Peso ideal";
						} else {
							if (imc > 25 && imc <= 30) {
								mensaje = "Sobre peso";
							} else {
								if (imc > 30 && imc <= 40) {
									mensaje = "Obesidad";
								} else {
									if (imc > 40 && imc >= 41) {
										mensaje = "Obesidad grave";
									}
								}
							}

						}
					}
					{
						JOptionPane.showMessageDialog(null, data + "\n " + "Genero " + " Hombre " + "\n " + klg + " kg "
								+ " \n estatura " + mt + " mts \n " + " imc " + mensaje);
					}
				}

			}
			break;
		case 3:
			grupo += " 6 y semestre 7";
			mujIdx=0;
			for (int i = 1; i <= 2; i++) {
				gen = Integer.parseInt(JOptionPane.showInputDialog(genero));
				if (gen == 1) {
					mensaje1 += "\n Mujer ";
					klg = Integer.parseInt(JOptionPane.showInputDialog(peso));
					mt = Double.parseDouble(JOptionPane.showInputDialog(estatura));

					imc = klg / (mt * mt);
					mujeres3[mujIdx]=imc;
					mujIdx++;
					if (imc <= 19) {
						mensaje = "delgado";
					} else {
						if (imc > 19 && imc <= 24) {
							mensaje = "Peso ideal";
						} else {
							if (imc > 25 && imc <= 29) {
								mensaje = "Sobre peso";
							} else {
								if (imc > 30 && imc <= 40) {
									mensaje = "Obesidad";
								} else {
									if (imc > 40 && imc >= 41) {
										mensaje = "Obesidad grave";
									}
								}
							}

						}
					}
					{
						JOptionPane.showMessageDialog(null, data + "\n " + "Genero " + "Mujer" + "\n " + klg + " kg "
								+ " \n estatura " + mt + "mts \n " + " imc " + mensaje);
					}
				} else {
					if (gen == 2)
						mensaje1 += "\n Hombre ";
					homIdx = 0;
					klg = Integer.parseInt(JOptionPane.showInputDialog(peso));
					mt = Double.parseDouble(JOptionPane.showInputDialog(estatura));

					imc = klg / (mt * mt);
					hombres3[homIdx]=imc;
					homIdx++;
					if (imc <= 20) {
						mensaje = "delgado";
					} else {
						if (imc > 20 && imc <= 25) {
							mensaje = "Peso ideal";
						} else {
							if (imc > 25 && imc <= 30) {
								mensaje = "Sobre peso";
							} else {
								if (imc > 30 && imc <= 40) {
									mensaje = "Obesidad";
								} else {
									if (imc > 40 && imc >= 41) {
										mensaje = "Obesidad grave";
									}
								}
							}

						}
					}
					{
						JOptionPane.showMessageDialog(null, data + "\n " + "Genero " + " Hombre " + "\n " + klg + " kg "
								+ " \n estatura " + mt + " mts \n " + " imc " + mensaje);
					}
				}

			}
			break;
		}
		String header = "Grupo   Hombre   Mujeres   Imc\n"+
						"---------------------------------s";
				
		for(int i=0;i<3;i++) {
			JOptionPane.showMessageDialog(null, header);
		}

	}

}