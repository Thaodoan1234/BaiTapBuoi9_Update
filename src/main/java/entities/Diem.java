package entities;

public class Diem {
    private  int  x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // contructor
    //bắt buộc là hàm public
    // tên giống với tên class
    //phát sinh contructor mới gán tru
    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public  Diem(int px, int py) {
        this.x = px;
        this.y = py;
    }

    // str x, y
    public static Diem parseFromString(String str) {
        String[] parts = str.split(",");
        Diem ret = new Diem();
        ret.x = Integer.parseInt(parts[0]);
        ret.y = Integer.parseInt(parts[1]);
        return ret;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Diem{");
        sb.append(" x =").append(x);
        sb.append(", y =").append(y);
        sb.append('}');
        return sb.toString();
    }

    // dùng random tạo tọa độ bất kỳ
    public static Diem generate() {
        final int max = 10;
        final int min = -10;
        int x =  (int)  Math.floor(Math.random() * (max-min)) + min;
        int y =  (int)  Math.floor(Math.random() * (max-min)) + min;
        return new Diem(x,y);
    }

    //tính khoảng cách từ điểm hiện tại dến điểm muốn xét
    public double distance(Diem another) {
        double dx =  another.x - this.x;
        double dy = another.y -this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // điểm có tọa độ của x, y đều là giá trị âm
    public Diem findCentralSymmetry() {
        Diem ret = new Diem();
        ret.x = -this.x;
        ret.y = -this.y;
        return ret;
    }

    // điểm có tọa độ x dương, y âm
    public Diem findXAxisSymmetry() {
        Diem ret = new Diem();
        ret.x = this.x;
        ret.y = -this.y;
        return ret;
    }

    // điểm có tọa độ  x âm, y dương
    public Diem findYAxisSymmetry() {
        Diem ret = new Diem();
        ret.x = -this.x;
        ret.y = this.y;
        return ret;
    }

    //tính góc phần tư
   public  int detecQuadrant() {
    if (this.x >= 0 && this.y >= 0) return 1;
    if (this.x <= 0 && this.y >= 0) return 2;
    if (this.x <= 0 && this.y <= 0) return 3;
    return 4;
    }



}
