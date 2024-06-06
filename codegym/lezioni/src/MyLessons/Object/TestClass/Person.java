package MyLessons.Object.TestClass;

public class Person {
    private String name = "no";
    private String surname;
    private int age;
    private char gender;

    public Person(){
        name = "Unknow";
        surname  = "Unknow";
        age = 0;
        gender = 'x';
    }

    public Person(String name, String surname, int age, char gender){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + "\n" +
                "Cognome: " + this.surname + "\n" +
                "Età:  " + this.age + "\n" +
                "Genere: " + this.gender + "\n";
    }


}
