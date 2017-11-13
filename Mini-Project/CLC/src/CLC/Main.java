//Caleb Miller and is own work//
package CLC;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		readWriteExample();
		
	}
	
	private static void readWriteExample(){
		fileReader reader = new fileReader("src\\CLC\\readThis1.txt");
		reader.printList();
		System.out.println("With New Bean Added:");
		
		ArrayList<firstBean> tempList = reader.getMyBeans();
		firstBean bean = new firstBean("AddedBean", 3, 789, "Miller");
		tempList.add(bean);
		
		reader.writeFile("src\\CLC\\readThis1.txt");
		reader.printList();
	}

}
