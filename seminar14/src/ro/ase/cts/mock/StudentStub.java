package ro.ase.cts.mock;

import ro.ase.cts.clase.IStudent;

import java.util.List;
//returneaza valori hardcodate
public class StudentStub implements IStudent {
    @Override
    public String getNume() {
        return "Adi";
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 9;
    }

    @Override
    public int getNota(int index) {
        return 8;
    }

    @Override
    public boolean areRestante() {
        return true;
    }
}
