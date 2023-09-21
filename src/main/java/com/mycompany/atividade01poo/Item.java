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
public class Item {
    private int quantidade;
    
    final private Produto produto;

    public Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public BigDecimal calcularTotal() {
        return produto.getPreco().multiply(BigDecimal.valueOf(quantidade)); 
    }
    
    public String toString(){
        return produto.getNome() + " " + quantidade + "x R$" + produto.getPreco() + " = R$ " + calcularTotal();
    }
}
