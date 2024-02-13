/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject;


/**
 *
 * @author luisi
 */
public abstract class Ave {
    
    private TipoSonido tipoSonido;
    private TipoVuelo tipoVuelo;
    
    //metodos de una ave

    /**
     *
     * @param tipoSonido
     */
    public void setTipoSonido(TipoSonido tipoSonido){
        this.tipoSonido =tipoSonido;
   }     
        public void setTipoVuelo(TipoVuelo tipoVuelo){
        this.tipoVuelo = tipoVuelo;
   }
    public void realizaVuelo(){
        tipoVuelo.vuelo();
   }
    public void realizaSonido(){
        tipoSonido.makeSound();
   }
}
