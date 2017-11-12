package Tester;

public class Main {

	public static void main(String[] args) {

		fileReader option = new fileReader("https://github.com/battousairurik/CST-235/blob/master/Short%20Assignment%201B/DataReader/src/Reading.txt");
		theBean thisBean = option.getTheBean();
		
		System.out.println("The sum of the numbers in the file is: " 
				+ thisBean.getSumOfNumbers());
		System.out.println("The total number of words is: "
				+ thisBean.getNumOfWords());
		System.out.println("The total number of characters are: "
				+ thisBean.getNumOfCharacters());
	}

}
