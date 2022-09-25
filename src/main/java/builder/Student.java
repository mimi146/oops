package builder;

public class Student {
    public String Name;
    private String Standard;
    private Integer Rollno;
    private String FatherName;
    private String MotherName;
    private Integer Age;

    private  Student() {} // Ctor hiding

public static StudentBuilder Builder() {
        return new StudentBuilder();
}
    public  static class StudentBuilder {
        public StudentBuilder setName(String name) {
            this.Name = name;
            return this;
        }
        public String getName() {
            return  this.Name;
        }
        public StudentBuilder setFatherName(String fatherName) {
            this.FatherName = fatherName;
            return  this;
        }

        public StudentBuilder setStandard(String standard) {
            this.Standard = standard;
            return this;
        }

        public StudentBuilder setRollno(Integer rollno) {
            this.Rollno = rollno;
            return this;
        }

        public StudentBuilder setMotherName(String motherName) {
            this.MotherName = motherName;
            return  this;
        }

        public StudentBuilder setAge(Integer age) {
            this.Age = age;
            return this;
        }

        public String Name;
        private String Standard;
        private Integer Rollno;

        private String FatherName;
        private String MotherName;
        private Integer Age;


        boolean validate() {
            return Rollno != null && Name != null;
        }
        public Student build() {
          boolean isValid = validate();

          if(!isValid) {
              throw new IllegalArgumentException("Invalid Student");
          }
           Student student = new Student();
            student.Name = this.Name;
            student.Rollno = this.Rollno;
            student.Age = this.Age;
            student.MotherName = this.MotherName;
            student.FatherName = this.FatherName;

            return  student;

        }
    }




}
