import ru.netology.MagicBox;

public class main {

    public static void main(String[] args) {
        MagicBox<Integer> magicBox1 = new MagicBox<>( 3);
        magicBox1.add(2);
        magicBox1.add(7);
        magicBox1.add(9);
        magicBox1.add(4);
        System.out.println(magicBox1.pick());
    }
}
