import javax.swing.JOptionPane;

public class Vendedor {
 private Double Vendas;
 private Double Salario;
 private String Nome;
 private int Falta;
 
 public Vendedor(){
   
 }

 public Vendedor(Double vendas, Double salario, String nome, int falta)
 {
   this.Vendas = vendas;
   this.Salario = salario;
   this.Nome = nome;
   this.Falta = falta;
  }

  
  public Double getVendas(){
    return Vendas;
  }
  public Double getSalario(){
    return Salario;
  }
  public String getNome(){
    return Nome;
  }
  public int getFalta(){
    return Falta;
  }

  public void setVendas(Double venda){
    this.Vendas = venda;
  }
  public void setSalario(Double salario){
    this.Salario = salario;
  }
  public void setNome(String nome){
    this.Nome = nome;
  }
  public void setFalta(int falta){
    this.Falta = falta;
  }

  public void imprimeDados() {
    calculaSalario();
    JOptionPane.showMessageDialog(null, String.format("Vendedor: %s \nQuantidade de Vendas: %s \n Faltas: %s \n Salário: R$ %s", getNome(), getVendas(), getFalta(), getSalario()));
  }

  private void calculaSalario() {
    // Salario = (Salario + calculaComissao() - descontoFalta());
    Salario += calculaComissao() - descontoFalta(); 
  }

  private double calculaComissao() {
    double comissao = 0;

    if (Vendas >= 1000 && Vendas < 2000) {
      comissao = 0.1;
    }
    else if (Vendas >= 2000) {
      comissao = 0.15;
    }

    return comissao;
  }

  private double descontoFalta() {
    return (Salario/30) * Falta;
  }
}