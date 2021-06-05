package ro.ase.cts.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.categories.TesteRight;
import ro.ase.cts.categories.TesteUrgente;

//completeTestSuite contine toate test case uri - nerecomandat
@RunWith(Categories.class) //IMPORTANT: tine cont de adnotarea @Categories
@Suite.SuiteClasses(CompleteTestSuite.class)
@Categories.IncludeCategory({TesteUrgente.class})
@Categories.ExcludeCategory({TesteRight.class})
public class CusteomTestSuite {
}
