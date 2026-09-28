package com.escuela.admin_service.service;

import com.escuela.admin_service.entidad.Personal;
import com.escuela.admin_service.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    private PersonalRepository docenteRepository;

    @Override
    public List<Personal> obtenerTodos() {
        return docenteRepository.findAll();
    }

    @Override
    public Personal obtenerPorId(Integer id) {
        return docenteRepository.findById(id).orElse(null);
    }

    @Override
    public Personal guardar(Personal docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public void eliminar(Integer id) {
        docenteRepository.deleteById(id);
    }
}