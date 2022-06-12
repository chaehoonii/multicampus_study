package studyjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon21918 {

    public static int[] command1(int[] state, int i, int x){
       
        state[i-1] = x;
        return state;
    }
    public static int[] command2(int[] state, int l, int r){
        
        for(int i = l-1; i < r; i++){
            if(state[i] == 0) state[i] = 1;
            else if(state[i] == 1) state[i] = 0;
        }
        return state;
    }

    public static int[] command3(int[] state, int l, int r){
        
        for(int i = l-1; i < r; i++){
            state[i] = 0;
        }
        return state;
    }

    public static int[] command4(int[] state, int l, int r){
      
        for(int i = l-1; i < r; i++){
            state[i] = 1;
        }
        return state;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int command = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] bulb = new int[cnt];
        for(int i = 0; i < bulb.length; i++){
            bulb[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < command; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 1) bulb = command1(bulb,b,c);
            else if(a == 2) bulb = command2(bulb,b,c);
            else if(a == 3) bulb = command3(bulb,b,c);
            else if(a == 4) bulb = command4(bulb,b,c);
        }
        for(int i = 0; i < bulb.length; i++){
            System.out.print(bulb[i]+" ");
        }
    }
}
