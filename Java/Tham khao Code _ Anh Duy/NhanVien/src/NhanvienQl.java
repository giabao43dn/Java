import java.util.ArrayList;

public class NhanvienQl {
    private ArrayList<Nhanvien> nhanviens;

    public NhanvienQl() {
        nhanviens = new ArrayList<>();
    }


    public void checkLuong() {
        for(NhanVien nhanvien : nhanviens) {
            if(nhanvien.getLuong() > 100) {
                System.out.println(nhanvien);
            }
        }
    }

    public void addStudent(Nhanvien nhanvien) {
        nhanviens.add(nhanvien);
    }

    public void removeStudent(String studentId) {
        boolean found = false; // Biến để kiểm tra nếu sinh viên đã tìm thấy
        for (int i = 0; i < nhanviens.size(); i++) {
            Nhanvien s = nhanviens.get(i);
            if (s.getId().equals(studentId)) {
                nhanviens.remove(i); // Xóa sinh viên tại vị trí i
                found = true;
                System.out.println("Đã xóa sinh viên với mã: " + studentId);
                break; // Thoát vòng lặp sau khi đã xóa
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên với mã: " + studentId);
        }
        //nhanviens.removeIf(s -> s.getId().equals(studentId));  // lọc danh sách = vòng for nâng cao
    }

    public void updateStudent(String studentId, String name, int age, double score) {
        for (Nhanvien s : nhanviens) {
            if (s.getId().equals(studentId)) {
                s.setTen(name);
                s.setTuoi(age);
                s.setLuong(score);
            }
        }
    }

    public Nhanvien findStudent(String studentId) {
        for (Nhanvien s : nhanviens) {  //forEach
            if (s.getId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    public void hienthi() {
        for (Nhanvien s : nhanviens) {
            System.out.println(s);
        }
    }
}



//public class StudentManager {
//    private Nhanvien[] nhanviens; // Khai báo mảng sinh viên
//    private int count; // Biến theo dõi số lượng sinh viên
//
//    public StudentManager(int capacity) {
//        nhanviens = new Nhanvien[capacity]; // Khởi tạo mảng với kích thước nhất định
//        count = 0; // Khởi tạo số lượng sinh viên
//    }
//
//    public void checkScore() {
//        for (int i = 0; i < count; i++) {
//            if(nhanviens[i].getScore() < 8) {
//                System.out.println(nhanviens[i]);
//            } else {
//                System.out.println("Không có sinh viên nào có điểm trên 8");
//            }
//        }
//    }
//
//    public void addStudent(Nhanvien nhanvien) {
//        if (count < nhanviens.length) {
//            nhanviens[count] = nhanvien; // Thêm sinh viên vào mảng
//            count++;
//        } else {
//            System.out.println("Danh sách đã đầy, không thể thêm sinh viên.");
//        }
//    }
//
//    public void removeStudent(String studentId) {
//        for (int i = 0; i < count; i++) {
//            if (nhanviens[i].getId().equals(studentId)) {
//                // Đẩy các sinh viên phía sau lên
//                for (int j = i; j < count - 1; j++) {
//                    nhanviens[j] = nhanviens[j + 1];
//                }
//                nhanviens[count - 1] = null; // Xóa sinh viên cuối
//                count--; // Giảm số lượng sinh viên
//                return;
//            }
//        }
//        System.out.println("Không tìm thấy sinh viên với mã: " + studentId);
//    }
//
//    public void updateStudent(String studentId, String name, int age, double score) {
//        for (int i = 0; i < count; i++) {
//            if (nhanviens[i].getId().equals(studentId)) {
//                nhanviens[i].setName(name);
//                nhanviens[i].setAge(age);
//                nhanviens[i].setScore(score);
//                return;
//            }
//        }
//        System.out.println("Không tìm thấy sinh viên với mã: " + studentId);
//    }
//
//    public Nhanvien findStudent(String studentId) {
//        for (int i = 0; i < count; i++) {
//            if (nhanviens[i].getId().equals(studentId)) {
//                return nhanviens[i];
//            }
//        }
//        return null; // Nếu không tìm thấy
//    }
//
//    public void displayStudents() {
//        if (count == 0) {
//            System.out.println("Không có sinh viên nào trong danh sách.");
//        } else {
//            for (int i = 0; i < count; i++) {
//                System.out.println(nhanviens[i]);
//            }
//        }
//    }
//}