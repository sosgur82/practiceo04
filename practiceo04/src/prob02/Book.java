package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private boolean stateCode;

	public Book() {
	}
	
	
	
public Book(int bookNo, String title, String author) {
		// TODO Auto-generated constructor stub
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = true; 
	}



@Override
public String toString() {
	if(stateCode == false) {
	return "책 제목 : "+ title +" 작가 : " + author + " 대여 유무 : "+"대여중";
	}else
	{
	return "책 제목 "+ title +" 작가 : " + author + " 대여 유무 : "+"재고있음";
	}
}



public int getBookNo() {
	// TODO Auto-generated method stub
	return bookNo;
}


public void rent() {
	// TODO Auto-generated method stub
	this.stateCode = false;
	System.out.println(title + "이(가) 대여 됐습니다.");
}

}