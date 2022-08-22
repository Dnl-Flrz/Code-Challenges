public class CODE_3 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (NumPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean NumPrimo(int num){
        if (num == 1){
            return false;
        } else if (num == 2 || num == 3 || num == 5 || num == 7) {
            return true;
        }else {
            for (int i = 2; i < 10; i++) {
                if (num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
