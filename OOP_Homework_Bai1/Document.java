package OOP_Homework_Bai1;

import java.io.Serializable;

public class Document implements Serializable {
	protected String matailieu;
    protected String tenNXB;
    protected int sobanphathanh;

    //klhoi tao constructor
    public Document() {
    	super();
    }
    //khoi tao constructor co tham so
    public Document(String matailieu, String tenNXB, int sobanphathanh) {
		super();
		this.matailieu = matailieu;
		this.tenNXB = tenNXB;
		this.sobanphathanh = sobanphathanh;
	}
	public String getMatailieu() {
		return matailieu;
	}
	public void setMatailieu(String matailieu) {
		this.matailieu = matailieu;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public int getSobanphathanh() {
		return sobanphathanh;
	}
	public void setSobanphathanh(int sobanphathanh) {
		this.sobanphathanh = sobanphathanh;
	}

}