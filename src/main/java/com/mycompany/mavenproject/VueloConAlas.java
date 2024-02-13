/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;

import java.util.logging.Logger;

/**
 *
 * @author luisi
 */
public class VueloConAlas implements TipoVuelo{
    public static final Logger logger = LoggerFactory.getLogger(VueloConAlas.class);
    @Override
    public void vuelo() {
        logger.debug("esta volando, aleteando");
        System.out.println("esta volando, aleteando");
    }
    
}
