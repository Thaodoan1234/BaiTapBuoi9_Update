package entities;

public class TamGiac {
    private Diem d1, d2, d3;

    // hàm contructor rỗng
    public TamGiac() {
        this.d1 = Diem.generate();
        this.d2 = Diem.generate();
        this.d3 = Diem.generate();
    }

    // hàm contructor đc gán giá trị
    public TamGiac(Diem d1, Diem d2, Diem d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    // to String --> String bufer --> chỉnh lại
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TamGiac{");
        sb.append("  d1 = ").append("(").append(d1.getX()).append(", ").append(d1.getY()).append(")").append("\n");
        sb.append("  d2 = ").append("(").append(d2.getX()).append(", ").append(d2.getY()).append(")").append("\n");
        sb.append("  d3 = ").append("(").append(d3.getX()).append(", ").append(d3.getY()).append(")").append("\n");
        sb.append('}');
        return sb.toString();
    }

    // tính chu vi tam giác
    public  double calculatePerimeter() {
        double a = this.d1.distance(this.d2);
        double b = this.d1.distance(this.d3);
        double c = this.d2.distance(this.d3);
        return  a+b+c;
    }

    //tính diện tích tam giác
    public double calculateArea() {
        double a = this.d1.distance(this.d2);
        double b = this.d1.distance(this.d3);
        double c = this.d2.distance(this.d3);
        double p = (a+b+c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
}
