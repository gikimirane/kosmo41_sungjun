import com.company.area.Circle;

class B_ImportCircle {
	public static void main(String[] args) {
		com.company.area.Circle c1 = new com.company.area.Circle(3.5);
		System.out.println("반지름 3.5 원 넓이: " + c1.getArea());
		
		com.company.length.Circle c2 = new com.company.length.Circle(3.5);
		System.out.println("반지름 3.5 원 둘레: " + c2.getPerimeter());
	}
}