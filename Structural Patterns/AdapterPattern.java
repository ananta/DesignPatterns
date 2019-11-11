interface FetchNews {
    void fetchLatestNews();
    void fetchTrendingNews();
}

class NewsClient implements FetchNews{
    @Override
    public void fetchLatestNews(){
        System.out.println("Fetching Latest News");
    };
    @Override
    public void fetchTrendingNews(){
        System.out.println("Fetching Trending News");
    };
};

class BlogClient {
    public void fetchLatestBlogs(){
        System.out.println("Fetching Latest Blogs");
    };
    public void fetchTrendingBlogs(){
        System.out.println("Fetching Trending Blogs");
    };
};

class BlogAdapter implements FetchNews{
    BlogClient bg;
    BlogAdapter(BlogClient bg){
        this.bg = bg;
    }
    @Override
    public void fetchLatestNews(){
       this.bg.fetchLatestBlogs();
    };
    @Override
    public void fetchTrendingNews(){
        this.bg.fetchTrendingBlogs();
    };
}

class Client {
    public static void main(String[] args){

        FetchNews Blog = new BlogAdapter(new BlogClient());
        Blog.fetchLatestNews();
        Blog.fetchTrendingNews();
    }
}