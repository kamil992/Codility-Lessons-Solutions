package Codility;

// 75%  !!!!!!
public class Brackets {

    public static void main(String[] args) {
        solution("{[()()]}");
    }

    public static int solution(String S){
        int counter = 0;

        if(S.length() == 0)
            return 1;

        if(S.charAt(0) == '(' && S.charAt(S.length() - 1) != ')' ||
                S.charAt(0) == '[' && S.charAt(S.length() - 1) != ']' ||
                S.charAt(0) == '{' && S.charAt(S.length() - 1) != '}') {
            return 0;
        }

        if(S.length() % 2 != 0)
            return 0;

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '(' ||
                    S.charAt(i) == '[' ||
                    S.charAt(i) == '{'){
                counter++;
            }

            if(S.charAt(i) == ')' ||
                    S.charAt(i) == ']' ||
                    S.charAt(i) == '}'){
                counter--;
            }
            if(counter < 0)
                return 0;

        }

        if(counter == 0)
            return 1;

        return 0;
    }
}
