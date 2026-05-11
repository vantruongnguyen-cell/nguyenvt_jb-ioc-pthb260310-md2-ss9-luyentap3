package LuyenTap3;

public class Main {
    public static void main(String[] args) {
        // Tạo 3 object Student
        Student s1 = new Student("S01", "Nguyen Van A", 20, 3.5);
        Student s2 = new Student("S02", "Le Thi B", 21, 3.8);
        Student s3 = new Student("S03", "Tran Van C", 19, 2.9);

        // In thông tin từng sinh viên
        System.out.println("===== DANH SÁCH SINH VIÊN =====");
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();

        // In ra tổng số sinh viên
        System.out.println("Tổng số sinh viên hiện có: " + Student.getCount());
    }
}
