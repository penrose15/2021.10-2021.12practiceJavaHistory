package generics;

public class GenericPrinter<T extends Material> { //extends ������ ����� �� �ִ� �ڷ����� ������ ��
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;  //T�ڷ������� ������ ����
	}
	
	public T getMaterial() {
		return material;
	}
	public String toString() {
		return material.toString();  //T�ڷ��� ���� material�� ��ȯ�ϴ� ���׸� �޼���
	}
	public void printing() {
		material.doPrinting();  //���� Ŭ������ Material�� �޼��� ȣ��
	}


}
