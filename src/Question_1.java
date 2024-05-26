public class Question_1 {

    public static int inverso(int N) {
        //if (N == 0) return 0;

        int resposta = N;
        int count = 1;

        while (resposta != 0) {
            resposta /= 10;
            count *= 10;
        }
        count /= 10;

        resposta = N;
        resposta /=  10;
        N = N - resposta * 10;

        System.out.println("resposta: " + resposta + ", count: " + count + ", N: " + N);

        if (resposta == 0) {
            System.out.println("Returning (base case): " + (N * count));
            return N * count;
        }

        int result = N * count + inverso(resposta);
        System.out.println("Returning: " + result);
        return result;
    }

    public static void main(String[] args) {
        int x = inverso(1234);
        System.out.println(x);
        System.out.println(inverso(x));
    }
}
