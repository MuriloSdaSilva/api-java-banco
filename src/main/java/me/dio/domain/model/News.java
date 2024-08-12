package me.dio.domain.model;

public class News {
    private long id;
    private String icon;
    private String description;

    public News(long id, String icon, String description) {
        this.id = id;
        this.icon = icon;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
