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
public class SinVuelo implements TipoVuelo{
    public static final Logger logger = (Logger)LoggerFactory.getLogger(SinVuelo.class);
    public void Vuelo() {
        logger.debug("no puedo volar");
        System.out.println("no puedo volar");
    }

    
}
