package ar.edu.unlam.tallerweb1.pruebasAutomaticas;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.*;

import javax.inject.Inject;

public class UsuarioDaoTest extends SpringTest{
//	@Autowired
	@Inject
	private UsuarioDao usuarioDao;
   
	@Test
    @Transactional
    @Rollback(true)
    public void buscarUsuarioExistenteDeberiaEncontrarlo(){
    	//preparacion
    	Usuario u = new Usuario(1L,"email","password","Admin");
    	getSession().save(u);
    	
    	//Ejeccucion
    	Usuario encontrado = usuarioDao.consultarUsuario(u);
    	
    	//validadcion
        assertThat(encontrado).isNotNull();
    }
    //otro test no existe yque haya al menos un user
}
