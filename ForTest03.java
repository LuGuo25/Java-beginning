/*
	��ż����
	
	����
		��1-100֮���ż���ͣ�������ͽ���ڿ���̨���
*/
public class ForTest03 {
	public static void main(String[] args){
		//��͵����ս�����뱣����������Ҫ����һ�����������ڱ�����͵Ľ������ʼֵΪ0
		int sum = 0;
		
		//��1-100�����������1=5��������ͼ�����ȫһ���������ǽ���������ͬ
		for(int i = 1; i <= 100; i++){
			//��1=100��ż����ͣ���Ҫ����Ͳ������������������ж��Ƿ���ż��
			if(i%2 == 0) {
				sum += i;
			}
		}
		
		//��ѭ��ִ�����ʱ�����������ݴ�ӡ����
		System.out.println("1-100֮���ż������" + sum);
	}
}