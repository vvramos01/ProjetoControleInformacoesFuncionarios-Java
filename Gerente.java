public class Gerente extends Funcionario {
private String departamento;
public Gerente(String nome, double salario, String departamento) {
super(nome, salario); this.departamento = departamento;
}
@Override
public String exibirInformacoes() {
return super.exibirInformacoes() + "\nDepartamento: " + departamento;
}
public String getDepartamento() {
return departamento;
}
public void setDepartamento(String departamento) {
this.departamento = departamento;
}
}

