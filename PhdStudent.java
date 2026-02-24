package Lab4;

import java.util.Arrays;

public class PhdStudent extends Student {
  String department;
  String[] courses;
  public PhdStudent(String firstName, String lastName, String gender, String studentId, String department, String[] courses) {
    super(firstName, lastName, gender, studentId);
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
    String res = super.toString() + "; PHD; department: " + this.department + "; courses: " + String.join(", ", this.courses);
    return res;
  }

  public boolean equals(PhdStudent p) {
    Arrays.sort(this.courses);
    Arrays.sort(p.courses);
    boolean arrsEqual = Arrays.equals(this.courses, p.courses);

    return super.equals(p) && (this.department == p.department) && arrsEqual;
  }
}
