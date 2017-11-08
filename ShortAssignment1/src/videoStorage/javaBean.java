package videoStorage;

import java.util.Scanner;

public class javaBean {
	
	static double diskSpace1 = 0;
	static double diskSpace2 = 0;
	static double diskSpace3 = 0;
	static double diskSpace4 = 0;


    public static void main(String[] args) {
    	
    	Scanner reader = new Scanner(System.in);  
    	System.out.println("Enter a video length in seconds: ");
    	int l = reader.nextInt();
    	
    	reader.close(); 
        
        // instantiate the videoCalc and pass values
        videoCalc sizeVideo1 = new videoCalc(720, l);
        
        // instantiate the videoCalc and pass values
        videoCalc sizeVideo2 = new videoCalc(1080, l);
        
        // get file size from videoCalc object
        diskSpace1 = sizeVideo1.getFileSizeGB();
        
        diskSpace2 = sizeVideo2.getFileSizeGB();
        
        diskSpace3 = sizeVideo1.getFileSizeMB();
        
        diskSpace4 = sizeVideo2.getFileSizeMB();
        
        
        
        // Print out results 
        System.out.println("A video with a resolution of " + sizeVideo1.getResolution() + "p\n"
        +"with a length of " + sizeVideo1.getVideoLength() + " seconds,\n"
        +"will require " + String.format( "%.2f", diskSpace3 )+ " GB of disk space and " + String.format( "%.2f", diskSpace1 )+ " MB of disk space.");
        
        System.out.println();
        
        System.out.println("A video with a resolution of " + sizeVideo2.getResolution() + "p\n"
                +"with a length of " + sizeVideo2.getVideoLength() + " seconds,\n"
                +"will require " + String.format( "%.2f", diskSpace4 )+ " GB of disk space and " + String.format( "%.2f", diskSpace2 )+ " MB of disk space.");
       
    }
}
