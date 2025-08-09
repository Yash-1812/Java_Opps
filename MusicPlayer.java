interface MusicPlayer{
    void play();
    
    default void stop(){
        System.out.println("Stop the music");
    }
    
    static void about(){
        System.out.println("Music Player Interface V.0");
    }
}

class Spotify implements MusicPlayer{
    @Override
    public void play(){
        System.out.println("Play music on spotify");
    }
}