package org.observer.pattern.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者实现
 * @author William Cheng
 * 2016年9月3日-下午7:42:57
 */
public class ConcreteWeatherObserver implements Observer {
	
	//观察者名字
	private String observerName;

	public String getObserverName() {
		return observerName;
	}
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public void update(Observable o, Object arg) {
		System.out.println("拉模式实现==>"+this.observerName+"收到消息:"+((ConcreteWhatherSubject)o).getContent());
		System.out.println("推模式实现==>"+this.observerName+"收到消息:"+arg);
	}

}
