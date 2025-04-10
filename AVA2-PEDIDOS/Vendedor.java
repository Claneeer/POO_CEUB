public class Vendedor extends Pessoa{
    private int matricula;

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public Vendedor(String nome,int telefone,int matricula){
        super(nome,telefone);
        this.matricula = matricula;
    }
    @Override
    public String toString(){
        return "\n -- DADOS DO VENDEDOR --"+
               "\n Nome: "+ getNome()+
               "\n Telefone: "+ getTelefone()+
               "\n Matricula: "+ getMatricula();
    }
}