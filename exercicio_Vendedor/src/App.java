public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\t\t\t ======= Vendedor =======");
        Vendedor vendedor = new Vendedor(0.0, 5000.00, "Henrique", 0);

        vendedor.imprimeDados();
        
        vendedor.setVendas(1500.00);
        vendedor.setFalta(5);
        
        vendedor.imprimeDados();
    }
}