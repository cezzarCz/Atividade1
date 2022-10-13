public class Empregado {
    public int codigo;
    public int nasc;
    public int idade;
    public int anoInicial;
    public int tempoTrabalho;
    public String apto;
    
    //Metodos construtores
    void calculaIdade(){
        this.idade = 2022 - nasc;
    }
    void calculaTempo(){
        this.tempoTrabalho = 2022 - anoInicial;
    }
    //Metodos
    void mostraIdade(){
        System.out.println("Idade: " + idade);
    }
    void mostraTempo(){
        System.out.println("Tempo de trabalho: " + tempoTrabalho);
    }
      
    void validaAp(){
        if (idade >= 65){
            this.apto = "Requerer aposentadoria";
        } else {
            if(tempoTrabalho >= 30){
                this.apto = "Requerer aposentadoria"; 
            } else {
                if (idade >= 60 && tempoTrabalho >= 25) {
                    this.apto = "Requerer aposentadoria";
                } else {
                    this.apto = "Nao requerer";
                }
            }
        }
    }

}
