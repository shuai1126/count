package count;

import java.io.*;

public class count {

    public static void main(String[] args) {
        FileWriter bw = null;
        int f = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\1.txt"));
            String line=null;
            bw = new FileWriter("D:\\2.txt",true);//所保存的文件位置，true代表不是覆盖操作
            while( (line=br.readLine())!=null){
                line=line.replaceAll("[\\pP\\p{Punct}]","");
                //line=line.replaceAll(" ","");
                line=line.trim();
                //f+=line.split(" ").length;

                    bw.write(line+"\r\n");


            }
            br.close();
            bw.close();
            //System.out.println(f);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}