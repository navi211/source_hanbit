package lambdasinaction.chap5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Major {

    public static void main(String[] args) throws Exception {


        Path path = Paths.get("C:\\IdeaProjects\\source_hanbit\\src\\main\\resources\\lambdasinaction\\chap5","Salaries.csv");

        long cnt = Files.lines(path)
                .skip(1)
                .count();

        System.out.println(cnt);




    }

}
