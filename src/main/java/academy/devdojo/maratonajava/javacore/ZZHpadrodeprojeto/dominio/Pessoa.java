package academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio;

public class Pessoa {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    public Pessoa(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        public static PersonBuilder builder() {
            return builder();

        }


        public PersonBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public PersonBuilder lastName(String lastName){
            this.firstName = lastName;
            return this;
        }    public PersonBuilder userName(String firstName){
            this.firstName = userName;
            return this;
        }    public PersonBuilder emailName(String emailName){
            this.firstName = firstName;
            return this;
        }
        public Pessoa build(){
            return new Pessoa(firstName,lastName,userName,email);
        }

    }

    public String getFirstName() {
        return firstName;
    }
}
