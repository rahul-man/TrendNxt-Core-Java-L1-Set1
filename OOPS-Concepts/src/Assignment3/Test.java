package Assignment3;

public class Test {

	public static void main(String[] args) {
	Magazine mag= new Magazine("ISBN001","India Today",150.0 ,"News/Business");	
	mag.displayMagzine();
	
	Novel novel= new Novel("ISBN003","Train to Pakistan",200.0 ,"Kushwant Singh");
	novel.displayNovel();
	}

}
