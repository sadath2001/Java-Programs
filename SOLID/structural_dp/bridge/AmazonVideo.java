package structural_dp.bridge;

public class AmazonVideo extends Video{

    AmazonVideo(Videoprocessor obj) 
    {
        super(obj);
    }
    @Override
    public void play(String video_file)
    {
        System.out.println("Playing Amazon Video: " + video_file);
        //creating brige 
        obj.processVideo(video_file);
    }
    
}
