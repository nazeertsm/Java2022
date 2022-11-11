package oct29;
import java.util.*;
public class Collections2 {

	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(5);
		al.add(0);
		al.add(15);
		System.out.println(al);//[10,5,0,15]
		Collections.sort(al);//sorting is done in Ascending order
		System.out.println(al);
	}

}

/*
Collection vs Collections
--------------------------------
Collection(I) => It is a root interface in Collection hierarchy
Collections(C) => It is a utility class(static methods/helper methods would be
available)

 *Usage of Compartor will be discussed to work with "Descending order".*/