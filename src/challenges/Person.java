package challenges;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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

    // Construtor
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
    public void setEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Email inválido.");
        }
        this.email = email;
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) {
        if (!isValidPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Número de telefone inválido.");
        }
        this.phoneNumber = phoneNumber;
    }

    // Métodos de validação para email e telefone
    private static boolean isValidEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        Matcher matcher = PHONE_PATTERN.matcher(phoneNumber);
        return matcher.matches();
    }

    // Equals e Hashcode para comparação de objetos
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

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, phoneNumber);
    }
}