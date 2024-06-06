package MyLessons.Object;

public class Fight {
    public int age;
    public int weight;
    public int strength;

    public void Cat() {
    }

    public boolean fight(Fight anotherCat) {
        if(this.age > anotherCat.age && this.age > anotherCat.age && this.strength > anotherCat.strength){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
