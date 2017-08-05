package max;

public class Asci {
	public static void main(String args[]){
		String s;
		int i;
		for(i=0;i<=255;i++){
			s=new Character((char)i).toString();
			System.out.println(i+ " = " +s);
		}
	}

}


