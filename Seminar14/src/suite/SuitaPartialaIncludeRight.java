package suite;

import categorii.TestRight;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.ConstructorMasinaTest;
import teste.MasinaTest;

@RunWith(Categories.class)
@Categories.IncludeCategory({TestRight.class})
@Suite.SuiteClasses({ConstructorMasinaTest.class, MasinaTest.class})
public class SuitaPartialaIncludeRight {
}
