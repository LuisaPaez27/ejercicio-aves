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
public class Gallinas extends Ave implements Volar{

   public static final Logger logger = (Logger)LoggerFactory.getLogger(Gallinas.class);
    public Gallinas() {
        logger.debug("instalando una gallina");
        this.setTipoSonido( new Grasnido());
        this.setTipoVuelo( new VueloConAlas());
    }
}    
