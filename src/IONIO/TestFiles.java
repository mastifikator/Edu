package IONIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class TestFiles {

    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws Exception{
        Path path = Paths.get("C:\\test");


        Files.walkFileTree(path, new MySimpleFileVisitor());

        for(String s : list){
            System.out.println(s);
            System.out.println("next");
        }
    }

    static class MySimpleFileVisitor extends SimpleFileVisitor<Path>{
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            list.add(file.toString());
            return super.visitFile(file, attrs);
        }
    }
}
