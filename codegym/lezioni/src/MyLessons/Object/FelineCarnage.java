package MyLessons.Object;

public class FelineCarnage {

    public static void main(String[] args) {
        Cat kaj = new Cat("Kaj", 6, 10, 25);
        Cat poldo = new Cat("poldo", 2, 30, 13);
        Cat sammy = new Cat("sammy", 8, 3, 12);

        System.out.println(kaj.fight(poldo));
        System.out.println(kaj.fight(sammy));
        System.out.println(poldo.fight(kaj));


}

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
