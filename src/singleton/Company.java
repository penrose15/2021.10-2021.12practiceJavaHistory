package singleton;

public class Company {
	private static Company instance = new Company(); //�����ϰ� ������ �ν��Ͻ�
	private Company() { }  //private�� CompanyŬ���� �������� �� Ŭ���� ���� ����
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();   ///�ν��Ͻ��� �ܺο��� ������ �� �ֵ��� get()�޼��� ����
		}
		return instance; //�����ϰ� ������ �ν��Ͻ� ��ȯ
	}
	

}
