package MyLessons.Object.StaticClassEx;
import java.io.*;

public class CatRelation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String GrandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(GrandFatherName);

        String GranMotherName = reader.readLine();
        Cat catGrandMother = new Cat(GranMotherName);

        String FatherName = reader.readLine();
        Cat catFather = new Cat(FatherName, null, catGrandFather);

        String MotherName = reader.readLine();
        Cat catMother = new Cat(MotherName, catGrandMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;

        }

        @Override
        public String toString() {
            if(father == null && mother == null) {
                return "The cat's name is " + name + ", no mother, no father";
            } else if (father == null) {
                return "The cat's name is " + name + ", " + mother.name + " is the mother, no father";
            }else if (mother == null) {
                return "The cat's name is " + name + ", no mother, " + father.name + " is the father";
            }else {
                return "The cat's name is " + name + ", " + mother.name + " is the mother, " + father.name + " is the father";
            }
        }
    }
}
