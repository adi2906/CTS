package ro.ase.cts.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.categories.TesteRight;
import ro.ase.cts.categories.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.mock.StudentDummy;
import ro.ase.cts.mock.StudentStub;

import static org.junit.Assert.assertEquals;

public class GrupaTestWithMocks {

    private static Grupa grupa;

    @Test
    public void adaugaStudent(){
        Grupa grupa = new Grupa(1086);
        StudentDummy studentDummy = new StudentDummy();
        grupa.adaugaStudent(studentDummy);
        assertEquals(1, grupa.getStudenti().size());
    }
    @Test
    public void adaugaStudentBoundarySuperior(){
        assertEquals(35, grupa.getStudenti().size());
    }

    //Before se face inainte de fiecare test
    @BeforeClass
    public static void creareGrupa(){
        grupa = new Grupa(1086);
        for(int i=0;i<35;i++){
            StudentDummy studentDummy = new StudentDummy();
            grupa.adaugaStudent(studentDummy);
        }
    }


    @Test(expected = IllegalArgumentException.class)
    public void adaugaStudenExceptie(){
        StudentDummy studentDummy = new StudentDummy();
        grupa.adaugaStudent(studentDummy);
    }

    //face parte din ambele categorii
    @Test
    @Category({TesteUrgente.class, TesteRight.class})
    public void testGetPromovabilitate(){
        Grupa grupa = new Grupa(1086);
        StudentStub studentStub = new StudentStub();
        grupa.adaugaStudent(studentStub);
        assertEquals(0,grupa.getPromovabilitate(), 0.01);
    }

}