package MountB;

public class Test {

	public static void main(String[] args) {
		String name = "My name is Sai Viswanadh Kuppachi";
		String[] words = name.split("\\s+");
		StringBuffer sb = new StringBuffer();
		sb.append("My name is ");
		//sb.replace(11, 13, "Kuppachi");
		sb.append(words[words.length-1]);
		sb.append(" ");
		sb.append(words[words.length-3]);
		System.out.println(sb);
	}

}
