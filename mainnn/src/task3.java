import java.util.TreeMap;
import java.util.TreeSet;
  class CourseEnrollmentManager {
      private TreeMap<String, TreeSet<String>> courseMap;

      public CourseEnrollmentManager() {
          courseMap = new TreeMap<>();
      }
      public void addStudentToCourse(String course, String studentName) {

          courseMap.putIfAbsent(course, new TreeSet<>());
          courseMap.get(course).add(studentName);
      }
      public void removeStudentFromCourse(String course, String studentName) {

          if (courseMap.containsKey(course)) {
              courseMap.get(course).remove(studentName);
          }
      }
      public boolean isStudentEnrolled(String course,String studentName) {

          return courseMap.containsKey(course) && courseMap.get(course).contains(studentName);
      }
      public void displayCourseRoster(String course) {

          if (!courseMap.containsKey(course)) {
              System.out.println("Course not found.");
              return;
          }

          System.out.println("Students enrolled in " + course + ":");

          for (String student : courseMap.get(course)) {
              System.out.println(student);
          }
      }
  }
  public class task3{
    public static void main(String[] args) {

        CourseEnrollmentManager manager =
                new CourseEnrollmentManager();

        manager.addStudentToCourse("OOP", "Ali");
        manager.addStudentToCourse("OOP", "Hamza");
        manager.addStudentToCourse("OOP", "Basit");
        manager.addStudentToCourse("OOP", "Ali"); // duplicate

        manager.addStudentToCourse("DSA", "Kiran");
        manager.addStudentToCourse("DSA", "Zain");

        manager.displayCourseRoster("OOP");

        System.out.println("\nIs Hamza enrolled in OOP? "
                + manager.isStudentEnrolled("OOP", "Hamza"));

        manager.removeStudentFromCourse("OOP", "Hamza");

        System.out.println("\nAfter Removal:");
        manager.displayCourseRoster("OOP");
    }
}