package co.edu.unicartagena.desarrolloweb.appcenso.dao;
import co.edu.unicartagena.desarrolloweb.appcenso.models.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaCrud extends CrudRepository<Persona, String>{
    
}
