package com.chap06_class_and_object.practice_2;

public class StudentDTO {

    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {}
    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
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

//    public int getAvg(){
//        return (kor + eng + math) / 3;
//    }


    //    학년=1, 반=5, 이름=홍길동, 국어=40, 영어=60, 수학=70, 평균=56
//    학년=2, 반=1, 이름=김말똥, 국어=70, 영어=80, 수학=100, 평균=83
//    학년=3, 반=3, 이름=강경순, 국어=100, 영어=75, 수학=86, 평균=87
    public String getInformation(){
        return "학년=" + grade + ", 반=" + classroom + ", 이름=" + name + ", 국어="+ kor + ", 영어=" + eng + ", 수학=" + math;
    }

}
