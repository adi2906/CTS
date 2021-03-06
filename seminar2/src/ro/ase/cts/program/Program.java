package ro.ase.cts.program;


import ro.ase.cts.clase.readers.*;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.Readable;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static List<Aplicant> citesteAplicanti (String numeFisier, Readable reader) throws FileNotFoundException {
		return reader.readAplicanti(numeFisier);
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti("seminar2/elevi.txt", new EleviReader());
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
