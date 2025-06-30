package ch02.sec01;

public class Equal {
	public static void main(String[] args) {
		int x = 10;
		int y = x;
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}
