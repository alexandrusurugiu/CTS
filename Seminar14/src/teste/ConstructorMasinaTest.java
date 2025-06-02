package teste;

import categorii.TestExistence;
import clase.Masina;
import exceptii.ExceptieModelLungime;
import exceptii.ExceptieModelNull;
import exceptii.ExceptiePret;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class ConstructorMasinaTest {
    @Test
    public void testRight() throws ExceptiePret, ExceptieModelLungime, ExceptieModelNull {
        Masina masina = new Masina("Opel", 5000, 2010);
        assertEquals("Verificare model", "Opel", masina.getModel());
        assertEquals("Verificare pret", 5000, masina.getPrice(), 0.001);
        assertEquals("Verificare an", 2010, masina.getAnFabricatie());
    }

    @Test
    public void testBoundary() throws ExceptiePret, ExceptieModelLungime, ExceptieModelNull {
        Masina masina = new Masina("Opel", 100000, 2010);
        assertEquals("Verificare model", "Opel", masina.getModel());
        assertEquals("Verificare pret", 100000, masina.getPrice(), 0.001);
        assertEquals("Verificare an", 2010, masina.getAnFabricatie());
    }

    @Category(TestExistence.class)
    @Test(expected = ExceptieModelNull.class)
    public void testExistence() throws ExceptiePret, ExceptieModelLungime, ExceptieModelNull {
        Masina masina = new Masina(null, 5000, 2010);
    }
}