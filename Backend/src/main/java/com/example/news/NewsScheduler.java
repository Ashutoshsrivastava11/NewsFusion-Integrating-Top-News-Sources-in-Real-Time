package main.java.com.example.news;

@Component
public class NewsScheduler {

    @Autowired
    private NewsService newsService;

    @Scheduled(fixedRate = 3600000) // Fetch news every hour
    public void fetchNewsPeriodically() {
        newsService.fetchNewsFromSources();
    }
}
