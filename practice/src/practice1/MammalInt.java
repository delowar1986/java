package practice1;

public class MammalInt implements Animal{

	public void eat () {
		System.out.println("Mammal eats");
	}
	public void travel(){
		System.out.println("Mammal travels");
	}

	
		public static void main (String args [] ){
				MammalInt m = MammalInt();
				m.eat();
				m.travel();
		}
		private static MammalInt MammalInt() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
