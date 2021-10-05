package OOP_Homework_Bai1;

public class Magazine extends Document {
	   protected int sophathanh;
	   protected int thangphathanh;
	   
	   //khoi tao constructors co tham so
	public Magazine(String matailieu, String tenNXB, int sobanphathanh,int sophathanh, int thangphathanh) {
		super(matailieu,tenNXB,sobanphathanh);
		this.sophathanh = sophathanh;
		this.thangphathanh = thangphathanh;	
	}
	//khoi tao getters and setters

	public int getSophathanh() {
		return sophathanh;
	}

	public void setSophathanh(int sophathanh) {
		this.sophathanh = sophathanh;
	}

	public int getThangphathanh() {
		return thangphathanh;
	}

	public void setThangphathanh(int thangphathanh) {
		this.thangphathanh = thangphathanh;
	}

	@Override
	public String toString() {
		return "------------------------------------------------------------------------------------\nTap chi : [sophathanh=" + sophathanh + ", thangphathanh=" + thangphathanh + ", matailieu=" + matailieu
				+ ", tenNXB=" + tenNXB + ", sobanphathanh=" + sobanphathanh + "]\n------------------------------------------------------------------------------------";
	}
	
	

}
