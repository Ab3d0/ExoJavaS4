import java.io.File;

public class ex1 {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Au revoir");
        }else{
            String dirPath = args[0];
            File dir = new File(dirPath);

            if(dir.exists() && dir.isDirectory()){

            }else{
                System.out.println("Repertoire n'existe pas");
            }
    }

    }
}