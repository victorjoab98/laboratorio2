/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.laboratorio2.RestaBean;
import org.testng.Assert;
import static org.testng.Assert.*;

/**
 *
 * @author victorjoab
 */
public class TestUno {
    
    RestaBean resta = new RestaBean();
      
    
    public TestUno() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public void setUpClass() throws Exception {
        resta.setNumero1("10");
        resta.setNumero2("5");   
    }

    //Probando el metodo de resta    
    @org.testng.annotations.Test
    public void testCalcularResta(){
        resta.resta();      
        Assert.assertEquals(resta.getResultado(), 5);
        System.out.println("Test1");
    }
    
     @org.testng.annotations.Test
    public void test2(){
         System.out.println("Tes Systemt 2");
    }
    
     @org.testng.annotations.Test
    public void test3(){
         System.out.println("Tes Systemt 3");
    }
}
