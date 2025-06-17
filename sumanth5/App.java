class App {
    String name;
    String category;
    int downloads;
    float rating;

    App(String name, String category,int downloads, float rating) {
        this.name = name;
        this.category = category;
        this.downloads=downloads;
        this.rating = rating;
    }

    void details() {
        System.out.println("name: " + name);
        System.out.println("category: " + category);
        System.out.println("downloads: " + downloads);
        System.out.println("Rating: " + rating);
        
         if(downloads>1000){
             System.out.println("It is more popular");
         }
         else{
             System.out.println("It is not popular");
         }
    }
    
}

public class Main {
    public static void main(String[] args) {
        App a1 = new App("spotify", "Songs", 1234,9.0f);
        a1.details();
    }
   
}
