package main.java.com.example.news;

import java.time.LocalDateTime;

@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "source")
    private String source;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public News() {
        this.createdAt = LocalDateTime.now();
    }

    public News(String title, String source) {
        this.title = title;
        this.source = source;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters...
}
