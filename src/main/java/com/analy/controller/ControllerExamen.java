/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.analy.controller;

import com.analy.model.Evaluacion;
import com.analy.model.GeneradorCalificaciones;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author T107
 */
public class ControllerExamen {
   


@Controller
@RequestMapping("/servicios")


public class ControllerExamen {
    
@RequestMapping(value ="/servicio-calificaciones", method = RequestMethod.GET, headers =("Accept=Application/json"))
@ResponseBody ArrayList<Evaluacion> leerEvaluacion(){
 return GeneradorCalificaciones.generarCalificaciones();
}

    
}

}

