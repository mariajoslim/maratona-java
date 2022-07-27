package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;


public class ClientTest01 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Mario Neto", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente c2 = new Cliente("Ewerton Hernades", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(189));
       TipoCliente pessoa_fisica = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(pessoa_fisica);
        TipoCliente pessoa_fisica1= TipoCliente.tipoClienteNomeRelatorio("PESSOA_FISICA");
        System.out.println(pessoa_fisica1);
    }
}

