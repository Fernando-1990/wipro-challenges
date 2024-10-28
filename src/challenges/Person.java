package challenges;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A classe Person representa uma pessoa com atributos como nome, idade, email e número de telefone.
 * Inclui validação de email e número de telefone, usando expressões regulares para garantir que
 * os formatos dos dados fornecidos estejam corretos.
 */
public class Person {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    // Expressões regulares para validação de email e telefone
    private static final String EMAIL_REGEX = "^[\\w\\.-]+@[\\w.-]+\\.[a-z]{2,}$";
    private static final String PHONE_REGEX = "^\\(\\d{2}\\)\\s9\\s\\d{4}-\\d{4}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

    /**
     * Construtor da classe Person.
     *
     * @param name O nome da pessoa.
     * @param age A idade da pessoa.
     * @param email O email da pessoa, deve estar em um formato válido.
     * @param phoneNumber O número de telefone da pessoa, deve estar no formato (XX) 9 XXXX-XXXX.
     * @throws IllegalArgumentException se o email ou número de telefone estiverem em formatos inválidos.
     */
    public Person(String name, int age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    // Getters e Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }


    public String getEmail() { return email; }

    /**
     * Define o email da pessoa.
     *
     * @param email O email a ser definido, que deve estar em um formato válido.
     * @throws IllegalArgumentException se o email estiver em um formato inválido.
     */
    public void setEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Email inválido.");
        }
        this.email = email;
    }

    public String getPhoneNumber() { return phoneNumber; }

    /**
     * Define o número de telefone da pessoa.
     *
     * @param phoneNumber O número de telefone a ser definido, que deve estar no formato (XX) 9 XXXX-XXXX.
     * @throws IllegalArgumentException se o número de telefone estiver em um formato inválido.
     */
    public void setPhoneNumber(String phoneNumber) {
        if (!isValidPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Número de telefone inválido.");
        }
        this.phoneNumber = phoneNumber;
    }

    // Métodos de validação para email e telefone
    /**
     * Verifica se o email fornecido está em um formato válido.
     *
     * @param email O email a ser validado.
     * @return {@code true} se o email for válido, {@code false} caso contrário.
     */
    private static boolean isValidEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    /**
     * Verifica se o número de telefone fornecido está em um formato válido.
     *
     * @param phoneNumber O número de telefone a ser validado.
     * @return {@code true} se o número de telefone for válido, {@code false} caso contrário.
     */
    private static boolean isValidPhoneNumber(String phoneNumber) {
        Matcher matcher = PHONE_PATTERN.matcher(phoneNumber);
        return matcher.matches();
    }

    // Equals e Hashcode para comparação de objetos
    /**
     * Compara este objeto com outro objeto para verificar igualdade.
     *
     * @param o O objeto a ser comparado.
     * @return {@code true} se os objetos forem iguais, {@code false} caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(email, person.email) &&
                Objects.equals(phoneNumber, person.phoneNumber);
    }

    /**
     * Calcula o código hash para este objeto.
     *
     * @return O código hash baseado nos atributos da pessoa.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, phoneNumber);
    }
}