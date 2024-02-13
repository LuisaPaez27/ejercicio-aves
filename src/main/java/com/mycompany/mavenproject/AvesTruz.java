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
public class AvesTruz extends Ave {

    public static final Logger logger =(Logger) LoggerFactory.getLogger(AvesTruz.class);
    public AvesTruz() {
        logger.debug("imolementacion avestruz");
        this.setTipoSonido( new SinCanto());
        this.setTipoVuelo( new SinVuelo());
    }
   
    
}
