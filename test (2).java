package shuyan5;
import java.io.*;
//通过文件字节输入流和输出流进行文件的内容的读取和写入
public class test {
	public static void main(String[] args) {
		//读取数据的时候判断用的
		int n=-1;
		byte [] b=new byte[1000];
		try {
			//设定输入流的源,必须存在
			File f1=new File("bytein.txt");
			//设定输出流的目的地，不存在会创建
			File f2=new File("byteout.txt");
			//创建指向源的输入流
			InputStream in=new FileInputStream(f1);
			//String对象str用来保存读取的数据
			String str=new String();
			//读取数据
			while ((n=in.read(b))!=-1) {
				String s=new String(b,0,n);
				str=s;
			}
			//数据
			byte c[] =str.getBytes();
			byte a[] ="热西丁·麦麦提敏".getBytes();
			byte d[] ="\n".getBytes();
			//创建指向目的地的输出流
			FileOutputStream out=new FileOutputStream(f2);
			//写入数据
			out.write(c);
			out.write(d);
			out.write(a);
			out.write(d);
			//关闭数据
			in.close();
			out.close();
			//输入输出异常
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}
