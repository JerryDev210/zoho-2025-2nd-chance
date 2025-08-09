import java.util.*;
public class Qus6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int packages = in.nextInt();
        int dependency =in.nextInt();
        int [][]depends=new int[packages][packages];
        int [] inVectors = new int[packages];
        Deque<Integer> que = new LinkedList<>();
        String ans="";
        for(int i=0;i<dependency;i++){
            char s_package = in.next().charAt(0);
            char depended = in.next().charAt(0);
            depends[s_package-'A'][depended-'A']=1;
            inVectors[s_package-'A']++;
        }
        for(int i=0;i<packages;i++){
            if(inVectors[i]==0){
                que.offer(i);
            }
        }
        for(int [] row : depends)
            System.out.println(Arrays.toString(row));
        while (!que.isEmpty()) {
            int currentNode=que.poll();
            if(inVectors[currentNode]!=0) continue;
            ans+=(char)(currentNode+'A');
            for(int row=0;row<packages;row++){
                if(depends[row][currentNode]==1){
                    if(--inVectors[row]==0)
                        que.offer(row);
                }
            }
        }
        for(int num: inVectors){
            if(num!=0){
                System.out.println(Arrays.toString(inVectors));
                System.out.print(-1);
                return;
            }
        }
        System.out.println(ans);
    }
}

/*
4 3
A B
B C
C D

5 5
A B
A E
B D
C D
D E

 */