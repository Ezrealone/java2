# java2
javatest

## 实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。


## 实验方法
1.编写上述实体类以及测试主类
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
3.调试

## 实验过程
1.创建project，创建package.

2.创建people,student,teacher,lesson...class

3.在每个类中创建变量，分别为name,age,number,sex.

4.student继承people,teacher继承people，Lesson_1继承lesson.


## 核心方法
'''
  {

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
'''

## 实验结果
******************学生信息*********************
学生姓名:杜雨卿
学生年龄:20
学生学号:2019310861
学生性别:男
******************教师信息*********************
授课教师:李永红
教师年龄:61
教师学号:19999999
教师性别:女
******************课程信息*********************
课程名称：语文
上课时间：每周一 上午8:15-12:00
课程编号：112255
授课地点：教456

******************课程详情*********************
选课成功，好好学习


## 实验感想
这次实验相比上次实验来说更加的困难，要更加掌握继承方法，要了解super方法，这次的实验充分利用了子类父类的继承以及定义的属性及方法。
