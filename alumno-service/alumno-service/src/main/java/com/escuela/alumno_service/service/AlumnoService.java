package com.escuela.alumno_service.service;

import com.escuela.alumno_service.entidad.Alumno;
import java.util.List;

public interface AlumnoService {
	
    List<Alumno> obtenerTodos();
    
    Alumno obtenerPorId(Integer id);
    
    Alumno guardar(Alumno alumno);
    
    void eliminar(Integer id);
}