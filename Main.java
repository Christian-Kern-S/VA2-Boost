class Main {
  public static void main(String[] args) {
    
    Disciplina bancodeDados = new Disciplina("BDI",80, "Homem Aranha");

    Disciplina bancodeDadosAvancado = new   Disciplina("BDAv",50, "Batman");


    Disciplina Math = new Disciplina("Mat",40, "Liu Kang");

    Disciplina Morfologia = new Disciplina("Morf",20, "Raiden");


    Curso CienciaDaComputacao = new Curso ("CCU",bancodeDados,bancodeDadosAvancado,Math);

    Curso Geografia = new Curso ("GEO",bancodeDados,bancodeDadosAvancado,Math);
    
    Aluno aluno1 = new Aluno("Christian", 4002, CienciaDaComputacao);

    Aluno aluno2 = new Aluno("Camila", 4002, Geografia);

    System.out.println("Media Auno:" + aluno1.nome + aluno1.curso.calcularMedia());

    System.out.println("Media Auno:" + aluno2.nome + aluno2.curso.calcularMedia());

    System.out.println("Nota do Aluno:" + aluno1.nome + " :" + aluno1.curso.notaPorDisciplina(3));

    bancodeDados.exibirRelatorioDisc();
    Morfologia.exibirRelatorioDisc();   

    aluno1.exibirRelatorio();
    aluno2.exibirRelatorio();
    
  }
}