class Curso{

  String nome;
  Disciplina disciplina1;
  Disciplina disciplina2;
  Disciplina disciplina3;

 Curso(String n, Disciplina d1, Disciplina d2, Disciplina d3 ){

   nome = n;
   disciplina1 = d1;
   disciplina2 = d2;
   disciplina3 = d3;
 }

  float calcularMedia(){
    float media = (disciplina1.notaFinal +       
    disciplina2.notaFinal + disciplina3.notaFinal)/3;

    return media;
  }
  
  boolean estaAprovado(){
    boolean estaAprovado = false;
    if(calcularMedia() >=  60){
          estaAprovado = true;
      }
    else{
         estaAprovado = false; 
    }
    return estaAprovado;
  }


  float notaPorDisciplina(int id){

    switch(id){
      case 1:
          return disciplina1.notaFinal;

      case 2:
          return disciplina2.notaFinal;  

      case 3:
          return disciplina3.notaFinal;

      default:
          return 0f;
        
    }
    
  }
  
}