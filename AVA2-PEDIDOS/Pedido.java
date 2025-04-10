public class Pedido{
    private int codPedido,data;
    private String status;
    private Vendedor vendedor;
    private Cliente cliente;
    private Produto produto;

    public int getCodPedido(){
        return codPedido;
    }
    public void setCodProduto(int codPedido){
        this.codPedido = codPedido;
    }
    public int getData(){
        return data;
    }
    public void setData(){
        this.data = data;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(){
        this.status = status;
    }
    public Vendedor getVendedor(){
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor){
        this.vendedor = vendedor;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Produto getProduto(){
        return produto;
    }
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    public Pedido(int codPedido, int data, String status,Vendedor vendedor,Cliente cliente, Produto produto){
        this.codPedido = codPedido;
        this.data = data;
        this.status = status;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.produto = produto;
    }
    @Override
    public String toString(){
        return "\n -- DADO DO PEDIDO --"+
               "\n Codigo: "+ getCodPedido()+
               "\n Data: "+ getData()+
               "\n Status: "+ getStatus()+
               "\n"+ getVendedor()+
               "\n"+ getCliente()+
               "\n"+ getProduto();
    }
}