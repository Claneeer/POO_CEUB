public class Imc{
    private String nome;
    private double altura, peso, imc;

    public Imc(String nome, double altura, double peso){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.imc = calcularIMC();
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getImc(){
        return imc;
    }
    public double calcularIMC(){
        return (peso/(altura*altura));
    }
    @Override
    public String toString(){
        return  "\n ----IMC----"+
                "\n Nome:"+getNome()+
                "\n Altura:"+getAltura()+
                "\n Peso:"+getPeso()+
                "\n IMC:"+calcularIMC();

    }
}