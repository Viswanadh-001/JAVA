package MountB;

public class Test1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello Sai ");
		
		sb.append("Viswanadh");
		System.out.println(sb);
		
		sb.delete(10,19 );
		System.out.println(sb);
		
		sb.insert(10, "Viswanadh");
		System.out.println(sb);
		
		sb.replace(10, 19, "Kuppachi");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		String s = sb.toString();
		
		s.toUpperCase();
		System.out.println(s);
			}

}
