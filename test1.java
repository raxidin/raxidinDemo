package shuyan5;
import java.io.*;
/*ͨ���ļ��ַ��������������������ļ����ݵ�д��Ͷ�ȡ����*/
public class test1 {
	public static void main(String[] args) {
		//��ȡ���ļ����������
		File f1=new File("strin.txt");
		//д����ļ��������ڻᴴ��
		File f2=new File("strout.txt");
		char c [] =new char[1000];
		try {
			//ָ��Դ��������
			Reader in =new FileReader(f1);
			//ָ��Ŀ�ĵص������
			Writer out=new FileWriter(f2);
			int n=-1;
			while ((n=in.read(c))!=-1) {
				out.write(c,0,n);
			}
			//�ر������
			out.close();
			//�ر�������
			in.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
