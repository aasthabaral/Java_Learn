import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a valid URL:");
        String URL;
        String Protocol;
        String Hostname;
        String Path;
        URL=scanner.nextLine();
        if(URL.contains("//") && URL.contains(".") && URL.contains("/")){
Protocol=URL.substring(0,URL.indexOf("//"));
Hostname=URL.substring(URL.indexOf("//")+2,URL.indexOf("."));
Path=URL.substring(URL.indexOf(".")+5);
            System.out.println(Protocol);
            System.out.println(Hostname);
            System.out.println(Path);
        }
            else{
            System.out.println("Invalid URL.Please enter valid URL.");
        }
            scanner.close();
    }
}
