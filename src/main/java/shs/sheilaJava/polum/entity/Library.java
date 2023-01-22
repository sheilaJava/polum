package shs.sheilaJava.polum.entity;

public class Library {
    private Long id;
    private String name;
    private User user;

    public Library() {
    }

    public Library(Long id, String name, User user) {
        this.id = id;
        this.name = name;
        this.user = user;
    }

    public Library(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}
