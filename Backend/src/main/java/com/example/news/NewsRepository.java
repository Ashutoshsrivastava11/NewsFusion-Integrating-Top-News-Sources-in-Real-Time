package main.java.com.example.news;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findBySource(String source);
}
