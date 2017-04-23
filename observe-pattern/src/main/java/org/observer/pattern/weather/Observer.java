package org.observer.pattern.weather;


/**
 * 这是一个观察者借口，顶一个更新的接口给那些需要
 * @author lenovo
 *
 */
public interface Observer {
	
	public void update(WeatherSubject subject);
}
