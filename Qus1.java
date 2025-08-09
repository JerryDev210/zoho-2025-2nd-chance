import java.util.*;
public class Qus1 {
    public static void main(String[] args) {
        Stack<String> tags=new Stack<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter list of Tags:");
        String inputs[]=in.nextLine().trim().split("\\s+");
        for(String tag:inputs){
            if(tag.matches("<+[A-Za-z0-9]+>")){
                // System.out.println(true);
                tags.push(tag.replaceAll("[<>]",""));
            }else if( tags.isEmpty() || ! tags.pop().equalsIgnoreCase(tag.replaceAll("[</>]",""))){
                System.out.print(false);
                in.close();
                return;
            }
        }
        System.out.print(tags.isEmpty());
        // System.out.print(Arrays.toString(inputs));
        in.close();
    }

}

/*
 
<html> <body> <p> </p> </body> </html>

 */