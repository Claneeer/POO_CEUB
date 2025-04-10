public class Produto{
    private int codProduto, quantidade;
    private double precou,precot,total;
    private String descricao;

    public int getCodProduto(){
        return codProduto;
    }
    public void setCodProduto(int codProduto){
        this.codProduto = codProduto;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    } public double getPrecou(){
        return precou;
    }
    public void setPrecou(double precou){
        this.precou = precou;
    } public String getDescricao(){
        return descricao;
    }
    public void setdescricao(String descricao){
        this.descricao = descricao;
    } 
    public double getPrecot(){
        return precot;
    }

    public double getTotal(){
        return total;
    }
    public Produto(int codProduto,int quantidade,double precou,String descricao){
        this.codProduto = codProduto;
        this.quantidade = quantidade;
        this.precou = precou;
        this.descricao = descricao;
    }
    public double precot(){
        return (precou*quantidade);
    }
    public double total(){
        return (precot+precot);
    }
    public String toString(){
        return "\n -- DADOS DO PEDIDO --"+
               "\n Codigo: "+ getCodProduto()+
               "\n Descrição: "+ getDescricao()+
               "\n Quantidade: "+ getQuantidade()+
               "\n Preço Unitario: "+ getPrecou()+
               "\n Preço Total: "+ getPrecot()+
               "\n Total: "+ getTotal();
    }
}