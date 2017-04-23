package org.observer.pattern.java;

/**
 * 测试 客户端
 * 模拟 java 自带的 观察者模式实现
 * @author William Cheng
 * 2016年9月11日-下午5:52:58
 */
public class TestClient {

	public static void main(String[] args) {
		//创建 主题 对象
		ConcreteWhatherSubject subject = new ConcreteWhatherSubject();
		
		//创建 观察者对象 
		ConcreteWeatherObserver observer1 = new ConcreteWeatherObserver();
		observer1.setObserverName("小张");
		ConcreteWeatherObserver observer2 = new ConcreteWeatherObserver();
		observer2.setObserverName("小李");
		ConcreteWeatherObserver observer3 = new ConcreteWeatherObserver();
		observer3.setObserverName("小王");

		//注册观察者
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.addObserver(observer3);
		
		//更新天气主题状态
		subject.setContent("今天天气晴朗，风和日丽，天空中飘着一朵朵小白云。。。");
	}

}
