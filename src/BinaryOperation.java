
public class BinaryOperation {
		static int[] a = new int[50] ;
		static int[] b = new int[50] ;
		static char[] c = new char[50] ;
		//�������
		public static void Head() {
			System.out.println("--------------------------------------------");
			System.out.println("---�������50��100���ڵļӼ�����Ŀ�����-- ");
			System.out.println("--------------------------------------------");
		}
		//����������
		public static void gennerateAdditionEquation(int heigh,int count) {
			for(int i= 0 ; i < count ; i++ ) {
				int n=0;
				int number1 = (int)(Math.random()*heigh+1) ;
				int number2 = (int)(Math.random()*heigh+1) ;
				a[i] = number1 ;
				b[i] = number2 ;
				for(int j=0 ; j < i ; j++ ) {
					if( a[i] == a[j] && b[i] == b[j] )
						n=1;
				}
				if( n == 1 ||(number1 < number2 && (number1 + number2) > heigh)) {
					i--;
				}		
			}
		}
		//���������
		public static void Yunsuanfu(int count) {
			for(int i = 0 ; i < count ; i++ ) {
				if( a[i] < b[i] )
					c[i]='+';
				else
					c[i]='-';
			}
		}
		//�����ʽ
		public static void print(int count) {
			for(int i = 0 ; i < count ; i++ ) {
				System.out.print( ""+(i+1)+":\t"+a[i] + c[i] + b[i] + "=" + "     \t");
				if( i % 5 == 4 )
					System.out.println();
			}
		}
		//�����������
		public static void Daan(int count) {
			System.out.println("�𰸣�\t");
			for(int i = 0 ; i < count ; i++ ) {
				if(c[i]=='+')
					System.out.print( ""+(i+1)+":\t"+(a[i] + b[i]) + "     \t");
				else
					System.out.print( ""+(i+1)+":\t"+(a[i] - b[i]) + "     \t");
				if( i % 5 == 4 )
					System.out.println();
			}
		}
		public static void main(String[] args) {
			Head();
			gennerateAdditionEquation(100,50);
			Yunsuanfu(50);
			print(50);
			System.out.println();
			Daan(50);
		}
}
