import java.util.*;

class IP{
    int a;
    int b;
    int c;
    int d;
    public IP(int a,int b,int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    public boolean equals(IP other){
        if(a!=other.a) return false;
        if(b!=other.b) return false;
        if(c!=other.c) return false;
        return d==other.d;
    }
    public boolean greater(IP other){
        if(a>other.a) return false;
        if(b>other.b) return false;
        if(c>other.c) return false;
        return d<=other.d;
    }public boolean lesser(IP other){
        if(a<other.a) return false;
        if(b<other.b) return false;
        if(c<other.c) return false;
        return d>=other.d;
    }
}
public class Qus3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter target IP:");
        String Starget_ip = in.nextLine().trim();
        System.out.print("Enter Whitelist IP:");
        String whitelist[] = in.nextLine().split("\\s+");
        IP targetIp=createIP(Starget_ip);
        if(targetIp == null){
            System.out.println("Invalid Target IP");
            return;
        }
        HashSet<IP> ips = new HashSet<>();
        List<IP[]> ipRange = new ArrayList<>();
        for (String ip : whitelist) {
            if(ip.contains("-")){
                String range [] = ip.split("-");
                IP start = createIP(range[0]);
                IP end = createIP(range[1]);
                if(start ==null || end == null){
                    System.out.println("Invalid IP Range");
                    continue;
                }
                ipRange.add(new IP[]{start,end});
            }else{
                IP singleIp=createIP(ip);
                if(singleIp==null){
                    System.out.println("Invalid Single IP");
                    continue;
                }
                ips.add(singleIp);
            }
        }
        for(IP singleIps: ips){
            if (singleIps.equals(targetIp)) {
                System.out.println(true);
                return;
            }
        }
        for(IP[] range : ipRange){
            if(range[0].greater(targetIp) && range[1].lesser(targetIp)){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
        in.close();
    }
    
    static IP createIP(String ip){
        // System.out.println(ip);
        String values[]=ip.split("\\.");
        if(values.length!=4){
            return null;
        }
        int ipArr[]=new int[4];
        for(int i=0;i<4;i++){
            ipArr[i]=Integer.parseInt(values[i]);
            if(ipArr[i]<0 || ipArr[i]>255) return null;
        }
        return new IP(ipArr[0], ipArr[1], ipArr[2], ipArr[3]);
    }
}

/*
 * 
 * 192.168.1.15
 * 192.168.1.1-192.168.2.10 192.168.1.15 10.0.0.1-10.0.0.5
 * 
 * 192.168.2.10
 * 192.168.1.1-192.168.1.255 10.0.01
 * 
 */