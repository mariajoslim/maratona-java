package academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio;

public class ReportDto {
    private String aircraftName;
    private Paises pais;
    private Currency currency;
    private String personName;


    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Paises pais;
        private Currency currency;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder pais(Paises pais) {
            this.pais = pais;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
                ReportDto reportDto = new ReportDto();
            reportDto.currency = this.currency;
            reportDto.pais = this.pais;
            reportDto.personName = this.personName;
            reportDto.aircraftName = this.aircraftName;
            return reportDto;
        }
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", pais=" + pais +
                ", currency=" + currency +
                ", personName='" + personName + '\'' +
                '}';
    }
}
