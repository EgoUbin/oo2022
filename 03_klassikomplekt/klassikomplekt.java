class klassikomplekt {
	
	static class FirstEdge{
		int length;
		
		FirstEdge(int t_length){this.length = t_length;}
	}
	
	static class SecondEdge{
		int length;
		
		SecondEdge(int t_length){this.length = t_length;}
	}
	
	static class Rectangle{
		int area;
	}
	
	public static void main( String args[] ) {
		FirstEdge edge1 = new FirstEdge(4);
		SecondEdge edge2 = new SecondEdge(12);
		Rectangle result = new Rectangle();
		result.area = edge1.length * edge2.length;
		System.out.println(result.area);
	}
	
}