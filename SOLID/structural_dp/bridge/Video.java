package structural_dp.bridge;

public abstract class Video {

    protected Videoprocessor obj;
    public Video(Videoprocessor obj){
        this.obj = obj;
    }
    public abstract void play(String video_file);
    
}
