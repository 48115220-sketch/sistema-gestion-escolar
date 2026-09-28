package com.escuela.alumno_service.service;

import com.escuela.alumno_service.entidad.Alumno;
import com.escuela.alumno_service.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> obtenerTodos() {
        return alumnoRepository.findAll();
    }

    @Override
    public Alumno obtenerPorId(Integer id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    @Override
    public Alumno guardar(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public void eliminar(Integer id) {
        alumnoRepository.deleteById(id);
    }
}