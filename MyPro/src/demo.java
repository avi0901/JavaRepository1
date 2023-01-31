import pack1.MyInterface;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface ref=()->{System.out.println("inside lambda disp");};
		ref.disp();
	}

}
