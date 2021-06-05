package ro.ase.cts.clase;

import org.junit.Test;
import ro.ase.cts.mock.StudentFake;

import static org.junit.Assert.*;

public class GrupaTestWithFakes {

    @Test
    public void testGetPromovabilitate() {
        Grupa grupa = new Grupa(1086);
        for (int i =0; i < 7; i++){
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestanta(false);
            grupa.adaugaStudent(studentFake);
        }
        for (int i =0; i < 3; i++){
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestanta(true);
            grupa.adaugaStudent(studentFake);
        }
        assertEquals(0.7, grupa.getPromovabilitate(), 0.001);
    }

}