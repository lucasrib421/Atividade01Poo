/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade01poo;
import java.math.BigDecimal;
import java.util.ArrayList;


/**
 *
 * @author lucas
 */
public class Compra {
    private long notaFiscal;
    
    final private ArrayList<Produto> produtos;
    final private ArrayList<Item> itens;
    
    private Pessoa pessoas;
    
    public Compra(){
        produtos = new ArrayList<>();
        itens = new ArrayList<>();
    }
    
    public void setPessoa(Pessoa pessoa){
        pessoas = pessoa;
    }
    
    public Pessoa getPessoa() {
        return pessoas;
    }
    
    public void setProduto(Produto produto){
        produtos.add(produto);
    }
    
    public ArrayList<Produto> getProduto() {
        return produtos;
    }
    
    public void setItem(Item item){
        itens.add(item);
    }
    
    public ArrayList<Item> getItem() {
        return itens;
    }
    
    public long getNotaFiscal() {
        System.out.println("Teste: " + notaFiscal);
        return notaFiscal;
    }
    
    /**
     *
     * @param notaFiscal
     */
    public void setNotaFiscal(long notaFiscal){
        this.notaFiscal = notaFiscal;
    }
    
    public BigDecimal calcularTotal(){
        BigDecimal soma = new BigDecimal("0");
        
        for(int i=0; i < itens.size(); i++){
            soma = soma.add(itens.get(i).calcularTotal());
        }
        
        return soma;
    }
    
    @Override
    public String toString() {    
        return "Nota fiscal: " + "000" + notaFiscal + "; Cliente: " + pessoas.getNome() + " R$ " +calcularTotal() +" ;"+ produtos.toString() + itens.toString();
    }
}
