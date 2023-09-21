/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade01poo;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 *
 * @author lucas
 */
public class Pessoa {
    private String nome;
    private LocalDate data;
    private byte idade;
    
    //ArrayList
    final private ArrayList<Telefone> telefones;
    final private ArrayList<Endereco> enderecos;
    final private ArrayList<Compra> compras;
    
    private Credencial creds;
    
    //Construtor
    public Pessoa(){
        telefones = new ArrayList<>();
        enderecos = new ArrayList<>();
        compras = new ArrayList<>();
    }

    public Credencial getCred() {
        return creds;
    }
    
    public void setCred(Credencial cred){
        creds = cred;
    }
    
    public void setEndereco(Endereco endereco){
        enderecos.add(endereco);
    }
    
    public ArrayList<Endereco> getEndereco() {
        return enderecos;
    }
    
    public void setTelefone (Telefone telefone){
        telefones.add(telefone);
    }
    
    public ArrayList<Telefone> getTelefone(){
        return telefones;
    }
    
    public void setCompra (Compra compra){
        compras.add(compra);
    }
    
    public ArrayList<Compra> getCompra(){
        return compras;
    }
    
    public String getNome() {
        return nome;
    }
    
    public byte getIdade() {
        return idade;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public void setNome (String nome) throws Erro {
        if(nome.length() > 45){
            throw new Erro("Nome excede número máximo de caracteres");
        }
        
        this.nome = nome;
    }
    
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
        
    }
    
    private byte calcularIdade() {
        if(data != null){
            LocalDate hoje = LocalDate.now();
            Period periodo = Period.between(data, hoje);
            setIdade((byte)periodo.getYears());
            return (byte)periodo.getYears();
        }
        
        return 0;
    }
    
    
    public String toString() {
        return nome + ", " + data + ", " + calcularIdade() + " anos, " + creds.toString() + ", Endereços: " + enderecos.toString() + ", Telefones: " +telefones.toString() + ", Gasto Total: " +compras.toString();
    }
    

}
