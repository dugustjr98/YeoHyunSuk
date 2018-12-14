package StudentEqToHc;


public class Student implements Comparable<Student> {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student(String name,int kor,int eng,int math)
    {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if(o == null||getClass() !=o.getClass()) return false;

        Student student = (Student)o;

        if(math!=student.math) return false;
        if(kor !=student.kor) return false;
        if(eng !=student.eng) return false;
        return name!=null?name.equals(student.name):student.name==null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + kor;
        result = 31 * result + eng;
        result = 31 * result + math;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.getName().compareTo(o.getName());

        return result;
    }
}
