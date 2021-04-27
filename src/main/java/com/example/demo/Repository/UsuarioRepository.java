package com.example.demo.Repository;

import com.example.demo.Document.Usuario;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;
import java.util.List;

//Postman
//http://localhost:9000/api/usuarios/search
//http://localhost:9000/api/usuarios/search/apellido?apellido=Loayza

@CrossOrigin(value = {})
public interface UsuarioRepository extends MongoRepository<Usuario, Serializable> {
    @RestResource(path="apellido", rel = "apellido")
public List<Usuario> findByApellidoOrderByNombre(@Param("apellido")String apellido, Pageable pageable);
}
