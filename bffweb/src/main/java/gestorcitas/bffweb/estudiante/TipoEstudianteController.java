package gestorcitas.bffweb.estudiante;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/tipoestudiante")
@CrossOrigin({"*"})
@Tag(name = "Controlador del Tipo de Estudiante")

public class TipoEstudianteController {

    @Autowired TipoEstudianteClient client;
    @Operation(summary = "Obtiene todos los tipos de estudiantes")

    @GetMapping("/{id}/")
    public TipoEstudianteDTO findById(@PathVariable Long id){
        return client.findById(id);
    }

    @PostMapping("/")
    public TipoEstudianteDTO save(@RequestBody TipoEstudianteDTO entity){
        return client.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
        client.deleteById(id);
    }

    @PutMapping("/{id}/")
    public TipoEstudianteDTO update(@PathVariable Long id, @RequestBody TipoEstudianteDTO entity){
        return client.update(id, entity);
    }
    @PatchMapping("/{id}/")
    public TipoEstudianteDTO partialUpdate(@PathVariable Long id, @RequestBody Map<String, Object> fields){

        TipoEstudianteDTO TipoEstudianteDTO = client.findById(id);

        // itera sobre los campos que se desean actualizar
        for (Map.Entry<String, Object> field : fields.entrySet()) {
            String fieldName = field.getKey();
            Object fieldValue = field.getValue();
            
            // utiliza reflection para establecer el valor del campo en la entidad
            try {
                Field campoEntidad = TipoEstudianteDTO.class.getDeclaredField(fieldName);
                campoEntidad.setAccessible(true);
                campoEntidad.set(TipoEstudianteDTO, fieldValue);
            } catch (NoSuchFieldException | IllegalAccessException ex) {
                // maneja la excepci??n si ocurre alg??n error al acceder al campo
            }
        }
        return client.update(id, TipoEstudianteDTO);
    }
}
