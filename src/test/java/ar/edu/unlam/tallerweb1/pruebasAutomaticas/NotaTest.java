package ar.edu.unlam.tallerweb1.pruebasAutomaticas;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import ar.edu.unlam.tallerweb1.modelo.Nota;

public class NotaTest{

    @Test
    public void notaMenorACuatroNoDeberiaAprobar(){
    										//Partes de Test unitarios
    	Nota nota =new Nota(3);   			//Preparación
    	
    	boolean aprobado = nota.aprobo();	//Ejecución	
    	
    	assertThat(aprobado).isFalse();		//Validación
    	
    }
    @Test
    public void notaIgualCuatroDeberiaAprobar(){

    	Nota nota =new Nota(4);
    	
    	boolean aprobado = nota.aprobo();	
    	
    	assertThat(aprobado).isTrue();
    	
    }
    
    @Test
    public void notaMayorCuatroDeberiaAprobar(){

    	Nota nota =new Nota(5);
    	
    	boolean aprobado = nota.aprobo();	
    	
    	assertThat(aprobado).isTrue();
    	
    }
    
    @Test
    public void notaIgualSieteDeberiaPromocion(){

    	Nota nota =new Nota(7);
    	
    	boolean aprobado = nota.aprobo();	
    	
    	assertThat(aprobado).isTrue();
    	
    }
    
    @Test
    public void notaMayorSieteDeberiaPromocionar(){

    	Nota nota =new Nota(8);
    	
    	boolean promo = nota.promociono();	
    	
    	assertThat(promo).isTrue();
    	
    }
    
/*		TEST CONSTRUCTOR DE LA CLASE NOTA			*/    
/*    @Test(expected=IllegalArgumentException.class)
    public void notaMenorCero(){
    	Nota nota = new Nota(-2);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void notaMayorDiez(){

    	Nota nota =new Nota(11);  
    	
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void notaIgualCero(){

    	Nota nota =new Nota(0);  
    	
    }*/
}
