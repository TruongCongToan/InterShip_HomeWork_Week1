package OOP_Homework_Bai1;

public class Books extends Document{
	private String tentacgia;
	 private int sotrang;
	 
	 //khoi tao constructor
	public Books(String matailieu, String tenNXB, int sobanphathanh, String tentacgia, int sotrang) {
		//lay cua cha no
		super(matailieu,tenNXB,sobanphathanh);

		this.tentacgia = tentacgia;
		this.sotrang = sotrang;
		
	}
//khoi tao getters and setters cho books
	public String getTentacgia() {
		return tentacgia;
	}

	public void setTentacgia(String tentacgia) {
		this.tentacgia = tentacgia;
	}

	public int getSotrang() {
		return sotrang;
	}

	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}
	//generate to string Books
	@Override
	public String toString() {
		return 
				"----------------------------------------------------------------------------------------------\n"
				+ "Books [tentacgia=" + tentacgia + ", sotrang=" + sotrang + ", matailieu=" + matailieu + ", tenNXB="
				+ tenNXB + ", sobanphathanh=" + sobanphathanh + "]"
				+ "\n ----------------------------------------------------------------------------------------------\\";
	}

	 
}
