package ro.ase.cts.suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.clase.GrupaTestWithFakes;
import ro.ase.cts.tests.GrupaTest;
import ro.ase.cts.tests.GrupaTestWithMocks;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWithFakes.class, GrupaTestWithMocks.class})
public class CompleteTestSuite {
}
