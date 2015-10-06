/**
 * 
 */
package Other.XianJing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Dahai
 * @Date 2015年10月6日
 * 合理关闭输入输出流
 */
public class IOTest {
	public static void main(String[] args) {
		
	}
	public static void copy(String src, String dest) throws IOException{
		InputStream in = null;
		OutputStream out = null;
		try{
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while( (n = in.read()) >0 )
				out.write(buf,0,n);
		}finally{
//			if(in != null) in.close();
//			if(out!=null) out.close();//关闭方法也可能出异常,这样写不好
			if(in != null) try{
				in.close();
			}finally{
				in = null;
			}
			if(out!=null) try{
				out.close();
			}finally{
				out = null;
			}
		}
	}

}
