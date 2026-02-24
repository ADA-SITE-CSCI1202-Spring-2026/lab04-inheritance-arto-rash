package Lab4;

public class Student extends Person {
  String studentId;

  public Student(String firstName, String lastName, String gender, String studentId) {
    super(firstName, lastName, gender);
    this.studentId = studentId;
  }

  public String getStudentId() {
    return this.studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String toString() {
    String res = super.toString() + " - student; ID: " + this.studentId;
    return res;
  }

  public boolean equals(Student s) {
    return super.equals(s) && (this.studentId == s.studentId);
  }
}
