package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professor;

    public Escola(String nome,Professor[] professor){
        this.nome= nome;
        this.professor = professor;
    }
    public void imprime(){
        System.out.println(this.nome);
        if(professor == null){
            return;
        }
        else{
            for (Professor professor1 : professor) {
                System.out.println(professor1.getNome());
            }

        }
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }
}
