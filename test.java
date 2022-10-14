package chapter10_1;
import java.io.*;

public class test {

	public static void main(String[] args) {
		File f1=new File("src\\chapter1_1\\Hello.java");
		System.out.println("文件存在吗"+f1.exists());
		System.out.println(f1.getName()+"是可读吗"+f1.canRead());
		System.out.println(f1.getName()+"的长度"+f1.length());
		System.out.println(f1.getName()+"的绝对路径"+f1.getAbsolutePath());
		File f2=new File("new.txt");
		if(!f2.exists()) {
			try {
				f2.createNewFile();
				System.out.println("在当前目录下创建了新建文件:"+f2.getName());
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println(e);
				
			}
		}
		else
		System.out.println("文件已经存在");
		

	}

}
