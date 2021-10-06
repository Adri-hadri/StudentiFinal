public class Student {
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Student() {
        this.idNumber = idNumber;
        this.first_name = first_name;
        this.year = year;
    }

    private int idNumber;
    private String first_name;
    private int year;

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", first_name='" + first_name + '\'' +
                ", year=" + year +
                '}';
    }

    public Student(int idNumber, String first_name, int year) {
        this.idNumber = idNumber;
        this.first_name = first_name;
        this.year = year;
    }

}
