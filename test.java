package chapter10_1;
import java.io.*;

public class test {

	public static void main(String[] args) {
		File f1=new File("src\\chapter1_1\\Hello.java");
		System.out.println("�ļ�������"+f1.exists());
		System.out.println(f1.getName()+"�ǿɶ���"+f1.canRead());
		System.out.println(f1.getName()+"�ĳ���"+f1.length());
		System.out.println(f1.getName()+"�ľ���·��"+f1.getAbsolutePath());
		File f2=new File("new.txt");
		if(!f2.exists()) {
			try {
				f2.createNewFile();
				System.out.println("�ڵ�ǰĿ¼�´������½��ļ�:"+f2.getName());
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println(e);
				
			}
		}
		else
		System.out.println("�ļ��Ѿ�����");
		

	}

}
