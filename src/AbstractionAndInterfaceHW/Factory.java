package AbstractionAndInterfaceHW;

public class Factory {
    public static void main(String[] args) {
        Game f = new Football();
        Game h = new Hockey();
        Game t = new TableTennis();

        f.play();
        h.play();
        t.play();
    }
}
