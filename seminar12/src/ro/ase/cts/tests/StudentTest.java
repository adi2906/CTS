package ro.ase.cts.tests;

import org.junit.Test;
import ro.ase.cts.classes.Student;

import static org.junit.Assert.*;

public class StudentTest {

    //JU4: fiecare metoda trebuie sa aiba adnotarea @Test

    @Test
    public void testConstructorWroksCorectlyForName(){
        String nume = "Adi";
        Student student = new Student(nume);

//        if(nume.equals(student.getNume())){
//            System.out.println("Ok");
//        } else {
//            System.out.println("Constructorul nu initializeaza numele corect");
//        }

        //testul efectiv (expected, result)
        assertEquals(nume, student.getNume());
    }


    @Test
    public void setNume(){
        String nume = "Popescu";
        Student student = new Student();
        student.setNume("Popescu");
        assertEquals(nume, student.getNume());
    }

    @Test
    public void testDefaultConstructorWroksCorectly(){
        Student student = new Student();
//        assertNotEquals(null, student.getNote());

        //putem avea mai multe asertii si le va executa pe toate
        assertNotNull("Lista de note nu a fost initliazata", student.getNote());
        assertNotNull("Numele nu a fost initializat", student.getNume());
    }

    @Test
    public void testAdaugaNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));
    }

    @Test
    public void testGetNota(){
        Student student = new Student();
        student.adaugaNota(5);
        student.adaugaNota(7);
        student.adaugaNota(10);
        student.adaugaNota(9);

        assertEquals(9, student.getNota(3));
    }

    @Test
    public void testAdaugaOSinguraNota(){
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(1, student.getNote().size());
    }

    @Test
    public void testAdaugaNotaIncorecta() {
        Student student = new Student();
//        Test de error condition (exception)
        try {
            student.adaugaNota(-1);
            fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie!");
        }
        catch (IllegalArgumentException ex) {
        }
        catch (Exception e) {
            fail("Nu arunca o exceptie de tipul IllegalArgument.");
        }
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAdaugaNotaIncorectaJunit4() {
        Student student = new Student();
            student.adaugaNota(-1);

    }


    @Test
    public void testStudentulAreRestante(){
        Student student = new Student();
        student.adaugaNota(3);
        boolean rezultat = student.areRestante();
        assertTrue(rezultat);
    }

    @Test
    public void testStudentulNuAreRestante(){
        Student student = new Student();
        student.adaugaNota(7);
        boolean rezultat = student.areRestante();
        assertFalse(rezultat);
    }

    @Test
    public void testCalculeazaMedieCorecta(){
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
//        assertEquals(9.5, student.calculeazaMedie()); nu merge
        // de fiecare data cand avem de calculat valori reale:
        assertEquals(9.5, student.calculeazaMedie(), 0.01); // delta =marja de eroare  se asteapta sa fie in intervalul [expected-delta; expected+delta]
    }

}