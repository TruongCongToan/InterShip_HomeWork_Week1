package OOP_Homework_Bai1;
import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
	List <Document> documents;

	//khoi tao danh sach cac documents dang arrayList
public QuanLySach() {
	 this.documents = new ArrayList<>();}

//method them moi tai lieu
public void addDocument(Document document) {
	this.documents.add(document);
	}

//method xoa tai lieu theo ma tai lieu
public boolean deleteDocument(String matailieu) {
	 Document doc = this.documents.stream()
             .filter(document -> document.getMatailieu().equals(matailieu)).findFirst().orElse(null);
	 if(doc==null) {
		 return false;
	 }
	 this.documents.remove(doc);
	return true;

	}
//hien thi thong tin cua tai lieu
public void ShowInformation() {
	  this.documents.forEach(documents -> System.out.println(documents.toString()));
}
//tim kiem theo loai sach
public void searchByBooks() {
	 this.documents.stream().filter(doc -> doc instanceof Books).forEach(doc -> System.out.println(doc.toString()));
}
//tim kiem theo tao tri
public void searchByMagazine() {
	this.documents.stream().filter(doc -> doc instanceof Magazine).forEach(doc -> System.out.println(doc.toString()));
}
//tim kiem theo bao
public void searchByNewspaper() {
	 this.documents.stream().filter(doc -> doc instanceof Newspaper).forEach(doc -> System.out.println(doc.toString()));
 }
}