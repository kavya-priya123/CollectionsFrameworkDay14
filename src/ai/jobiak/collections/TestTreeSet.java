package ai.jobiak.collections;
import java.util.*;
public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet fruits = new TreeSet();
		fruits.add("Mango");
		fruits.add("Raspberry");
		fruits.add("Cherry");
		fruits.add("Kiwi");
		fruits.add("Dragon");
		System.out.println(fruits);
		TreeSet ranks =new TreeSet();
		ranks.add(4);
		ranks.add(2);
		ranks.add(6);
		ranks.add(8);
		System.out.println(ranks);
		Course c1= new Course("BCL1","Computer Banks",20,500);//old object
		Course c2= new Course("PGL1","Algorithms",40,2500);//this is the new object
		Course c3= new Course("AdvProgL3","JavaProgramming",60,5000);//what java feels about them we do not care
		Course c4= new Course("AdvProgL3","JavaProgramming",60,5000);
	/*	TreeSet courseTree=new TreeSet();
        courseTree.add(c1);
        courseTree.add(c2);
        courseTree.add(c3);
        courseTree.add(c4);
        System.out.println(courseTree);//ClassCastException and NullPointerException
	*/
		CourseComparator comparator=new CourseComparator();
		TreeSet courseTree=new TreeSet<>(comparator);		// it is an ordered collection
        courseTree.add(c1);
        courseTree.add(c2);
        courseTree.add(c3);
        courseTree.add(c4);
        System.out.println(courseTree);
	}

}
