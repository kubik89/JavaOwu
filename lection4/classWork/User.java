package lection4.classWork;

public class User <I> {

    private I id;

    public User(I id) {
        this.id = id;
    }

    public I getId() {
        return id;
    }
}
