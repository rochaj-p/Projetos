import java.util.Scanner;
public class baskara {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1,x2,delta;
		int a,b,c,tipo;
		System.out.printf("A equação do 2º grau possui:\n1.a,b e c\n2.a e b\n3.a e c\n>> ");
		tipo = sc.nextInt();
		if(tipo == 1) {
			System.out.printf("Digite o valor de a: ");
			a = sc.nextInt();
			System.out.printf("Digite o valor de b: ");
			b = sc.nextInt();
			System.out.printf("Digite o valor de c: ");
			c = sc.nextInt();
			delta = (double) Math.pow(b, 2)-4*a*c;
			if(delta<0) {
				System.out.printf("A equação não possui valor real.(Delta = %.2f < 0)",delta);
			}
			if(delta == 0) {
				x1 = (double)-b/2*a;
				System.out.printf("O valor de delta = 0, logo x = %.2f",x1);
			}
			if(delta>0) {
				x1 = (double)(-b+Math.sqrt(delta))/2*a;
				x2 = (double)(-b-Math.sqrt(delta))/2*a;
				System.out.printf("O valores de x são:\n\n x1 = %.1f\n x2 = %.1f",x1,x2);
			}
		}
		if(tipo == 2) {
			System.out.printf("Digite o valor de a: ");
			a = sc.nextInt();
			System.out.printf("Digite o valor de b: ");
			b = sc.nextInt();
			if(b<0 & a<0 | b>0 & a>0) {
				x2 = (double) -b/a;
				System.out.printf("Os valores de x são:\n x1 = 0\n x2 = %.1f",x2);
			}
			if(b<0 & a>0 | b>0 & a<0){
				x2 = (double)b/a;
				System.out.printf("Os valores de x são:\n x1 = 0\n x2 = %.1f",x2);
			}
		}
		if(tipo == 3) {
			System.out.printf("Digite o valor de a: ");
			a = sc.nextInt();
			System.out.printf("Digite o valor de c: ");
			c = sc.nextInt();
			if(a<0 & c<0 | a>0 & c>0) {
				System.out.printf("X não existe");
			}
			if(a<0 & c>0 | a>0 & c<0) {
				if(a<0 & c>0) {
					a=a*-1;
					x2=c/a;
					x2=Math.sqrt(x2);
					System.out.printf("Os valores de x são x1 = +%.1f e x2 = -%.1f",x2,x2);
				}
				if(a>0 | c<0) {
					c=c*-1;
					x2=c/a;
					x2=Math.sqrt(x2);
					System.out.printf("Os valores de x são x1 = +%.1f e x2 = -%.1f",x2,x2);
				}
			}
		}
		sc.close();
	}
}
