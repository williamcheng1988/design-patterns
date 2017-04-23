package org.observer.pattern.weather;

/**
 * 具体的 天气 观察者
 * @author William Cheng
 * 2016年9月3日-下午6:28:54
 */
public class ConcreteWeatherObserver implements Observer {
	
	//观察者名字
	private String observerName;
	//天气预报内容
	private String weatherContent;
	//提醒需要做的事情
	private String remindThing;
	
	public String getObserverName() {
		return observerName;
	}
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}
	public String getWeatherContent() {
		return weatherContent;
	}
	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}
	public String getRemindThing() {
		return remindThing;
	}
	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}
	
	public void update(WeatherSubject subject) {
		weatherContent = ((ConcreteWeatherSubject)subject).getWeatherContent();
		System.out.println(observerName+"收到了"+weatherContent+","+remindThing);
	}
}
