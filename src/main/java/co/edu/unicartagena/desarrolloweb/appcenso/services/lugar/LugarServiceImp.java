package co.edu.unicartagena.desarrolloweb.appcenso.services.lugar;
import co.edu.unicartagena.desarrolloweb.appcenso.dao.LugarCrud;
import co.edu.unicartagena.desarrolloweb.appcenso.models.Lugar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LugarServiceImp implements LugarService {

    @Autowired
    LugarCrud lugarCrud;
    
    @Transactional(readOnly = true)
    @Override
    public List<Lugar> listarLugares() {
        return (List<Lugar>) lugarCrud.findAll(); 
    }

    @Transactional
    @Override
    public void guardar(Lugar lugar) {
        lugarCrud.save(lugar); 
    }

    @Transactional
    @Override
    public void eliminar(Lugar lugar) {
        lugarCrud.delete(lugar); 
    }

    @Transactional(readOnly = true)
    @Override
    public Lugar buscar(Lugar lugar) {
        return lugarCrud.findById(lugar.getId()).orElse(null);
    }    
    
}
