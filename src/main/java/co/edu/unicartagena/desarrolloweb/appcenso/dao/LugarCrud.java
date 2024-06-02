package co.edu.unicartagena.desarrolloweb.appcenso.dao;
import co.edu.unicartagena.desarrolloweb.appcenso.models.Lugar;
import org.springframework.data.repository.CrudRepository;

public interface LugarCrud extends CrudRepository<Lugar, String>{
    
}
