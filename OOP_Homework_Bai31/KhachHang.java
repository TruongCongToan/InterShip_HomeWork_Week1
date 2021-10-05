package OOP_Homework_Bai31;

public class KhachHang {
	protected String tenchuho;
	protected String sonha;
	protected int masocongto;
	//khoi tao constructor
	
	public KhachHang(String tenchuho, String sonha, int masocongto) {
		super();
		this.tenchuho = tenchuho;
		this.sonha = sonha;
		this.masocongto = masocongto;
	}
	public String getTenchuho() {
		return tenchuho;
	}
	public void setTenchuho(String tenchuho) {
		this.tenchuho = tenchuho;
	}
	public String getSonha() {
		return sonha;
	}
	public void setSonha(String sonha) {
		this.sonha = sonha;
	}
	public int getMasocongto() {
		return masocongto;
	}
	public void setMasocongto(int masocongto) {
		this.masocongto = masocongto;
	}
	@Override
	public String toString() {
		return "KhachHang [tenchuho=" + tenchuho + ", sonha=" + sonha + ", masocongto=" + masocongto + "]";
	}
	
}
