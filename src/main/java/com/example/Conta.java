package com.example;

public class Conta {
   public int numeroConta;
   protected String tipoConta;
   private String nomeCliente;
   private float saldoConta;
   private boolean statusConta; 

   public void estadoAtual(){
    System.out.println("Conta: " +getnumeroConta());
    System.out.println("Tipo Conta:" +gettipoConta());
    System.out.println("Nome dono Conta:" +getnomeCliente());
    System.out.println("Saldo da Conta: " +getsaldoConta());
    System.out.println("status da conta:" +getstatusConta());
}

public int getnumeroConta(){
    return this.numeroConta;
}
public void setnumeroConta(int numero){
    this.numeroConta=numero;
}
public String gettipoConta(){
    return this.tipoConta;
}

public void settipoConta(String tipo){
    if (tipo.equalsIgnoreCase("CC")){
        this.tipoConta=tipo;
        System.out.println("Esta conta é do tipo Conta Corrente");}
    else if (tipo.equalsIgnoreCase("CP")){
        this.tipoConta=tipo;
        System.out.println("Esta conta é do tipo Conta Poupança");
    }    
    }

    public String getnomeCliente(){
        return nomeCliente;
    }

    public void setNomeCliente(String nome){
        this.nomeCliente=nome;
    }

    public float getsaldoConta(){
        return saldoConta;
    }

    public void setsaldoConta(float saldo){
        if (this.saldoConta>0){
            System.out.println("O saldo nao pode ser negativo");
        }
            else if(this.saldoConta<=0){
                this.saldoConta=saldo;
            }
        }

        public boolean getstatusConta(){
            return this.statusConta;
        }

        public  void setstatusConta(boolean status){
            this.statusConta= status;
                            }
 
public void abrirConta(String t){
    this.settipoConta(t);
    this.setstatusConta(true);
    if(t=="CC"){       
        this.setsaldoConta(50);
        System.out.println("A conta corrente está aberta");}
        else if(t=="CP"){
            this.setsaldoConta(150);
            System.out.println("A conta poupanca está aberta.");}
                    }
        
    
public void fecharConta(){
    if(this.saldoConta==0){
        this.statusConta=false;
        System.out.println("A conta foi encerrada");}
        else {
            this.statusConta=true;
        System.out.println("A conta não pode ter saldo positivo nem negativo");}
    }

    public void depositar(float valorDeposito){
        System.out.println("O valor do saldo da conta antes do deposito é " + this.saldoConta);
        if (valorDeposito>0){
           this.saldoConta=this.saldoConta+ valorDeposito;
            System.out.println("O saldo da conta depois do deposito é " + this.saldoConta);
        }
                }
                
                public void sacar(float valor){
                    if (this.getstatusConta()){
                        System.out.println("Saldo da conta corrente" + getsaldoConta());}
                    else if(this.getsaldoConta()<=valor){
                            saldoConta=this.getsaldoConta() - valor;
                            System.out.println("Saldo pos saque" + getsaldoConta());
                        }
                        else {System.out.println("Não é possivel sacar da conta fechada");}
                    }

                
    public void pagarMensalidade(){
        System.out.println("o saldo da conta é: " +this.saldoConta);
        if((this.saldoConta>0) &&  ((this.tipoConta.equals("CP")) || (this.tipoConta.equals("cp")))) {
            this.saldoConta= this.saldoConta-15f;
        System.out.println("o saldo da conta é: " +this.saldoConta);}
        else if((this.saldoConta>0) &&  ((this.tipoConta.equals("CC")) || (this.tipoConta.equals("cc")))){
            System.out.println("o saldo da conta é: " +this.saldoConta);
            this.saldoConta=this.saldoConta-12f;
            System.out.println("o saldo da conta é: " +this.saldoConta);
            } 
    }}
