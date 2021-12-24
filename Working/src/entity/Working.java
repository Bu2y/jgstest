package entity;

import java.util.Date;

public class Working {
    private long id;
    private String title;
    private String content;
    private Date createDate;
    private int type;
    public Working() {
    }
    public Working(String title, String content, int type) {
        this.title = title;
        this.content = content;
        this.type = type;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
