//file reader pulled from stack overflow and modified for assignment//
package CLC;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileReader {

	public fileReader(String fileName){
		readFile(fileName);
	}
	public fileReader() {
		
	}
	
	private ArrayList <firstBean> beanList;
	
	public ArrayList <firstBean> getMyBeans(){
		return beanList;
	}
	
	private void readFile (String filename){
		File nameOfFile = new File (filename);
		beanList = new ArrayList <firstBean> ();
		try {
			Scanner inputstream = new Scanner(nameOfFile);
			while (inputstream.hasNext()){
				String data = inputstream.nextLine();
				String values[] = data.split(",");
				firstBean newBean = new firstBean();
				newBean.setBID(Integer.parseInt(values[0]));
				newBean.setBName(values[1]);
				newBean.setBNum(Integer.parseInt(values[2]));
				newBean.setBWord(values[3]);
				beanList.add(newBean);
			}
			inputstream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void writeFile (String destination){
		try {
			PrintWriter writer = new PrintWriter (destination, "utf-8");
			for (firstBean bean: beanList){
				writer.println(bean.getBID() + "," 
						+ bean.getBName() + "," 
						+ bean.getBNum() + "," 
						+ bean.getBWord());
			}
			writer.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void printList(){
		for (firstBean bean: beanList){
			System.out.print("Bean ID: " + bean.getBID() + " ");
			System.out.print("Bean Name: " + bean.getBName() + " ");
			System.out.print("Bean Number: " + bean.getBNum() + " ");
			System.out.print("Bean Word: " + bean.getBWord());
			System.out.println();
		}
	}
}
