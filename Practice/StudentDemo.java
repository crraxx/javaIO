package Practice;

public class StudentDemo implements Comparable<StudentDemo> {
    /*
    英语成绩、语文成绩、数学成绩、JAVA成绩
     */
    private String name;
    private int English;
    private int Chinese;
    private int Math;
    private int JavaS;
    private int num;

    public StudentDemo(String name, int english, int chinese, int math, int javaS, int num) {
        this.name = name;
        this.English = english;
        this.Chinese = chinese;
        this.Math = math;
        this.JavaS = javaS;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getJavaS() {
        return JavaS;
    }

    public void setJavaS(int javaS) {
        JavaS = javaS;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "{" +
                "姓名='" + name + '\'' +
                ", 英语成绩=" + English +
                ", 语文成绩=" + Math +
                ", 数学成绩=" + Chinese +
                ", java成绩=" + JavaS +
                ", 总成绩=" + num +
                '}';
    }

    @Override
    public int compareTo(StudentDemo o) {
        return this.num - o.num;
    }
}
