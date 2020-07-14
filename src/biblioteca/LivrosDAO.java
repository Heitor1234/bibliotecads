
package biblioteca;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LivrosDAO {
    //definindo atributo variavel global

    private Connection con;

//criar construtor
    public LivrosDAO(Connection con) {
        this.con = con;
    }
//definindo os getters e setters

    public Connection getCon() {
        return con;
    }

    public String inserir(LivrosBean livrosBean) {

        String sql = " inser into Livros(titulo,autor,editor,codigo,numero_de_exemplares,isbn,ano,genero,numero_de_paginas,status)"
                + "values(?,?,?,?,?,?,?,?,?,?)";
        //preparando variavel para executar os dados
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, livrosBean.gettitulo());
            ps.setString(2, livrosBean.getautor());
            ps.setString(3, livrosBean.geteditora());
            ps.setString(4, livrosBean.getcodigo());
            ps.setInt(5, livrosBean.getnumero_de_exemplares());
            ps.setInt(6, livrosBean.getisbn());
            ps.setInt(7, livrosBean.getano());
            ps.setString(8, livrosBean.getgenero());
            ps.setInt(9, livrosBean.getnumero_de_paginas());
            ps.setString(10, livrosBean.getstatus());

            if (ps.executeUpdate() > 0) {
                return "livro inserido com sucesso!!!";
            } else {
                return "Erro ao inserir!!!";
            }

        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    public String alterar(LivrosBean livros) {

        String sql = "update livros titulo = ?,autor = ?, editora = ?, where codigo =?,  numero_de_exemplares = ?,"
                + " where isbn = ?, ano = ?, genero = ?,numero_de_paginas = ?, status = ?, ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

             ps.setString(1, livros.gettitulo());
            ps.setString(2, livros.getautor());
            ps.setString(3, livros.geteditora());
            ps.setString(4, livros.getcodigo());
            ps.setInt(5, livros.getnumero_de_exemplares());
            ps.setInt(6, livros.getisbn());
            ps.setInt(7, livros.getano());
            ps.setString(8, livros.getgenero());
            ps.setInt(9, livros.getnumero_de_paginas());
            ps.setString(10, livros.getstatus());

            if (ps.executeUpdate() > 0) {
                return "livro alterado com sucesso!";
            } else {
                return "Erro ao alterar!";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    public String excluir(LivrosBean livros) {
        String sql = "delete from livros where codigo =?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, livros.getcodigo());
            if (ps.executeUpdate() > 0) {
                return "Livros excluido com sucesso!";

            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException ex) {
            return ex.getMessage();

        }
    }
    //retornar todos os dados dos livros

    public List<LivrosBean> listarTodos() {
        String sql = "select * from carro";
        //criando o objeto para inserir os dados dos livros
        List<LivrosBean> listaLivros = new ArrayList<LivrosBean>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {

                    LivrosBean livros = new LivrosBean();
                    livros.settitulo(rs.getString(1));
                    livros.setautor(rs.getString(2));
                    livros.seteditora(rs.getString(3));
                    livros.setcodigo(rs.getString(4));
                    livros.setnumero_de_exemplares(rs.getInt(5));
                    livros.setisbn(rs.getInt(6));
                    livros.setano(rs.getInt(7));
                    livros.setgenero(rs.getString(8));
                    livros.setnumero_de_paginas(rs.getInt(9));
                    livros.setstatus(rs.getString(10));
                    listaLivros.add(livros);
                }
                return listaLivros;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;

        }
    }
}
