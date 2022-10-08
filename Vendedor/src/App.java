public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\t\t\t ======= Vendedor =======");
        Vendedor vendedor = new Vendedor(5.0, 5000.0, "Henrique", 3);

        vendedor.setVendas(1500.0);
        vendedor.setFalta(5);
        
        vendedor.imprimeDados();

        // ==================== Projeto Anterior ===================

        // System.out.println("\t\t\t ======= Pessoa =======");

        // Pessoa pessoa1 = new Pessoa("Henrique", 22, 512);

        // pessoa1.setNome("Raimundao");
        // pessoa1.setIdade(32);
        // pessoa1.setRenda(5.128);
        // JOptionPane.showMessageDialog(null, String.format("Nome: %s \nIdade: %s \nRenda: R$ %s", pessoa1.getNome(), pessoa1.getIdade(), pessoa1.getRenda()));
    }
}
