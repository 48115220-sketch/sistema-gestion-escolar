package com.escuela.curso_service.service;

import com.escuela.curso_service.entidad.Curso;
import java.util.List;

public interface CursoService {
	
    List<Curso> obtenerTodos();
    
    Curso obtenerPorId(Integer id);
    
    Curso guardar(Curso curso);
    
    void eliminar(Integer id);
}