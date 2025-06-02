package teste;

import categorii.TestException;
import categorii.TestRight;
import clase.Masina;
import exceptii.ExceptiePret;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;


public class MasinaTest {
    private Masina masina;

    public MasinaTest() {
        System.out.println("Constructor masina test");
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("tearDownAfterClass");
    }

    @org.junit.Before
    public void setUp() throws Exception {
        masina = new Masina();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Category(TestRight.class)
    @Test
    public void testRight() throws ExceptiePret {
        masina.setPrice(10000);
        assertEquals("Nu a setat corectul pretul pentru valaore normala.", 10000, masina.getPrice(), 0.001);
    }

    @Category(TestException.class)
    @Test(expected = ExceptiePret.class)
    public void testException() throws ExceptiePret {
        masina.setPrice(500);
    }

    @Test
    public void testException2() throws ExceptiePret {
        try {
            masina.setPrice(500);
            // nu este bine
            // assertTrue(false);
            fail("Nu s-a aruncat exceptie atunci cand pretul era invalid.");
        } catch (ExceptiePret e) {
            // este bine
            assertTrue(true);
        }
        //assertEquals("S-a modificat pretul in set atunci cand arunca exceptie", 0, masina.getPrice(), 0.001);
    }
}