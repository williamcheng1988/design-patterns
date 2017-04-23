package org.observer.pattern.weather;


import java.util.ArrayList;
import java.util.List;

public abstract class WeatherSubject {
	
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
	
	protected void notifyObservers(){
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
	
}
