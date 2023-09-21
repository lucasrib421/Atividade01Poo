/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade01poo;
import java.math.BigDecimal;

/**
 *
 * @author lucas
 */
public class Produto {
    private String nome;
    private BigDecimal preco;

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setNome(String nome) throws Erro{
        if(nome.length() > 150){
            throw new Erro("Excede número máximo de caracteres");
        }
        
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
    public String toString(){
        return nome + " R$ " + preco;
    }
    
}
