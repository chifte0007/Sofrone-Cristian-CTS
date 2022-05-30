import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.AgentieTurismTest;
import testare.PachetTuristicTest;
import testare.categorii.ITesteCuFake;

@RunWith(Suite.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(ITesteCuFake.class)
public class SuitaTetseCuFake {

}
