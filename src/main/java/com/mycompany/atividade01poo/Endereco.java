package com.mycompany.atividade01poo;

/**
 *
 * @author lucas
 */
public class Endereco {
    private TipoLogradouro tipoLogradouro;
    private String logradouro;
    private int numero;
    private String bairro;
    private int cep;
    
    public enum TipoLogradouro{
        AVENIDA ,RUA ,PRAÇA ,OUTRO ;
    }
    
    public TipoLogradouro getTipoLogradouro(){
        return tipoLogradouro;
    }
    
    public void setTipoLogradouro (TipoLogradouro tipoLogradouro){
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setLogradouro(String logradouro) throws Erro{
        if(logradouro.length() > 255){
            throw new Erro ("Excede número máximo de caracteres");
        }
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    
    public String toString () {
        String cepFormatado = String.format("%02d.%03d-%03d",cep / 1000000, (cep / 1000) % 1000, cep % 1000);
        return tipoLogradouro + " " +logradouro + ", " + numero + ", " + bairro + ", " + cepFormatado;
    }
}
