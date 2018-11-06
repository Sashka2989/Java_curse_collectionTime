import java.util.*;

public class Lsts{
	public static void main(String[] args)
	{
		ArrayList <String> arList = new ArrayList <> ();
		List <String> linkList = new LinkedList <> ();
		Set <String> trSet = new TreeSet <> ();
		
		long tme;
		
		for(int i = 0; i < 100; ++i){
			arList.add("Thing");
			linkList.add("Baaa");
			trSet.add("hll");
		}
		
		System.out.println("Add in ArrayList:");
		tme = System.nanoTime();
		arList.add("sss");
		tme = System.nanoTime() - tme;
		System.out.println(tme);
		
		System.out.println("Delete elm ArrayList:");
		tme = System.nanoTime();
		arList.remove(50);
		tme = System.nanoTime() - tme;
		System.out.println(tme);
		
		System.out.println("Add in linkList:");
		tme = System.nanoTime();
		linkList.add("sss");
		tme = System.nanoTime() - tme;
		System.out.println(tme);
		
		System.out.println("Delete elm linkList:");
		tme = System.nanoTime();
		linkList.remove(50);
		tme = System.nanoTime() - tme;
		System.out.println(tme);
		
		System.out.println("Add in TreeSet:");
		tme = System.nanoTime();
		trSet.add("sss");
		tme = System.nanoTime() - tme;
		System.out.println(tme);
				
	}
}