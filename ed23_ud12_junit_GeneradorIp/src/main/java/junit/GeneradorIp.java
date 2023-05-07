package junit;

import java.util.Random;

public class GeneradorIp {
	private Random rand = new Random();

	public int generarNumero(int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}

	public String generarIp() {
	    int[] puesto = new int[4];
	    for (int i = 0; i < 4; i++) {
	        puesto[i] = generarNumero(2, 252);
	        do {
	            if (puesto[i] == 0) {
	                puesto[i] = generarNumero(2, 252) +1;
	            }
	        } while (puesto[i] == 0);
	    }
	    return puesto[0] + "." + puesto[1] + "." + puesto[2] + "." + puesto[3];
	}
}
