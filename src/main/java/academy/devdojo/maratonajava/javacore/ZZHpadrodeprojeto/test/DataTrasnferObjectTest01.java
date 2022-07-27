package academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio.*;

public class DataTrasnferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Paises pais = Paises.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(pais);
        Pessoa person = Pessoa.PersonBuilder
                .builder()
                .firstName("Mario")
                .lastName("Neto")
                .build();
        ReportDto reportDto= ReportDto.ReportDtoBuilder.builder()

                .aircraftName(aircraft.getName())
                .pais(pais)
                .currency(currency)
                .personName(person.getFirstName())
                .build();
        System.out.println(reportDto);


    }

    }
