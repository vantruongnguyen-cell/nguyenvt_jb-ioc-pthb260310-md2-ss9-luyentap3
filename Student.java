package LuyenTap3;

public class Student {
    // Thuộc tính private
    private String id;
    private String fullName;
    private int age;
    private double gpa;

    // Biến static để đếm số lượng sinh viên
    private static int count = 0;

    // Hằng số (final)
    private final double MIN_GPA = 0.0;
    private final double MAX_GPA = 4.0;

    // Constructor có tham số
    public Student(String id, String fullName, int age, double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;

        // Kiểm tra gpa trong phạm vi cho phép trước khi gán
        if (gpa >= MIN_GPA && gpa <= MAX_GPA) {
            this.gpa = gpa;
        } else {
            this.gpa = 0.0;
        }

        // Tăng count mỗi khi một đối tượng mới được tạo
        count++;
    }

    // Phương thức static để lấy tổng số sinh viên
    public static int getCount() {
        return count;
    }

    // Phương thức in thông tin
    public void printInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.fullName);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa);
        System.out.println("-------------------------");
    }
}
