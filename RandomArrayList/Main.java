package RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList list = new RandomArrayList();

        list.add(15);
        list.add(80);
        list.add(13);
        list.add(16);
        list.add(488);
        list.add(62);

        System.out.println(list.getRandomElement());


    }
}
