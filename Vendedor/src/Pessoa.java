public class Pessoa {
  private String Nome;
  private int Idade;
  private Double Renda;

  public Pessoa() { }

  public Pessoa(String nome, int idade, double renda) {
    this.Nome = nome;
    this.Idade = idade;
    this.Renda = renda;
  }

  public String getNome(){
    return Nome;
  }
  public int getIdade(){
    return Idade;
  }
  public Double getRenda(){
    return Renda;
  }

  public void setNome(String nome){
    this.Nome = nome;
  }
  public void setIdade(int idade){
    this.Idade = idade;
  }
  public void setRenda(Double renda){
    this.Renda = renda;
  }
}