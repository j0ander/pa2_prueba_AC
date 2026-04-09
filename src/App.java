public class App {
    public static void main(String[] args) throws Exception {

        Pedido p1 = new Pedido("Anderson Chancusi", "Coca Cola" , 1200, "anderson@gmail.com");
        PedidoService service = new PedidoService();
        service.registar(p1);
    }


}
