package Task_3;

/*
 * Teacher - Alexander Ts 
 * Student - Snigarenko Vlad
 * 10 02 2018 ã.
 * 
 * http://www.math.mrsu.ru/text/courses/method/n-mernie_vectory_i_operacii_nad_nimi.htm
 * http://ru.onlinemschool.com/math/library/vector/multiply1/
 *
 */

public class Main {

	public static void main(String[] args) {

		Vector3D firstVector3D = new Vector3D(15, 8, 11.5);
		
		Vector3D secondVector3D = new Vector3D();
		secondVector3D.setA(11);
		secondVector3D.setB(10.55);
		secondVector3D.setC(2);
		
		System.out.println("First " + firstVector3D);

		System.out.println();
		
		System.out.println("Second " + secondVector3D);

		System.out.println();

		System.out.println("Add (first and second) vectors = " + firstVector3D.add(secondVector3D));

		System.out.println();
		
		System.out.println("Composition scalar (first and second) vectors = " + firstVector3D.compositionScalar(secondVector3D));

		System.out.println();
		
		System.out.println("Composition vector (first and second) vectors = " + firstVector3D.compositionVector(secondVector3D));

		System.out.println();
		
		// Modify second vector
		secondVector3D.setA(secondVector3D.getA() - 20);

		System.out.println("Second (after modify) " + secondVector3D);

		System.out.println();

		System.out.println("Add (first and second) vectors = " + firstVector3D.add(secondVector3D));
		
	}

}
