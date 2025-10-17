package atividades;

public class VerificadorVoto {
    private int idade;
    
    public VerificadorVoto(int idade){
        this.idade = idade;
    }
    
    public void podeVotar(){
        if (idade >= 16){
            System.out.println("Pode votar");
        } else {
            System.out.println("Nao pode votar");
        }
    }
    
    
}
