package com.example;

public class AppLivro {
    public static void main(String[] args) {
        Pessoa leitor = new Pessoa("Gloria", 40, 'F');
        Livro livro = new Livro("Orgulho e Preconceito", "Jane Austin", 380, 82, false, leitor);
        leitor.fazerAniversario();
        livro.detalhes();
        livro.abrirLivro();
        livro.avancarPagina();
        livro.voltarPagina();
        livro.folhearLivro();
        livro.fecharLivro();
    }
}
