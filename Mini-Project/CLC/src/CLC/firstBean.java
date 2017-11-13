//Caleb Miller and is own work//
package CLC;

import java.io.Serializable;

public class firstBean implements Serializable{

	private static final long serialVersionUID = 42L;
	
	private String bName;
	private int bID;
	private int bNum;
	private String bWord;
	
	public firstBean() {
		bName = null;
		bID = 0;
		bNum = 0;
		bWord = null;
	}
	public firstBean(String name, int id, int num, String word) {
		bName = name;
		bID = id;
		bNum = num;
		bWord = word;
	}
	
	public void setBName (String name){
		this.bName = name;
	}
	public String getBName (){
		return bName;
	}
	
	public void setBID (int id){
		this.bID = id;
	}
	public int getBID (){
		return bID;
	}
	
	public void setBNum (int num){
		this.bNum = num;
	}
	public int getBNum (){
		return bNum;
	}
	
	public void setBWord (String word){
		this.bWord = word;
	}
	public String getBWord (){
		return bWord;
	}
	
}
