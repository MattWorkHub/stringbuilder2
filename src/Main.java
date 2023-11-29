public class Main {
    public static void main(String[] args) {
        String txt = "lololol";
        int charPosition = 4;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(txt.charAt(charPosition));
        System.out.println(stringBuilder);
    }
}