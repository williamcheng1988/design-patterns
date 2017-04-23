package org.observer.pattern.common;

/**
 * 具体 观察者对象
 * @author William Cheng
 * 2016年9月3日-下午6:23:19
 */
public class ConcreteObserver implements Observer {
	
	//观察者状态
	private String observerState;

	public void push(Subject subject) {
		observerState = ((ConcreteSubject)subject).getSubjectState();
		System.out.println("观察到："+observerState);
	}

	public void pull(String msg) {
		observerState = msg;
		System.out.println("观察到："+observerState);
	}
}
