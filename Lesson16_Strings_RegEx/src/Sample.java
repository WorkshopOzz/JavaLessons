public class Sample {
    public static void main(String[] args) {
        String info = "Молоко: 256, масло: 321, печенье: 54";
        info = info.replaceAll("\\D+"," ").trim();
        System.out.println(info);
       String[] split = info.split("\\s");
        System.out.println(split.length);
       int sum  = 0;
       for (String e: split) {
           System.out.println(e);
           sum += Integer.parseInt(e);
       }
        System.out.println(sum);
    }
}
