package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();

		printer.println( 10 );
		printer.println( true );
		printer.println( 5.7 );
		printer.println( "홍길동" );
		
		
		printer.println("둘리",true);
		
		//가변변수
		printer.println2(new String[]{"둘리","마이콜","또치"});
		
		printer.println3("둘리");
		printer.println3("둘리","마이콜");
		printer.println3("둘리","마이콜","또치");
		printer.println3("둘리","마이콜","또치",10,"길동");
	}

}
