package prob01;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	//Object 할경우 캐스팅할때 문제가 발생함 캐스팅을 잘못할 가능성이 생김.
//		public void println(Object obj) {
//		// TODO Auto-generated method stub
//		System.out.println(obj);
//	}
		
	public <T> void println(T t)
	{
		System.out.println(t);
	}
	public <T, P, Q> List<P> println(T t, Q q) 
	{
			System.out.println(t +":" + q);
			
			List<P> list = new ArrayList<P>();
			return list;
	}
	//가변 파라메터 메소드 만들기
	public void println2 (String[] parmas)
	{
		for(String s : parmas) {
			System.out.print(s + ":");
		}
		System.out.println("");
	}
	
	public void println3 (Object... parmas)
	{
		for(Object s : parmas) {
			System.out.print(s + ":");
		}
		System.out.println("");
	}

		
}
