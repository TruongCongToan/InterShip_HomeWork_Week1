package OOP_Homework_Bai1;

public class Newspaper extends Document {
	private int ngayphathanh;
//khoi tao constructor
	public Newspaper(String matailieu, String tenNXB, int sobanphathanh, int ngayphathanh) {
        super(matailieu, tenNXB, sobanphathanh);
        this.ngayphathanh = ngayphathanh;
    }

public int getNgayphathanh() {
	return ngayphathanh;
}

public void setNgayphathanh(int ngayphathanh) {
	this.ngayphathanh = ngayphathanh;
}

@Override
public String toString() {
	return "------------------------------------------------------------------------------------\nBao:  [ngayphathanh=" + ngayphathanh + ", matailieu=" + matailieu + ", tenNXB=" + tenNXB
			+ ", sobanphathanh=" + sobanphathanh + "]\n------------------------------------------------------------------------------------";
}


}
