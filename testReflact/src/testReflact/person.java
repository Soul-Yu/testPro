package testReflact;


public class person {
	private String name ="˽����С��";
	public String lover="xiaoyu";

	private void say(){
		System.out.println("����˽�з��� ���ⲻ����");
	}

	private String  show(String name){
		return name;
	}
	public person() {
		System.out.println("�޲ι���");
	}
	public person(String name) {
		this.name = name;
		System.out.println("���ι���"+name);
	}
}
