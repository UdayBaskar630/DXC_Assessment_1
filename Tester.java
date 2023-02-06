package Q3;


public class Tester
{

	
		public static void main(String[] args)
		{
		    Point p1 = new Point();
		    p1.setX(2);
		    p1.setY(3);
		    System.out.println("The distance of P1 from the origin is " + (p1.distance()));
		    
		    Point p2 = new Point();
		    p2.setX(5);
		    p2.setY(6);
		    System.out.println("The distance between p1 from p2 is " + (p1.distance(p2)));
		  }

	}


