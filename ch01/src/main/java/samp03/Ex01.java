package samp03;
import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		AbstractApplicationContext ac = 
			new FileSystemXmlApplicationContext("beans01.xml");
		MessageBean mb = ac.getBean("mb", MessageBean.class);
		mb.sayHello("바이든");
		ac.close();
	}
}
// c + s + o 사용하지 않는 것을 import에서 제외해 준다 