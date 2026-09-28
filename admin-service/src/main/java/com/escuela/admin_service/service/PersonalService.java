package com.escuela.admin_service.service;

import com.escuela.admin_service.entidad.Personal;
import java.util.List;

public interface PersonalService {
	
    List<Personal> obtenerTodos();
    
    Personal obtenerPorId(Integer id);
    
    Personal guardar(Personal docente);
    
    void eliminar(Integer id);
}