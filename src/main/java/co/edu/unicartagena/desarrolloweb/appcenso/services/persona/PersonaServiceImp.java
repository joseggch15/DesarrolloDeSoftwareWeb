package co.edu.unicartagena.desarrolloweb.appcenso.services.persona;
import co.edu.unicartagena.desarrolloweb.appcenso.models.Persona;
import co.edu.unicartagena.desarrolloweb.appcenso.dao.PersonaCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImp implements PersonaService {

    @Autowired
    PersonaCrud personaCrud;
    
    @Transactional(readOnly = true)
    @Override
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaCrud.findAll(); 
    }

    @Transactional
    @Override
    public void guardar(Persona persona) {
        personaCrud.save(persona); 
    }

    @Transactional
    @Override
    public void eliminar(Persona persona) {
        personaCrud.delete(persona); 
    }

    @Transactional(readOnly = true)
    @Override
    public Persona buscar(Persona persona) {
        return personaCrud.findById(persona.getDNI()).orElse(null);
    }    
    
}
