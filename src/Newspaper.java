import java.util.ArrayList;
import java.util.List;



public class Newspaper {
    private int number;
    private final int SIZE = 4;
    private final List<News> news;


    public Newspaper() {
        this.news = new ArrayList<>(SIZE);
    }

    public void print(){
        System.out.println("Newspaper number " + number + "\"" + "_____________________");
    }

    public void publish(News news){
        if (this.news.size() == SIZE){
            print();
            for (News curNews: this.news){
                curNews.print();
            }
            number++;
            this.news.clear();
        } else {
            this.news.add(news);
        }

    }



}
