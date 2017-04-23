package org.observer.pattern.weather;

/**
 * 测试 客户端
 * 	以“天气”为例，实现观察者模式
 * 观察者： 1. 小张的女朋友		2.黄明老妈 
 * 主题：天气 
 * 
 * @author William Cheng
 * 2016年9月3日-下午6:40:39
 */
public class TestClient {
	
	public static void main(String[] args) {
		//1. 创建目标
		ConcreteWeatherSubject wether = new ConcreteWeatherSubject();
		
		//2. 创建观察者
		ConcreteWeatherObserver observerGirl = new ConcreteWeatherObserver();
		observerGirl.setObserverName("小张的女朋友");
		observerGirl.setRemindThing("使我们的第一次约会，地点街心公园，不见不散哦");
		ConcreteWeatherObserver observerMun = new ConcreteWeatherObserver();
		observerMun.setObserverName("老妈");
		observerMun.setRemindThing("是一个购物的好日子，明天去天虹扫货");
		
		//3. 注册观察者
		wether.attatch(observerGirl);
		wether.attatch(observerMun);
		
		//4. 目标发布天气
		wether.setWeatherContent("明天天晴晴朗，蓝天白云，气温28度");
	}
}
