package MyProject;

import MyProject.sach;

import java.util.ArrayList;

public class qlsach {
    private ArrayList<MyProject.sach> arrsach;



    public qlsach() {
        arrsach = new ArrayList();}

    public void addsach(MyProject.sach sach){arrsach.add(sach);}

    public void removesach(int id){
        boolean found = false;
        for (int i = 1; i<arrsach.size(); i++){
            sach s = arrsach.get(i);
            if (s.getId().equals(removeid)){
                arrsach.remove(i);}
            found = true;
            System.out.println("Đã xóa sinh viên với mã: " + removeid);
            break; // Thoát vòng lặp sau khi đã xóa
        }
    }

    public void hienthisach(){
        for (sach s : arrsach) {
            System.out.println(s);
        }
    }

}
