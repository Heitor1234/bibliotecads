

package biblioteca;

import java.sql.*;
import java.util.*;
public class TestaLivros {
    public static void main(String[] args) {
        
         Connection con = Conexao.abrirConexao();
         LivrosBean LivrosBean = new LivrosBean();
         LivrosDAO livrosDAO = new LivrosDAO(con);
         LivrosBean.settitulo("dadadaa");
         LivrosBean.setautor("dadawde");
         LivrosBean.seteditora("dasdadasd");
         LivrosBean.setcodigo("15618448");
         LivrosBean.setnumero_de_exemplares(1);
         LivrosBean.setisbn(2);
         LivrosBean.setano(2020);
         LivrosBean.setgenero("terror");
         LivrosBean.setnumero_de_paginas(2);
         LivrosBean.setstatus("disponivel");
         
         String resultado = livrosDAO.inserir(LivrosBean);
         System.out.println(resultado);
            
                 
    }
}
