package MyLessons.Object.StaticClassEx;

public class NotepadNew {

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }

    public static class Idea{

        public String getDescription(){
            return "Ho avuto un'idea";
        }

    }
}
