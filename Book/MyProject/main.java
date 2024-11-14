package MyProject;

import MyProject.sach;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        qlsach manager = new qlsach();

        int choice = scanner.nextInt(); //kiểm soát menu

        do {
            //giao diện menu
            System.out.println("----------------------------------");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Cập nhật nhân viên");
            System.out.println("4. Tìm kiếm nhân viên");
            System.out.println("5. Hiển thị danh sách nhân viên");
            System.out.println("6. Nhân viên có lương lơn hon 100: ");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt(); //Nhập lựa chọn - lưu vào biến choice
            scanner.nextLine(); // Xử lý dòng mới

            //Kiểm soát menu theo biến choice và sau đó xử lí từng trường hợp riêng biệt
            switch (choice) {
                case 1:
                    System.out.print("Nhập mã nhân viên: ");
                    String idsach = scanner.nextLine();
                    System.out.print("Nhập tên nhân viên: ");
                    String namesach = scanner.nextLine();
                    System.out.print("Nhập NXB: ");
                    String nxbsach = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    int pricesach = scanner.nextInt();
                    manager.addsach(new sach(idsach,namesach,nxbsach,pricesach));
                    break;
                case 2:
                    System.out.print("Nhập mã nhân viên cần xóa: ");
                    int removeid = scanner.nextInt();
                    manager.removesach(removeid);
                    break;
//                case 3:
//                    System.out.print("Nhập mã nhân viên cần cập nhật: ");
//                    String updateId = scanner.nextLine();
//                    System.out.print("Nhập tên mới: ");
//                    String newName = scanner.nextLine();
//                    System.out.print("Nhập tuổi mới: ");
//                    int newAge = scanner.nextInt();
//                    System.out.print("Nhập lương mới: ");
//                    double newScore = scanner.nextDouble();
//                    manager.updateStudent(updateId, newName, newAge, newScore);
//                    break;
//                case 4:
//                    System.out.print("Nhập mã nhân viên cần tìm: ");
//                    String searchId = scanner.nextLine();
//                    Nhanvien foundStudent = manager.findStudent(searchId);
//                    if (foundStudent != null) {
//                        System.out.println("Thông tin nhân viên: " + foundStudent);
//                    } else {
//                        System.out.println("Không tìm thấy nhân viên.");
//                    }
//                    break;
                case 5:
                    manager.hienthisach();
//                    break;
//                case 6:
//                    manager.checkLuong();
//                    break;
//                case 0:
//                    System.out.println("Thoát chương trình.");
//                    break;
//                default:
//                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
        scanner.close();















    }
}
