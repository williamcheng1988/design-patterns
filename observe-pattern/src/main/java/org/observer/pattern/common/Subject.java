package org.observer.pattern.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题类：
 * 		拥有观察者列表，提供添加、删除观察者借口
 * @author William Cheng
 * 2016年9月3日 下午6:09:30
 */
public abstract class Subject {
	
	//观察者集合
	List<Observer> observers = new ArrayList<Observer>();
	
	/**
	 * 添加观察者方法
	 * @param observer
	 */
	public void attatch(Observer observer){
		observers.add(observer);
	}
	/**
	 * 删除观察者方法
	 * @param observer
	 */
	public void detatch(Observer observer){
		observers.remove(observer);
	}
	/**
	 * 循环通知观察者
	 */
	protected void notifyObservers(){
		for (Observer observer : observers) {
			observer.push(this);		//此处使用推模型：即把 主题对象整个传给 观察者
		}
	}
	
	/**
	 * 循环通知观察者
	 */
	protected void notifyObservers(String content){
		for (Observer observer : observers) {
			observer.pull(content);		//此处使用拉模型：即把 具体的消息传给 观察者
		}
	}
}
