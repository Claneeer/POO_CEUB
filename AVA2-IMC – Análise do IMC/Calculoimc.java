public class Calculoimc{
    private String nomePessoa;
    private double alturaPessoa, pesoPessoa, imc;

    public Calculoimc(String nomePessoa, double alturaPessoa, double pesoPessoa, double imc){
    this.nomePessoa = nomePessoa;
    this.alturaPessoa = alturaPessoa;
    this.pesoPessoa = pesoPessoa;
    this.imc = calculosimc();
    }
    public String getnomePessoa(){
        return nomePessoa;
    }
    public void setnomePessoa(String nome){
        this.nomePessoa = nome;
    }
    public double getalturaPessoa(){
        return alturaPessoa;
    }
    public void setalturaPessoa(double altura){
        this.alturaPessoa = altura;
    }
    public double getpesoPessoa(){
        return pesoPessoa;
    }
    public void setpesoPessoa(double peso){
        this.pesoPessoa = peso;
    }
    public double getimc(){
        return imc;
    }
    public double calculosimc(){
        return (pesoPessoa/(alturaPessoa*alturaPessoa));
    }
    @Override
    public String toString(){
        return  "\n ------DADOS DO PACIENTE------"+
                "\n Nome: "+getnomePessoa()+
                "\n Altura: "+getalturaPessoa()+
                "\n Peso: "+getpesoPessoa()+
                "\n IMC: "+getimc();
    }
}