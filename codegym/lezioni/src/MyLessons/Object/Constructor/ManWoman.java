package MyLessons.Object.Constructor;

public class ManWoman {

    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Man(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Man(String name){
            this.name = name;
        }
        public Man(){

        }

        public String toString(){
            return this.name + " " + this.age + " " + this.address;
        }

    }

    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Woman(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Woman(String name){
            this.name = name;
        }
        public Woman(){

        }

        public String toString(){
            return this.name + " " + this.age + " " + this.address;
        }

    }

    public static void main(String[] args) {
        Man man1 = new Man("Marco", 35, "Via Giacomo Matteotti 37");
        Woman woman1 = new Woman("Alice", 33, "Via Giacomo Matteotti 37");
        System.out.println(man1);
        System.out.println(woman1);
    }
}
