package structural_dp.bridge;

public class Main {
    public static void main(String[] args) {
        Video vid1=new AmazonVideo(new UHDVideoProcessor());
        vid1.play("video1");
    }
    
}
