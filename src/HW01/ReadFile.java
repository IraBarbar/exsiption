package HW01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {

    public void read() throws IOException {

        File file = new File("C:\\Users\\Ирина\\IdeaProjects\\D\\exseption\\untitled\\src\\HW01\\file");
        int res = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
                try {      int[] ints = br.lines().mapToInt(Integer::parseInt).toArray();
                    for (int num: ints
                    ) {  System.out.println(num);
                        res += num;
                    }
                    System.out.println("Сумма : " + res);

                }  catch (NumberFormatException ex){
                    System.out.println("Строка содержит не корректные символы! ");
                }
        } catch (IOException e) {
            throw new IOException("Failed to read file: " + e);
        }

    }

}



