public abstract class Pessoa{
    protected String nome;
    protected int telefone;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public Pessoa(String nome,int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
}
