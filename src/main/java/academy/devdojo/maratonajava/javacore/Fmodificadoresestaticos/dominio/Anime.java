package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios ;// o bloco de inicialização éexecutado apenas uma vezquando a jvm carregar a classe.atributo estático pertence a classe e não as instancias , toda e qq modificacao vale pra todas as instancias
   static {// alocar espaco em memoria pro projeto; cad atributo de classe é criado e inicializado com valores default ou qq passada
        //bloco de inicializacao é executado; construtor é exectadolae(){
       System.out.println("Dentro do bloco de inicialização");
       episodios = new int[100];
        for(int i=0; i< episodios.length; i++){
           episodios[i]= i+1;
        }}
       static {
           System.out.println("Bloco de inicializaçãp2");
       }
       static{
           System.out.println("Bloco de inicilaizacao 3");
       }
       {
           System.out.println("Não estatitic");
       }
        public Anime(String nome){
         this.nome = nome;
       }
        public Anime(){
       for(int episodio : Anime.episodios){ //quando se está trabalhando com atributos estáticos pra referenciar utiliza o atributo o nome da Classe.atributo estático e não  odiz
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
