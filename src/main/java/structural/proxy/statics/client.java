package structural.proxy.statics;

/**
 * @author zhuyao
 */
public class client {

    public static void main(String[] args) {

        RealMovie realmovie = new RealMovie();

        Movie movie = new Cinema(realmovie);

        movie.play();
    }
}
