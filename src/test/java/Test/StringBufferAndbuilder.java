package Test;

public class StringBufferAndbuilder {
	public static void main(String[] args)
	{
		String s= new String("Velocity");
		StringBuffer sb= new StringBuffer("Katraj");
		StringBuilder sbb = new StringBuilder("Pune");
		s.concat("pune");
		sb.append("pune");
		sbb.append("maharashtra");
		System.out.println(s);
		System.out.println(sb);
		System.out.println(sbb);
		sb.reverse();
		System.out.println(sb);


	}

}
