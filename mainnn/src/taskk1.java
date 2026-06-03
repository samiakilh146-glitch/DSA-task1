import java.util.TreeSet;
class libraryManager{
    TreeSet <String>t=new TreeSet<>();

    //1.	Use a TreeSet<String> to store book titles.
    //2.	Implement a class LibraryManager with the following methods:
    //o	addBook(String title)
    //o	removeBook(String title)
    //o	isBookAvailable(String title)
    //o	displayAllBooks()
    public void addbook(String title){
        t.add(title);
    }
    public void removebook(String title){
        t.remove(title);
    }
    public boolean isbookavailable(String title){
        return t.contains(title);
    }
    public void display(){
        System.out.println("all library books ");
        for(String b:t){
            System.out.println(t);
        }

    }
    public void findbook(char letter){
        System.out.println("finding book with letter " +letter+":");
        for(String b:t){
            if(b.startsWith(String.valueOf(letter))){
                System.out.println(b);
            }
        }

    }
}

public class taskk1 {
    public static void main(String[] args) {
libraryManager m=new libraryManager();
m.addbook("Java Programming");
m.addbook("Data Structures");
m.addbook("oop");
m.addbook("Coal");
m.addbook("ITC"); m.display();
m.removebook("ITC");
        System.out.println("is oop available:"+m.isbookavailable("oop"));
        System.out.println("After removal");
        m.display();
        m.findbook('D');
    }
}
