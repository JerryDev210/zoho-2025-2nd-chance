import java.util.*;
public class Qus5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> recent = new LinkedList<>();
        int k = in.nextInt();
        int songs = in.nextInt();
        for(int i=0;i<songs;i++){
            Integer song=in.nextInt();
            recent.remove(song);
            recent.offer(song);
            if(recent.size()>k){
                recent.poll();
            }
        }
        while (!recent.isEmpty()) {
            System.out.print(recent.pollLast()+" ");   
        }
    }
}

/*
3
7
5 3 5 2 4 5 1
 

 */