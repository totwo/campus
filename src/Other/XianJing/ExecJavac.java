/**
 * 
 */
package Other.XianJing;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Dahai
 * @Date 2015年10月6日
 * 打开Javac进程
 */
public class ExecJavac {
	public static void main(String[] args) {
		try {
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec("javac");
//			int exitVal = proc.exitValue();//打开进程马上获取关闭值,而实际上,进程还没关闭,所以会出异常
//			int exitVal = proc.waitFor();//而如果是执行命令,那命令不会关闭的话,程序就死这了
			
			//让错误信息输出来,进程才能结束(本电脑测试不是这样的!!!!!!!!!!!!!!!!)
			InputStream stderr = proc.getErrorStream();
			InputStreamReader isr = new InputStreamReader(stderr);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			System.out.println("<ERROR>");
			while( (line = br.readLine()) != null){
				System.out.println(line);
			}
			System.out.println("</ERROR>");
			int exitVal = proc.waitFor();
			
			
			
			System.out.println("Process exitValue:"+exitVal);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
