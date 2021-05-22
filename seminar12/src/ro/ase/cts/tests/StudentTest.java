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
    public void adaugaNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));
    }

}