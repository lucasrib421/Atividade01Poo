/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade01poo;

/**
 *
 * @author lucas
 */
public class Telefone {
    private byte ddd;
    private int numero;

    public byte getDdd() {
        return ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setDdd(byte ddd) {
        this.ddd = ddd;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String toString (){
        String numeroString = Integer.toString(numero);
        int tam = numeroString.length();
        
        if(tam == 8){
            String telefoneFormatado = String.format("%04d-%04d",numero / 10000, numero % 10000);
            return "("+ ddd +")" + " " + telefoneFormatado;
        }
        
        String telefoneFormatado = String.format("%03d-%03d-%03d",numero / 1000000, (numero / 1000) % 1000, numero % 1000);
        return "("+ ddd +")" + " " + telefoneFormatado;
        
        
    }
}
