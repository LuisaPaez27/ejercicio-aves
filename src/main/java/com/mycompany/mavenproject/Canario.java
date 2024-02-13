/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

import java.util.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

/**
 *
 * @author luisi
 */
public class Canario extends Ave implements Volar{
    
    public static final Logger logger = (Logger)LoggerFactory.getLogger(Canario.class);
    public Canario() {
        logger.debug("instalando un canario");
        this.setTipoSonido( new Canto());
        this.setTipoVuelo( new VueloConAlas());
    }

}
