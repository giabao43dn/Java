package MyProject;

public class sach {
    private String id;
    private String name;
    private String nxb;
    private int price;

    public sach(String id, String name, String nxb, int price) {
        this.id = id;
        this.name = name;
        this.nxb = nxb;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
