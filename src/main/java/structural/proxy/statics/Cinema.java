package structural.proxy.statics;

/**
 * @author zhuyao
 */
public class Cinema implements Movie {

    RealMovie movie;

    public Cinema(RealMovie movie) {
        super();
        this.movie = movie;
    }


    @Override
    public void play() {

        guangGao(true);

        movie.play();

        guangGao(false);
    }

    public void guangGao(boolean isStart){
        if ( isStart ) {
            System.out.println("电影马上开始了，爆米花、可乐、口香糖9.8折，快来买啊！");
        } else {
            System.out.println("电影马上结束了，爆米花、可乐、口香糖9.8折，买回家吃吧！");
        }
    }

}
