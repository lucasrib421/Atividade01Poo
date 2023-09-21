/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade01poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.math.BigDecimal;
import java.util.ArrayList;


/**
 *
 * @author lucas
 */
public class Atividade01Poo {

    public static void main(String[] args) {
        
        //Declarando Variaveis Tipo Credencial
        final Credencial credencial1 = new Credencial();
        final Credencial credencial2 = new Credencial();
        final Credencial credencial3 = new Credencial();
        
        //Definindo Valores Credencial
        credencial1.setEmail("ana.zaira@mail.com");
        credencial2.setEmail("beatriz.yana@mail.com");
        credencial3.setEmail("cecilia.xerxes@mail.com");
        
        try{
            credencial1.setSenha("asdf123");
            credencial2.setSenha("123asdf");
            credencial3.setSenha("123123");
        }catch (Erro e){
            System.out.println("Exceção: " + e.getMessage());
        }
        
        credencial1.setAdministrador(true);
        credencial2.setAdministrador(false);
        credencial3.setAdministrador(false);
        
        //Declarando Variaveis Tipo Endereco
        final Endereco endereco1 = new Endereco();
        final Endereco endereco2 = new Endereco();
        final Endereco endereco3 = new Endereco();
        final Endereco endereco4 = new Endereco();
        final Endereco endereco5 = new Endereco();
        final Endereco endereco6 = new Endereco();
        
        //Definindo Valores Endereço
        endereco1.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        endereco2.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        endereco3.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        endereco4.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        endereco5.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        endereco6.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        
        endereco1.setNumero(1011);
        endereco2.setNumero(1012);
        endereco3.setNumero(2022);
        endereco4.setNumero(3031);
        endereco5.setNumero(3032);
        endereco6.setNumero(3033);
        
        endereco1.setBairro("Santa Ana I");
        endereco2.setBairro("Santa Ana II");
        endereco3.setBairro("Santa Beatriz");
        endereco4.setBairro("Santa Cecília I");
        endereco5.setBairro("Santa Cecília II");
        endereco6.setBairro("Santa Cecília III");
        
        endereco1.setCep(39401111);
        endereco2.setCep(39401112);
        endereco3.setCep(39402222);
        endereco4.setCep(39403331);
        endereco5.setCep(39403332);
        endereco6.setCep(39403333);
        
        try{
            endereco1.setLogradouro("A1");
            endereco2.setLogradouro("A2");
            endereco3.setLogradouro("B");
            endereco4.setLogradouro("C1");
            endereco5.setLogradouro("C2");
            endereco6.setLogradouro("C3");
            
        }catch(Erro e){
            System.out.println("Exceção: " + e.getMessage());
        }
        
        //Declarando Variaveis Tipo Telefone
        final Telefone telefone1 = new Telefone();
        final Telefone telefone2 = new Telefone();
        final Telefone telefone3 = new Telefone();
        final Telefone telefone4 = new Telefone();
        final Telefone telefone5 = new Telefone();
        
        //Definindo Valores Telefones
        
        byte ddd38 = 38;
        
        telefone1.setDdd(ddd38);
        telefone2.setDdd(ddd38);
        telefone3.setDdd(ddd38);
        telefone4.setDdd(ddd38);
        telefone5.setDdd(ddd38);
        
        
        telefone1.setNumero(12341234);
        telefone2.setNumero(23452345);
        telefone3.setNumero(923452345);
        telefone4.setNumero(934563456);
        telefone5.setNumero(834563456);
        
        //Declarando Variaveis Tipo Produto
        final Produto produto1 = new Produto();
        final Produto produto2 = new Produto();
        final Produto produto3 = new Produto();
        final Produto produto4 = new Produto();
        final Produto produto5 = new Produto();
        
        //Declarando Valores Produtos
        try{
            produto1.setNome("Abacaxi");
            produto2.setNome("Banana");
            produto3.setNome("Caqui");
            produto4.setNome("Damasco");
            produto5.setNome("Espinafre");
        }catch(Erro e){
            System.out.println("Exceção: " + e.getMessage());
        }
        
        BigDecimal p1 = new BigDecimal("1.99");
        BigDecimal p2 = new BigDecimal("2.99");
        BigDecimal p3 = new BigDecimal("3.99");
        BigDecimal p4 = new BigDecimal("4.99");
        BigDecimal p5 = new BigDecimal("5.99");
        
        produto1.setPreco(p1);
        produto2.setPreco(p2);
        produto3.setPreco(p3);
        produto4.setPreco(p4);
        produto5.setPreco(p5);
        
        //Declarando Variaveis Tipo Item
        final Item item1 = new Item(produto1,11);
        final Item item2 = new Item(produto2,11);
        final Item item3 = new Item(produto3,12);
        final Item item4 = new Item(produto4,13);
        final Item item5 = new Item(produto5,14);
        final Item item6 = new Item(produto1,21);
        final Item item7 = new Item(produto3,22);
        final Item item8 = new Item(produto5,23);
        final Item item9 = new Item(produto1,31);
        final Item item10 = new Item(produto3,32);
        final Item item11= new Item(produto5,33);
        
        
        //Declarando Variaveis Tipo Compra
        final Compra compra1 = new Compra();
        final Compra compra2 = new Compra();
        final Compra compra3 = new Compra();
        final Compra compra4 = new Compra();
        
        //Declarando Valores Compra
        compra1.setNotaFiscal(100101L);
        compra2.setNotaFiscal(200202L);
        compra3.setNotaFiscal(200212L);
        compra4.setNotaFiscal(300303L);
        
        compra1.setItem(item1);
        
        compra2.setItem(item2);
        compra2.setItem(item3);
        compra2.setItem(item4);
        compra2.setItem(item5);
        
        compra3.setItem(item6);
        compra3.setItem(item7);
        compra3.setItem(item8);
        
        compra4.setItem(item9);
        compra4.setItem(item10);
        compra4.setItem(item11);
        
        
        //Declarando Variaveis Tipo Pessoa
        final Pessoa pessoa1 = new Pessoa();
        final Pessoa pessoa2 = new Pessoa();
        final Pessoa pessoa3 = new Pessoa();
        
        //Declarando Valores Pessoas
        pessoa1.setCompra(compra1);
        pessoa2.setCompra(compra2);
        pessoa2.setCompra(compra3);
        pessoa3.setCompra(compra4);
        
        pessoa1.setCred(credencial1);
        pessoa2.setCred(credencial2);
        pessoa3.setCred(credencial3);
        
        try{
            pessoa1.setNome("Ana Zaira");
            pessoa2.setNome("Beatriz Yana");
            pessoa3.setNome("Cecília Xerxes");

        }catch(Erro e){
            System.out.println("Exceção: " + e.getMessage());
        }
        
        
        
        pessoa1.setEndereco(endereco1);
        pessoa1.setEndereco(endereco2);
        
        pessoa2.setEndereco(endereco3);
        
        pessoa3.setEndereco(endereco4);
        pessoa3.setEndereco(endereco5);
        pessoa3.setEndereco(endereco6);
        
        pessoa1.setTelefone(telefone1);
        
        pessoa2.setTelefone(telefone2);
        pessoa2.setTelefone(telefone3);
        
        pessoa3.setTelefone(telefone4);
        pessoa3.setTelefone(telefone5);
        
        LocalDate data1 = LocalDate.of(2000, 01, 29);
        LocalDate data2 = LocalDate.of(1999, 01, 28);
        LocalDate data3 = LocalDate.of(1998, 01, 27);
        
        pessoa1.setData(data1);
        pessoa2.setData(data2);
        pessoa3.setData(data3);
        
        //Setando Compra das Pessoas
        compra1.setPessoa(pessoa1);
        compra2.setPessoa(pessoa2);
        compra3.setPessoa(pessoa2);
        compra4.setPessoa(pessoa3);
        
        System.out.println("String: " + credencial1.toString());
        System.out.println("String: " + credencial2.toString());
        System.out.println("String: " + credencial3.toString());
        
        System.out.println("String: " + endereco1.toString());
        System.out.println("String: " + endereco2.toString());
        System.out.println("String: " + endereco3.toString());
        System.out.println("String: " + endereco4.toString());
        System.out.println("String: " + endereco5.toString());
        System.out.println("String: " + endereco6.toString());
        
        System.out.println("String: " + telefone1.toString());
        System.out.println("String: " + telefone2.toString());
        System.out.println("String: " + telefone3.toString());
        System.out.println("String: " + telefone4.toString());
        System.out.println("String: " + telefone5.toString());
        
        System.out.println("String: " + produto1.toString());
        System.out.println("String: " + produto2.toString());
        System.out.println("String: " + produto3.toString());
        System.out.println("String: " + produto4.toString());
        System.out.println("String: " + produto5.toString());
        
        System.out.println("String: " + item1.toString());
        System.out.println("String: " + item2.toString());
        System.out.println("String: " + item3.toString());
        System.out.println("String: " + item4.toString());
                
        System.out.println("String: " + compra1.toString());
        System.out.println("String: " + compra2.toString());
        System.out.println("String: " + compra3.toString());
        System.out.println("String: " + compra4.toString());
        
        System.out.println("String: " + pessoa1.toString()); 
        System.out.println("String: " + pessoa2.toString()); 
        System.out.println("String: " + pessoa3.toString()); 
        
        
        //Imprimindo Valores Credenciais 
        //System.out.println("String: " + credencial1.toString());
        //System.out.println("String: " + credencial2.toString());
        //System.out.println("String: " + credencial3.toString()); 
        
        
        
        //System.out.println("String: " + pessoa1.toString()); 
        
        
        /*
        //Testes Pessoa
        
        
        String dataString = "20/09/2023";
        
        DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate pdata = LocalDate.parse(dataString, formatoPersonalizado);

        System.out.println("Data e Hora formatadas: " + pdata);
        
        
        final Endereco pEndereco = new Endereco();
        final Endereco sEndereco = new Endereco();
        
        final Telefone telefone1 = new Telefone();
        final Compra compra1 = new Compra();
        
        final Produto produto1 = new Produto();
        
        try{
            produto1.setNome("Goiaba");
        }catch(Erro e){
            System.out.println("Exceção: " + e.getMessage());
        }
   
        BigDecimal teste = new BigDecimal(10);
        produto1.setPreco(teste);
        
        compra1.setProduto(produto1);
        compra1.setNota(10000);
        
        
        final Item item1 = new Item(produto1);
        item1.setQuantidade(10);
        
        compra1.setItem(item1);
        
        
        byte ddd = 38;
        telefone1.setDdd(ddd);
        
        sEndereco.setNumero(20);
        pEndereco.setNumero(10);
        pEndereco.setBairro("Cintra");
        pEndereco.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        pEndereco.setCep(39400);
        
        try{
            pEndereco.setLogradouro(" X");
        }catch(Erro e){
            System.out.println("Exceção: " + e.getMessage());
        }
        
        Pessoa pPessoa = new Pessoa("Lucas", credencial1);
        pPessoa.setEndereco(sEndereco);
        pPessoa.setEndereco(pEndereco);
        pPessoa.setTelefone(telefone1);
        pPessoa.setCompra(compra1);
        try{
            pPessoa.setNome("Lucas");
        }catch(Erro e){
            System.out.println("Exceção: " + e.getMessage());
        }
         byte idade = 15;
        pPessoa.setData(pdata);
        pPessoa.setIdade(idade);
        
        System.out.println("String: " + pPessoa.toString());
        
        //final Pessoa sPessoa = new Pessoa();
        //final Pessoa tPessoa = new Pessoa();
        

        
        /*
        try{
            pPessoa.setNome("ana.zaira@mail.com");
            sPessoa.setNome("beatriz.yana@mail.com");
            tPessoa.setNome("cecilia.xerxes@mail.com");
            
        }catch (Erro e){
            System.out.println("Exceção: " + e.getMessage());
        }
        
        //pPessoa.setSenha("asdf123");
        //sPessoa.setSenha("123asdf");
        
        //tPessoa.setData(pData);
        
        //pCredencial.setAdministrador(true);
        //sCredencial.setAdministrador(false);
        //tCredencial.setAdministrador(false);
        
        System.out.println("String: " + pPessoa.toString());
        System.out.println("String: " + sPessoa.toString());
        System.out.println("String: " + tPessoa.toString());
        
        */

        
        
        
        
    }
}
