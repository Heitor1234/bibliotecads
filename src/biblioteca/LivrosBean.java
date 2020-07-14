package biblioteca;

import java.sql.Date;

public class LivrosBean {

    //Definindo as atributos/variáveis globais
    private String titulo;
    private String autor;
    private String editora;
    private String codigo;
    private int numero_de_exemplares;
    private int isbn;
    private int ano;
    private String genero;
    private int numero_de_paginas;
    private String status;

    //Criar os construtores
    public LivrosBean() {
    }

    public LivrosBean(String titulo, String autor, String editora, String codigo, String numero_de_exemplates,
            int isbn, int ano, String genero ,int numero_de_exemplares, int numero_de_paginas, String status) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.codigo = codigo;
        this.numero_de_exemplares = numero_de_exemplares;
        this.isbn = isbn;
        this.ano = ano;
        this.genero = genero;
        this.numero_de_paginas = numero_de_paginas;
        this.status = status;

    } //Definindo os getters e setters

    public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getautor() {
        return autor;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }

    public String geteditora() {
        return editora;
    }

    public void seteditora(String editora) {
        this.editora = editora;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getnumero_de_exemplares() {
        return numero_de_exemplares;
    }

    public void setnumero_de_exemplares(int numero_de_exemplares) {
        this.numero_de_exemplares = numero_de_exemplares;
    }

    public int getisbn() {
        return isbn;
    }

    public void setisbn(int isbn) {
        this.isbn = isbn;
    }

    public int getano() {
        return ano;
    }

    public void setano(int ano) {
        this.ano = ano;
    }

    public String getgenero() {
        return genero;
    }

    public void setgenero(String genero) {
        this.genero = genero;
    }

    public int getnumero_de_paginas() {
        return numero_de_paginas;
    }

    public void setnumero_de_paginas(int numero_de_paginas) {
        this.numero_de_paginas = numero_de_paginas;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.codigo = status;
    }

}
