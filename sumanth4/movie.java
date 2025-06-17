 public class movie {
    String name;
    String duration;
    float rating;

    movie(String name, String duration, float rating) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    void details() {
        System.out.println("name: " + name);
        System.out.println("duration: " + duration);
        System.out.println("Rating: " + rating);
        
         if(rating>9.1f){
        System.out.println("the movie is Hit");
    }
    else{
        System.out.println("the movie is Flop"); 
    }
    
}
    public static void main(String[] args) {
        movie g1 = new movie("OG ", "3hrs", 9.5f);
        g1.details();
    }
 }
	
	