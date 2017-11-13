//Caleb Miller and is his own work//
package dataReader;

public class Main {

	public static void main(String[] args) {

		fileReader option = new fileReader("src\\dataReader\\readThis.txt");
		theBean thisBean = option.getTheBean();
		
		System.out.println("The sum of the numbers are: " 
				+ thisBean.getSumOfNumbers());
		System.out.println("The total number of words is: "
				+ thisBean.getNumOfWords());
		System.out.println("The total number of characters are: "
				+ thisBean.getNumOfCharacters());
	}

}
