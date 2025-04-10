public class testePedido{

    public static void main(String[] args){
        Pedido pedir = new Pedido(48454,12042025,"Processando",
                        new Vendedor("Raphael",69696969,3475621),
                        new Cliente("Vegita", 5,5634,24634,8455,4364,2456,346346),
                        new Produto(313531,5,500.00,"Lenovo"));
                System.out.println(pedir);
    }
}