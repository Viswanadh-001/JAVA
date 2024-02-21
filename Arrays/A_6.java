		package Arrays;

		import java.util.ArrayList;
		import java.util.Collections;

		public class A_6 {
			
		public static void main(String[] args) {
			boolean id[]= {true,false,false,true,false,true};
			ArrayList<Boolean> ids = new ArrayList<>();
			
			for(boolean value : id ) {
				ids.add(value);
			}
			Collections.reverse(ids);
			
			System.out.println(ids);
			
		}
	}

