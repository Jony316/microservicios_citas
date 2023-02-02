package gestorcitas.api_tratamiento.tratamiento;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TratamientoService {
 @Autowired TratamientoRepository TratamientoRepository;
 public Tratamiento save(Tratamiento entity){
 return TratamientoRepository.save(entity);
 }
 public Tratamiento findById( Long id){
 return TratamientoRepository.findById(id).orElse(new Tratamiento());
 }
 public void deleteById(Long id){
 TratamientoRepository.deleteById(id);
 }
 public List<Tratamiento> findAll(){
 return TratamientoRepository.findAll();
 }

 
}
