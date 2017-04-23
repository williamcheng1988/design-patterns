package org.observer.pattern.common;

/**
 * 测试 客户端
 * 	模拟 自定义 观察者、目标类 实现 观察者模式
 * @author William Cheng
 * 2016年9月3日-下午6:30:09
 */
public class TestClient {
	
	public static void main(String[] args) {
		//1. 创建目标
		ConcreteSubject wether = new ConcreteSubject();
		
		//2. 创建观察者
		ConcreteObserver observer1 = new ConcreteObserver();
		ConcreteObserver observer2 = new ConcreteObserver();
		ConcreteObserver observer3 = new ConcreteObserver();
		
		//3. 注册观察者
		wether.attatch(observer1);
		wether.attatch(observer2);
		wether.attatch(observer3);
		
		//4. 目标发布天气
		wether.setSubjectState("主题的状态改变了！");
	}
}
