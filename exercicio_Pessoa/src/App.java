import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\t\t\t ======= Pessoa =======");

        Pessoa pessoa1 = new Pessoa("Henrique", 22, 2800.00);

        pessoa1.setNome("Raimundao");
        pessoa1.setIdade(32);
        pessoa1.setRenda(5128.00);
        JOptionPane.showMessageDialog(null, String.format("Nome: %s \nIdade: %s \nRenda: R$ %.2f", pessoa1.getNome(), pessoa1.getIdade(), pessoa1.getRenda()));
    }
}
