package javacampOdev;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Category category1 = new Category("Makine ogrenmesi",1,"IA,falan,filan");
		Category category2 = new Category ("Web Design",2,"HTML,CSS");
		
		Category[] categories = {category1,category2};
		
		CategoryManager categoryManager = new CategoryManager();
		
		for(Category category: categories) {
			
			categoryManager.addCategory(category.categoryNumber,category.categoryName );
		}
		
		
		

	}

}
