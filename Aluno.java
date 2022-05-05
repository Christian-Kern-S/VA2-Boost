class Aluno{

String nome;
int matricula;
Curso curso;


  
Aluno(String n, int matriculaAluno, Curso meucurso){
    nome = n;
    matricula = matriculaAluno;
    curso = meucurso;
  }


  void exibirRelatorio(){
    System.out.println("Nome:" + nome + "\nCurso:" + curso.nome + "\nResultado:" + (curso.estaAprovado()? "Sim" : "Não"));

  System.out.println("------------------------------------");
  }

}