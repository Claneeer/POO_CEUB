
public class Main{
    private String produto;
    protected double preco;

    public String getProduto(){
        return produto;
    }

    public void setProduto(String produto){
        this.produto = produto;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public Main(String produto,double preco){
        this.produto=produto;
        this.preco=preco;
    }
    @Override
    public String toString(){
        return "\n --CARDAPIO--"+
                "\n Prato principal:"+getProduto()+
                getPreco();
    }
}