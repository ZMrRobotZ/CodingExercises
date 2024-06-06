package MyLessons.Object.Array;

public class FamilyCensus {
    public static void main(String[] args) {
        Human grandfathers1 = new Human("Marco", true, 80);
        Human grandfathers2 = new Human("Paolo", true, 83);

        Human grandmother1 = new Human("Alice", false, 82);
        Human grandmother2 = new Human("Pina", false, 85);

        Human father = new Human("giorgio", true, 54, grandfathers1, grandmother1);
        Human mother = new Human("Carla", false, 51, grandfathers2, grandmother2);

        Human children1 = new Human("Sara", false, 16, father, mother);
        Human children2 = new Human("Laura", false, 10, father, mother);
        Human children3 = new Human("Carlo", true, 21, father, mother);

        System.out.println(grandfathers1);
        System.out.println(grandfathers2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);

    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null) {
                text += ", father: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", mother: " + this.mother.name;
            }
            return text;
        }
    }
}
