package testReflact;


public class person {
	private String name ="私有刘小猪";
	public String lover="xiaoyu";

	private void say(){
		System.out.println("我是私有方法 对外不开放");
	}

	private String  show(String name){
		return name;
	}
	public person() {
		System.out.println("无参构造");
	}
	public person(String name) {
		this.name = name;
		System.out.println("带参构造"+name);
	}
}
