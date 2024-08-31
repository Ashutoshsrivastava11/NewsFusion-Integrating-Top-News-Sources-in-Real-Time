package main.java.com.example.news;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAllNews() {
        return ((Object) newsRepository).findAll();
    }

    public List<News> getNewsBySource(String source) {
        return newsRepository.findBySource(source);
    }

    // Fetch news from multiple sources
    public void fetchNewsFromSources() {
        fetchFromTheHindu();
        fetchFromTimesOfIndia();
        fetchFromJagran();
        fetchFromNYT();
    }

    private void fetchFromTheHindu() {
        try {
            Document doc = Jsoup.connect("https://www.thehindu.com/").get();
            Elements headings = doc.select("h2"); // Adjust selector based on website structure
            headings.forEach(heading -> {
                News news = new News(heading.text(), "The Hindu");
                newsRepository.save(news);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fetchFromTimesOfIndia() {
        try {
            Document doc = Jsoup.connect("https://timesofindia.indiatimes.com/").get();
            Elements headings = doc.select("h2");
            headings.forEach(heading -> {
                News news = new News(heading.text(), "Times of India");
                newsRepository.save(news);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fetchFromJagran() {
        try {
            Document doc = Jsoup.connect("https://www.jagran.com/").get();
            Elements headings = doc.select("h2");
            headings.forEach(heading -> {
                News news = new News(heading.text(), "Dainik Jagran");
                newsRepository.save(news);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void fetchFromNYT() {
        try {
            Document doc = Jsoup.connect("https://www.nytimes.com/").get();
            Elements headings = doc.select("h2");
            headings.forEach(heading -> {
                News news = new News(heading.text(), "The New York Times");
                newsRepository.save(news);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
