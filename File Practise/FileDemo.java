import java.io.File;

public class FileDemo {
     static void p (String s){
         System.out.println(s);
     }

    public static void main(String[] args) {
         File f1 = new File("dir/dir1");
        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getParent());
        System.out.println(f1.exists() ? "exists" : "Nah, does not exist");
        System.out.println(f1.canWrite() ? "is writeable" : " not writeable");
        System.out.println(f1.canRead() ? "is readable" : "not readable");
        System.out.println(f1.isDirectory() ? "yes, a directory" : "not a directory");
        System.out.println(f1.isFile() ? "yes,a file" : "not a file");
        System.out.println(f1.length() + "Bytes");
    }
}
