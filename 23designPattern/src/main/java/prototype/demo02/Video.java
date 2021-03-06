package prototype.demo02;

import java.util.Date;


/**
 * 1. 实现一个接口
 * 2. 重写一个方法
 */
public class Video implements Cloneable {//复制别人的视频

    private String name;

    private Date createdTime;

    public Video(String name, Date createdTime) {
        this.name = name;
        this.createdTime = createdTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        Video video = (Video) obj;
        video.createdTime = (Date) this.createdTime.clone();

        return obj;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}
