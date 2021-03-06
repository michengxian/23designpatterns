package prototype.demo01;

import java.util.Date;

public class BiliBili {

    public static void main(String[] args) throws Exception {

        Date now = new Date();
        Video video1 = new Video("原始视频",now);

        System.out.println(video1.toString());



        Video video2 = (Video) video1.clone();


        video1.setName("1111");

        System.out.println(video1.toString());

        System.out.println(video2.toString());


    }

}
