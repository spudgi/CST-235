package videoStorage;

public class videoCalc implements java.io.Serializable {
	
	private int resolution = 0;
	private double videoLength;
	private double fileSizeGB;
	private double fileSizeMB;
	
	public videoCalc(int resolution, double videoLength) {
		setResolution(resolution);
		setVideoLength(videoLength);
	}
	
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public double getVideoLength() {
		return videoLength;
	}
	public void setVideoLength(double videoLength) {
		this.videoLength = videoLength;
	}

	public double getFileSizeGB(){
        if(getResolution() == 720){
            fileSizeGB = videoLength * 0.375; 
        }else if(getResolution() == 1080){
            fileSizeGB = videoLength * 0.75; 
        }
        return fileSizeGB;
    }
    
    public double getFileSizeMB(){
        if(getResolution() == 720){
            fileSizeMB = videoLength * 0.375 / 1000; 
        }else if(getResolution() == 1080){
            fileSizeMB = videoLength * 0.75 / 1000; 
        }
        return fileSizeMB;
    }

}
