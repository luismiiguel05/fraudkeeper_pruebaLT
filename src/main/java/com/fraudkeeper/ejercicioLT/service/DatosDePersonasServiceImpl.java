package com.fraudkeeper.ejercicioLT.service;

import com.fraudkeeper.ejercicioLT.dao.DatosDePersonasDao;
import com.fraudkeeper.ejercicioLT.dto.DatosDePersonasDto;
import com.fraudkeeper.ejercicioLT.entity.DatosDePersonas;
import com.fraudkeeper.ejercicioLT.entity.Direcciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosDePersonasServiceImpl implements DatosDePersonasService {

    @Autowired
    DatosDePersonasDao datosDePersonasDao;

    @Override
    public void grabar(DatosDePersonasDto datosDePersonasDto) {
        DatosDePersonas dato = new DatosDePersonas();
        dato.setNombre(datosDePersonasDto.getNombre());
        dato.setApellido(datosDePersonasDto.getApellido());
        dato.setTelefono(datosDePersonasDto.getTelefono());

        Direcciones direcciones = new Direcciones();
        direcciones.setCiudad(datosDePersonasDto.getCiudad());
        direcciones.setCalle(datosDePersonasDto.getCalle());
        direcciones.setNumero(datosDePersonasDto.getNumero());
        direcciones.setApartamento(datosDePersonasDto.getApartamento());
        dato.setDirecciones(direcciones);
        datosDePersonasDao.grabar(dato);
    }
}
