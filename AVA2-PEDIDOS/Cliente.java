public class Cliente extends Pessoa{
    private int endereco,bairro,cidade,estado,cpf,cep;

    public int getEndereco(){
        return endereco;
    }
    public void setEndereco(int endereco){
        this.endereco = endereco;
    }
    public int getBairro(){
        return bairro;
    }
    public void setBairro(int bairro){
        this.bairro = bairro;
    }
    public int getCidade(){
        return cidade;
    }
    public void setCidade(int cidade){
        this.cidade = cidade;
    }
    public int getEstado(){
        return estado;
    }
    public void setEstado(int estado){
        this.estado = estado;
    }
    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public int getCep(){
        return cep;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
    public Cliente(String nome, int telefone,int endereco, int bairro, int cidade, int estado, int cpf, int cep){
        super(nome, telefone);
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cpf = cpf;
        this.cep = cep;

    }
    @Override
    public String toString(){
        return "\n --DADOS DO CLIENTE--"+
               "\n Cliente:"+ getNome()+
               "\n CPF:"+ getCpf()+
               "\n Endereço:"+ getEndereco()+
               "\n Bairro:"+ getBairro()+
               "\n Cidade:"+ getCidade()+
               "\n Estado:"+ getEstado()+
               "\n CEP:"+ getCep()+
               "\n Telefone: "+ getTelefone();


    }
}