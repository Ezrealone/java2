package dyq;

public class Javatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******************学生信息*********************");
        Student dyq = new Student();
        dyq.setName("杜雨卿");
        dyq.setAge(20);
        dyq.setNumber(2019310861);
        dyq.setSex("男");
        System.out.println("学生姓名:" + dyq.getName());
        System.out.println("学生年龄:" + dyq.getAge());
        System.out.println("学生学号:" + dyq.getNumber());
        System.out.println("学生性别:" + dyq.getSex());

        System.out.println("******************教师信息*********************");
        Teacher lyh = new Teacher();
        lyh.setName("李永红");
        lyh.setAge(61);
        lyh.setNumber(19999999);
        lyh.setSex("女");
        lyh.setLesson_1("语文");
        System.out.println("授课教师:" + lyh.getName());
        System.out.println("教师年龄:" + lyh.getAge());
        System.out.println("教师学号:" + lyh.getNumber());
        System.out.println("教师性别:" + lyh.getSex());

        System.out.println("******************课程信息*********************");
        Lesson_1 yw = new Lesson_1();
        yw.setName("语文");
        yw.setTime("每周一 上午8:15-12:00");
        yw.setNumber(112255);
        yw.setPlace("教456");
        System.out.println(yw.toString());

        System.out.println("******************课程详情*********************");
        System.out.println("选课成功，好好学习");

    }

}


class People{
    public People(){

    }
    public People(String name,int age,int number,String sex){
        this.name = name;
        this.age = age;
        this.number = number;
        this.sex = sex;
    }

    private String name;
    private int age;
    private int number;
    private String sex;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    public int getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
            this.age = age;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

}

class Student extends People{
    public Student(){

    }
    public Student(String name,int age,int number,String sex){
        super(name, age, number, sex);
    }
}

class Teacher extends People{
    public Teacher(){

    }
    public Teacher(String name,int age,int number,String sex){
        super(name, age, number, sex);
    }
    String lesson_1;
    public String getLesson_1() {
        return lesson_1;
    }
    public void setLesson_1(String lesson_1) {
        this.lesson_1 = lesson_1;
    }


}


class Lesson{
    public Lesson(){

    }
    public Lesson(String name,String time,int number,String place){
        this.name = name;
        this.time = time;
        this.number = number;
        this.place = place;
    }

    private String name;
    private String time;
    private int number;
    private String place;


    public String getName() {
        return name;
    }
    public String getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }
    public int getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setPlace(String place) {
        this.place = place;
    }

}


class Lesson_1 extends Lesson{
    public Lesson_1(){

    }
    public Lesson_1(String name,String time,int number,String place){
        super(name, time, number, place);
    }
    public String toString() {
        return "课程名称：" + getName()+ "\n" + "上课时间：" + getTime() + "\n" + "课程编号：" + getNumber()+ "\n" + "授课地点：" + getPlace()+ "\n";
    }
}

