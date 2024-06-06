package MyLessons.Object.Constructor;

public class CircleConstructor {
    public Person person;

    public CircleConstructor(){
        person = new Person();
    }

    public static void main(String[] args) {
        CircleConstructor person1 = new CircleConstructor();
        person1.person.setName("Marco");
        System.out.println(person1.person);
    }

    public class Person{
        private String name;

        public void setName(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Mi chiamo: " + this.name;
        }
    }
}
