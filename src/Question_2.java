public class Question_2{
    public static int tabela(int lin, int col){
        int resposta;

        if (col < 1 || col > lin) {
            resposta = 0;
        }
        else if (col == 1) {
            resposta = 1;
        }
        else {
            resposta = tabela(lin - 1, col - 1) + tabela(lin - 1, col);
        }

        return resposta;
    }

    public static void main(String[] args){
        int x = tabela(5, 4);
        System.out.println(x); // 4
        System.out.println(tabela(4, 5)); // 0
        System.out.println(tabela(8, 3)); // 21
    }
}