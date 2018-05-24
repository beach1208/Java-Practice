package ClassExe_RandomLetter_etc;

public class Driver {
    public static void main(String[] args) {
        String[] arr = {"Hello", "Java","project","object"};
        RandomStringChooser chooser = new RandomStringChooser(arr);
        for (int i = 0; i < 10; i++){
            System.out.println(chooser.getNext());
        }

        RandomLetterChooser letterChooser = new RandomLetterChooser("Hello");
        for (int i = 0; i < 10; i++){
            System.out.println(letterChooser.getNext());
        }

    }
}
