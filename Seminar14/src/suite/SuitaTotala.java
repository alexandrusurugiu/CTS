package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.ConstructorMasinaTest;
import teste.MasinaTest;

import static org.junit.Assert.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({ConstructorMasinaTest.class, MasinaTest.class})
public class SuitaTotala {

}