import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.AgentieTurismTest;
import testare.PachetTuristicTest;
import testare.categorii.ITesteCuFake;
import testare.categorii.ITesteCuStub;
import testare.categorii.ITesteRight;

@RunWith(Suite.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory({ITesteCuFake.class, ITesteCuStub.class})
@Categories.ExcludeCategory(ITesteRight.class)
public class SuitaTesteCuFakeFaraRight {
}
