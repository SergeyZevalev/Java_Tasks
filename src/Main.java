public class Main {
    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper();
        NewsCallback callback = new NewsCallback() {
            @Override
            public void provideNews(News news) {
                newspaper.publish(news);
            }
        };
        NewsFactory factory = new NewsFactory(callback);
        factory.init();
    }

}