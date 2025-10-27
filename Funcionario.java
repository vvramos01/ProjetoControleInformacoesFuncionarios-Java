public class Funcionario {
private String nome;
private double salario;
private String funcao;
public Funcionario(String nome, double salario) {
this.nome = nome;
this.salario = salario;
this.funcao = "Funcionário Comum";
}
public Funcionario(String nome) {
this(nome, 1000.0);
}
public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public double getSalario() {
return salario;
}
public void setSalario(double salario) {
this.salario = salario;
}
public String getFuncao() {
return funcao;
}
public void setFuncao(String funcao) {
this.funcao = funcao;
}
public String exibirInformacoes() {
return "Nome: " + nome + "\nSalário: R$" + salario + "\nFunção: " + funcao;
}
}


