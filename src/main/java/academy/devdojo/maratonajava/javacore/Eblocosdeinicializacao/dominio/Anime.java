package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios ;
    {// alocar espaco em memoria pro projeto; cad atributo de classe é criado e inicializado com valores default ou qq passada
        //bloco de inicializacao é executado; construtor é exectadolae(){
       // episodios = new int[100];
        //for(int i=0; i< episodios.length; i++){
           // episodios[i]= i+1;
       // }
        for(int episodio : this.episodios){
            System.out.print(episodio +" Espiśodio número:  ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
