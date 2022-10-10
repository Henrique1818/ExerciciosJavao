import javax.swing.JOptionPane;

public class Vendedor {
  private int Falta;
  private String Nome;
  private Double Salario;
  private Double Vendas;

  public Vendedor() {

  }

  public Vendedor(Double vendas, Double salario, String nome, int falta) {
    this.Vendas = vendas;
    this.Salario = salario;
    this.Nome = nome;
    this.Falta = falta;
  }

  public int getFalta() {
    return Falta;
  }

  public void setFalta(int falta) {
    this.Falta = falta;
  }

  public String getNome() {
    return Nome;
  }

  public void setNome(String nome) {
    this.Nome = nome;
  }

  public Double getSalario() {
    return Salario;
  }

  public void setSalario(Double salario) {
    this.Salario = salario;
  }

  public Double getVendas() {
    return Vendas;
  }

  public void setVendas(Double venda) {
    this.Vendas = venda;
  }

  private double calculaComissao() {
    double comissao = 0;

    if (Vendas >= 1000 && Vendas < 2000) {
      comissao = 0.1;
    } else if (Vendas >= 2000) {
      comissao = 0.15;
    }

    return comissao;
  }

  private void calculaSalario() {
    Salario += calculaComissao() - descontoFalta();
  }

  private double descontoFalta() {
    return (Salario / 30) * Falta;
  }

  public void imprimeDados() {
    calculaSalario();
    JOptionPane.showMessageDialog(null,
        String.format("Vendedor: %s \nQuantidade de Vendas: %.2f \n Faltas: %s \n Salário: R$ %.2f", getNome(),
            getVendas(), getFalta(), getSalario()));
  }
}