public class zigzag {

    static void zigzag(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("pre " + n);
        zigzag(n - 1);

        System.out.println("in " + n);
        zigzag(n - 1);

        System.out.println("post " + n);
    }

    public static void main(String[] args) {
        int n = 2;
        zigzag(n);
    }
}