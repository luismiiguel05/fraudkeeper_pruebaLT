package com.fraudkeeper.ejercicioLT.controller;

import com.fraudkeeper.ejercicioLT.dto.DatosDePersonasDto;
import com.fraudkeeper.ejercicioLT.service.DatosDePersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DatosDePersonasController {
    @Autowired
    private DatosDePersonasService datosDePersonasService;

    @PostMapping("/Examen_FraudKeeper")
    public void grabar(@RequestBody DatosDePersonasDto datosDePersonasDto){
        datosDePersonasService.grabar(datosDePersonasDto);
    }
}
