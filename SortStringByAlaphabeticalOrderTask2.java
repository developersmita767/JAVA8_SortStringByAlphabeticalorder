//Write program to sort list of strings in alphabetical order.

package Java8_Task;

import java.util.ArrayList;
import java.util.Collections;


public class SortStringByAlaphabeticalOrderTask2 {

	public static void main(String[] args) {
		ArrayList<String> stringList=new ArrayList<>();
		stringList.add("apple");
		stringList.add("orange");
		stringList.add("pineapple");
		stringList.add("grapes");
		stringList.add("anar");
		
		Collections.sort(stringList);
		System.out.println("sorted string is: " + stringList);
		
		

	}

}
