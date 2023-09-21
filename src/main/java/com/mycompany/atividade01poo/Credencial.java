/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade01poo;

/**
 *
 * @author lucas
 */
public class Credencial {
    private String senha;
    private String email;
    private boolean administrador;
    
    public String getEmail() {
        return email;
    }

    public String getSenha () {
        return senha;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setSenha(String senha) throws Erro {
        if(senha.length() <= 0){
            throw new Erro("Senha não pode ser Nula");
        }
        
        if(senha.length() > 12){
            throw new Erro("Senha excede número máximo de caracteres");
        }
        
        this.senha = senha;
    }
    
    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    
    public boolean getAdministrador () {
        return administrador;
    }
    
    public String toString () {
        if(administrador){
            return email + ", Senha: '" + senha + "', Administrador";
        }
        
        return email + ", Senha: '" + senha + "', Usuário Geral";
    }
}
