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
public class Canto implements TipoSonido{
    public static final Logger logger = (Logger)LoggerFactory.getLogger(Canto.class);
    public void makeSound() {
        logger.debug("estoy cantando");
        System.out.println("estoy cantando");
    }
    
}
