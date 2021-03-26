package PasswortDeterminer;

public class deneme {
    public static void main(String[] args) {


        Character karakter = new Character('ö');
       boolean a= Character.isAlphabetic(karakter);
       boolean b=Character.isDigit('l');
        System.out.println(a);
        System.out.println(b);

    }
}
