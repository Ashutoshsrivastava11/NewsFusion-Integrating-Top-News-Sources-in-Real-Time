package main.java.com.example.news;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/{source}")
    public List<News> getNewsBySource(@PathVariable String source) {
        return newsService.getNewsBySource(source);
    }
}
