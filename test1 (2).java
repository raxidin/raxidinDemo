package shuyan5;
import java.io.*;
/*通过文件字符输入流和输出流，完成文件内容的写入和读取操作*/
public class test1 {
	public static void main(String[] args) {
		//读取的文件，必须存在
		File f1=new File("strin.txt");
		//写入的文件，不存在会创建
		File f2=new File("strout.txt");
		char c [] =new char[1000];
		try {
			//指向源的输入流
			Reader in =new FileReader(f1);
			//指向目的地的输出流
			Writer out=new FileWriter(f2);
			int n=-1;
			while ((n=in.read(c))!=-1) {
				out.write(c,0,n);
			}
			//关闭输出流
			out.close();
			//关闭输入流
			in.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
