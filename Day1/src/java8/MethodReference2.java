package java8;

interface Parser {
	String parse(String s);
}

class MyPrinter {
	public void print(String s, Parser p) {
		s = p.parse(s);
		System.out.println(s);
	}
}

class StringParser {
	public static String convert(String s) {
		if(s.length() <= 3) {
			s = s.toUpperCase();
		}else {
			s = s.toLowerCase();
		}
		return s;
	}
}

public class MethodReference2 {
	public static void main(String[] args) {
		String str = "aji";
		MyPrinter mp = new MyPrinter();
//		mp.print(str, new Parser() {
//
//			@Override
//			public String parse(String s) {
//				return StringParser.convert(str);
//			}
//			
//		});
		
		mp.print(str, (s) -> StringParser.convert(str));
	}
}
