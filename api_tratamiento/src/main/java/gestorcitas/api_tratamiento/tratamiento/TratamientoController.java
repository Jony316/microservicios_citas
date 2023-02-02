package gestorcitas.api_tratamiento.tratamiento;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/tratamiento")
@CrossOrigin({"*"})
public class TratamientoController {
 @Autowired TratamientoService TratamientoService;
 @GetMapping("/")
 public List<Tratamiento> findAll(){
 return TratamientoService.findAll();
 }
 @GetMapping("/{id}")
 public Tratamiento findById(@PathVariable Long id){
 return TratamientoService.findById(id);
 }
 @PostMapping("/create")
 public Tratamiento save(@RequestBody Tratamiento entity){
 return TratamientoService.save(entity);
 }
 @PutMapping("/update")
 public Tratamiento update(@RequestBody Tratamiento entity){
 return TratamientoService.save(entity);
 }
 @DeleteMapping("/delete/{id}")
 public void deleteById(@PathVariable Long id){
 TratamientoService.deleteById(id);
 }
}