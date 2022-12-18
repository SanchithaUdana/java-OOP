package abstracts;

public class samsung extends phone{

    @Override
    public void call() {
        System.out.println("in samsung call");
    }

    @Override
    public void sleep(){
        System.out.println("in samsung sleep");
    }

    @Override
    public void vibrate(){
        System.out.println("in samsung vibrate");
    }


}
