package Lab4;

import java.util.Arrays;

public class Teacher extends Person {
  String department;
  String[] courses;

  public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
    super(firstName, lastName, gender);
    this.department = department;
    this.courses = courses;
  }

  public String getDepartment() {
    return this.department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String[] getCourses() {
    return this.courses;
  }

  public void setCourses(String[] courses) {
    this.courses = courses;
  }

  public String toString() {
    String res = super.toString() + " - teacher; department: " + this.department + "; courses: " + String.join(", ", this.courses);
    return res;
  }

  public boolean equals(Teacher t) {
    Arrays.sort(this.courses);
    Arrays.sort(t.courses);
    boolean arrsEqual = Arrays.equals(this.courses, t.courses);
    return super.equals(t) && (this.department == t.department) && arrsEqual;
  }
}
