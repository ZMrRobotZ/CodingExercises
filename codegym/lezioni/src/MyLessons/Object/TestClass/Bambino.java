package MyLessons.Object.TestClass;

public class Bambino extends Person {
    private boolean haveParents;

    public Bambino(String name, String surname, int age, char gender, boolean haveParents) {
        super(name, surname, age, gender);
        this.haveParents = haveParents;
    }

    @Override
    public String toString() {
        return super.toString() + "Ha i parenti: " + haveParents;
    }

    public void getInfo() {
        if (this.haveParents) {
            System.out.println("Ha i genitori");
        } else {
            System.out.println("Orfano");
        }
    }
}
