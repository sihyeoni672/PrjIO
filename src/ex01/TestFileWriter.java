// 26.11.03
package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		
		// java 에서 " " 안에 \ 한개만 넣으면 에러
		//           " " 안에 \ -> \\
		
		//String path ="c:\test\num01\read01\file";
		//System.out.println(path);
		
		// 특수문자가 아니라 경로로 표시하려면 "\"->"\\"
		//String path2 ="c:\test\num01\read01\file";
		//System.out.println(path);

		String filename="D:\\Sean\\java\\PrjIO\\src\\ex01\\bts.txt";
		//String filename="D:/Sean/java/PrjIO/src/ex01/bts.txt";
		//System.out.println(filename);
		// 파일 생성 : open~close하면 새로운 파일이 생성
		// java는 open 명령을 new할때 실행된다
		
		String [] names = {"RM", "진","슈가","제이홉","지민","뷔","정국"};
		FileWriter fw= new FileWriter(filename);
		
		for(int i=0; i<names.length; i++) {
			fw.write(i+"."+names[i]+"\n");
		}
		fw.close();
		System.out.println(filename+"이 저장되었습니다");
	}

}
