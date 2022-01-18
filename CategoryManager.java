package javacampOdev;

public class CategoryManager {
	
	public void addCategory(int categoryId, String categoryName) {
		
		System.out.println("Kategori eklendi : " + categoryName);
		System.out.println("Kategori numarasi :" + categoryId);
		
	}
	
	public void deleteCategory(int categoryId, String categoryName) {
		System.out.println(categoryName + "isimli kategori silindi. Kategori numarasi : "+ categoryId );
	}

}
