package com.example;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Livro(String ti, String au, int totPag, int pagAtual, boolean ab, Pessoa le){
        this.titulo=ti;
        this.autor=au;
        this.totalPaginas=totPag;
        this.paginaAtual=pagAtual;
        this.aberto=ab;
        this.leitor=le;
    }
 public void detalhes(){
    System.out.println("#####Detalhes do livro:#####");
    System.out.println("TITULO:" +this.titulo);
    System.out.println("AUTOR:" +this.autor);
    System.out.println("Total de Paginas:" +this.totalPaginas);
 }
        public void abrirLivro(){
            if(this.aberto==false){
            System.out.println("O livro está fechado");
            this.aberto=true;
            System.out.println("Agora o livro está aberto");
         } }
        public void fecharLivro(){
            if(this.aberto){
                System.out.println("O livro está aberto");
                this.aberto=false;
                System.out.println("Agora o livro está fechado");}
            } 
        public void folhearLivro(){
            for (int i = 1; i < this.totalPaginas; i++) {
                System.out.println("Lendo a pagina:" +i);}
            }
        
        public void avancarPagina(){
            System.out.println("Estou lendo a pagina: " + this.getPaginaAtual());
            int paginaVirada = this.getPaginaAtual() + 1;
            System.out.println("A nova pagina é: " + paginaVirada);
            }
        public void voltarPagina(){
            System.out.println("Estou lendo a pagina: " + this.getPaginaAtual());
            int paginaVoltada = this.getPaginaAtual() - 1;
            System.out.println("A nova pagina é: " + paginaVoltada);
            }
 }


    


