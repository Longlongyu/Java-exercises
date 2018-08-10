package inidi.longlongyu.a808;

public class Person {
	public String name;
	int age;

	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person();
		// p 指向了五个不同的new Person()出来的对象
		// 你无法知道，具体操作的是哪一个对象
		String s1 = "hello";
		String s2 = s1.substring(2,3);
		String s3 = s1.toString();
		String s4 = new StringBuffer(s1).toString();

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		
		String i = "a";
		switch (i) {
			case "a":
				System.out.println(1);
			break;
			default:
				System.out.println(System.identityHashCode(s4));
		}
	}
}