import java.util.Map;
import java.util.TreeMap;

  class StudentScoreManager {
      private TreeMap<String, Integer> studentScores;
      public StudentScoreManager() {
          studentScores = new TreeMap<>();
      }
        public void addOrUpdateScore(String name, int score) {
          studentScores.put(name, score);
      }
      public void removeStudent(String name) {
             studentScores.remove(name);
      }
      public Integer getScore(String name) {
          return studentScores.get(name);
      }
        public void displayAllStudents() {
          System.out.println("Student Records:");
          for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
              System.out.println(entry.getKey() + " : " + entry.getValue());
          }
      }
        public void displayStudentsInRange(String start, String end) {
          System.out.println("Students from " + start + " to " + end);
          for (Map.Entry<String, Integer> entry :
                  studentScores.subMap(start, end).entrySet()) {
              System.out.println(entry.getKey() + " : " + entry.getValue());
          }
      }
  }public class task2{
    public static void main(String[] args) {

        StudentScoreManager manager = new StudentScoreManager();

        manager.addOrUpdateScore("Ali", 85);
        manager.addOrUpdateScore("Basit", 90);
        manager.addOrUpdateScore("Hamza", 88);
        manager.addOrUpdateScore("Kiran", 92);
        manager.addOrUpdateScore("Zain", 80);

        manager.displayAllStudents();

        System.out.println("\nScore of Hamza: "
                + manager.getScore("Hamza"));
        manager.removeStudent("Zain");
        System.out.println("\nAfter Removing Zain:");
        manager.displayAllStudents();

        System.out.println();
        manager.displayStudentsInRange("A", "K");
    }
}