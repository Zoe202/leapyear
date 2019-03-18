package example;

import java.io.IOException;
import java.util.Calendar;

public class Example1 {

	public static void main(String[] args) {
		/*Runtime rt=Runtime.getRuntime();
		System.out.println("处理器的个数"+rt.availableProcessors());
		System.out.println("空闲内存个数"+rt.freeMemory());
		System.out.println("最大可用内存数量"+rt.maxMemory());
		try {
			Process process=rt.exec("notepad.exe");
			Thread.sleep(3000);
			process.destroy();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Calendar time=Calendar.getInstance();
		time.set(2019, 3,4);
		time.add(Calendar.DATE,40);
		int year=time.get(time.YEAR);
		int month=time.get(time.MONTH)+1;
		int day=time.get(time.DATE);
		System.out.println(year+"年"+month+"月"+day+"日");
		}

}
