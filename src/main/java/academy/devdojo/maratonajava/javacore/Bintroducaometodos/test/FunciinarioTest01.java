package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FunciinarioTest01 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.setNome("June");
        func.setIdade(13);
        func.setSalarios(new double[]{1500,1900,3000});
        func.imprimeDados();

        System.out.println(func.getNome());
        System.out.println(func.getIdade());
        System.out.println(func.getSalarios());
        System.out.println(func.getMedia());
        //func.mediaSalario();
    }
}
