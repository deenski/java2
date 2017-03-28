public class Movie extends Entertainment {
    private String title;
    
    public Movie() {
        this.title = "the matrix";
    }
    
    public Movie(String t) {
        if (t.length() >= 1) {
            this.title = t;
        }
    }
    
    public void setTitle(String t) {
        if (t.length() >= 1) {
            this.title = t;
        }
    }
    
    public String getTitle() {
        return this.title;
    }
}