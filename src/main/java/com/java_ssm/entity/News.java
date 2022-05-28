package com.java_ssm.entity;

public class News {
    public String id;
    public String title;
    public String image;
    public String desc;
    public String url;
    public String create_time;
    public String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", desc='" + desc + '\'' +
                ", url='" + url + '\'' +
                ", create_time='" + create_time + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

//    public News(String id, String title, String image, String desc, String url, String create_time, String content) {
//        this.id = id;
//        this.title = title;
//        this.image = image;
//        this.desc = desc;
//        this.url = url;
//        this.create_time = create_time;
//        this.content = content;
//    }
}
