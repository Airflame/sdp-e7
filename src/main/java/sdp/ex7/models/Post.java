package sdp.ex7.models;

import javax.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String topic;
    private String text;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;
}
