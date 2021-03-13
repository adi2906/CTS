package ro.ase.cts.program;


import ro.ase.cts.clase.readers.*;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.Readable;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static List<Aplicant> citesteAplicanti(Readable reader) throws FileNotFoundException {
		return reader.readAplicant();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicant;
		try {
			listaAplicant = citesteAplicanti(new EleviReader("seminar2+3/elevi.txt"));
			for(Aplicant aplicant:listaAplicant)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
