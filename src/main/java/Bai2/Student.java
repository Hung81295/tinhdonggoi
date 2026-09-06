package Bai2;

public class Student {
    private String name;
    private double score;

    Student(String name, double score) {
        this.name = name;
        if (score < 0 || score > 10) {
            System.out.println("Điểm nhập vào sai! " + score + " Điểm phải nhỏ hơn 10 và không phải số âm");
        } else {
            this.score = score;
        }
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 10) {
            System.out.println("Lỗi! " + score + " không nhỏ hơn 10 và không phải số dương lớn hơn hoặc bằng 0");
        } else {
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Student sv1 = new Student("Hưng", 9);
        sv1.setScore(11);
        sv1.setScore(-22);
        sv1.setScore(6);
        System.out.println("Điểm cuối cùng của " + sv1.getName() + " là: " + sv1.getScore());
    }
}
