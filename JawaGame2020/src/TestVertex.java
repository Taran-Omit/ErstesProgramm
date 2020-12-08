
public class TestVertex {

	public static void main(String[] args) {
		Vertex v1 = new Vertex(42, 34);
		Vertex v2 = new Vertex(0, 0);

		System.out.println(v1);
		
		Vertex v3 = v1.skalarMult(2);
		
		System.out.println(v2);
		
		System.out.println(v1.lenght());
		System.out.println(v3);
	}

}
