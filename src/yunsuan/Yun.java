
package yunsuan;

import java.util.Scanner;
//import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author dzy.
 *
 */

public final class Yun {
	//static final Logger log = Logger.getLogger(Yun.class.getName());
	final static Scanner in = new Scanner(System.in);
	/**
	 * .
	 */
	/**
	 * .
	 */
	private Yun() {
	}

	/**
	 * @param args.
	 */

	/**
	 * huihuihefiuw.
	 * 
	 * @param args
	 *            
	 */
	
	public static void main(final String[] args) {
		/*
		*
		*/
		// TODO Auto-generated method stub
		/*
		 * final String str1 = null; if(str1.equals("0")) {
		 * System.out.println("yeah"); }
		 */
		Expression exp = new Expression();
		exp.init();
		exp.simplify();
		exp.deri();
		//in.close();
		exp.init();
		exp.simplify();
		exp.deri();
	}
}

class Expression
{
	final static Scanner in = new Scanner(System.in);
	String abs;
	int c;
	int b;
	void init()
	{
		System.out.println("请输入多项式：");
		c = 1;
		abs = in.nextLine();
		b = abs.length();
		final char[] a1 = new char[b];
		for (int i = 0; i < b; i++) {
			a1[i] = abs.charAt(i);
		}
		for (int i = 0; i < b; i++) {
			if (i < b - 1 && a1[i] != '+' && a1[i] != '*') {
				if (a1[i + 1] != '+') {
					if (a1[i + 1] != '*') {
						System.out.println("输入错误");
						c = 0;
						break;
					}
				}
			}
		}
		for (int i = 0; i < b; i++) {
			final String l1 = String.valueOf(a1[i]);
			final Pattern p = Pattern.compile("[a-zA-Z]");
			final Pattern p2 = Pattern.compile("[0-9]");
			final Pattern p3 = Pattern.compile("[*]");
			final Pattern p4 = Pattern.compile("[+]");
			final Matcher m1 = p.matcher(l1);
			final Matcher m2 = p2.matcher(l1);
			final Matcher m3 = p3.matcher(l1);
			final Matcher m4 = p4.matcher(l1);
			if (c == 1 && !m1.find() && !m2.find() && !m3.find() && !m4.find()) {
				System.out.println("输入错误");
				break;
			}
			if (c == 1 && i == b - 1) {
				System.out.println(abs);
			}
		}
	}
	void simplify()
	{
		b = abs.length();
		final char[] a1 = new char[b];
		for (int i = 0; i < b; i++) {
			a1[i] = abs.charAt(i);
		}
		System.out.println("请输入未知数的值：");
		final String zhi = in.nextLine();
		final int f = zhi.length();
		final char[] b1 = new char[f];
		for (int j = 0; j < f; j++) {
			b1[j] = zhi.charAt(j);
		}
		final String[] sss = zhi.split(" ");
		int u = 0;
		final int n1 = 9;
		final int n2 = 10;
		final int n3 = 12;
		final int n4 = 4;
		if (!sss[0].equals("!simplify")) {
			System.out.println("输入错误");
		} else {
			if (f == n1) {
				System.out.println(abs);
			} else {
				for (int k = 0; k < b; k++) {
					if (a1[k] == b1[n2]) {
						a1[k] = b1[n3];
					}
				}
				while (f - n3 - u > 1) {
					u = u + n4;
					for (int k = 0; k < b; k++) {
						if (a1[k] == b1[n2 + u]) {
							a1[k] = b1[n3 + u];
						}
					}
				}
				for (int j = 0; j < b; j++) {
					System.out.print(a1[j]);
				}
				System.out.print("\n");
			}
		}
	}

	void deri()
	{
		b = abs.length();
		final char[] c1 = new char[b];
		for (int i = 0; i < b; i++) {
			c1[i] = abs.charAt(i);
		}
		final int n5 = 5;
		System.out.println("请输入要进行的求导：");
		final String dp = in.nextLine();
		final char[] q1 = new char[n5];
		final int n4 = 4;
		int mm = 0;
		int plan = 0;
		int g = 0;
		// String rt = "";
		final StringBuilder rt = new StringBuilder("");
		for (int i = 0; i < n5; i++) {
			q1[i] = dp.charAt(i);
		}
		for (int i = 0; i < b; i++) {
			if (q1[0] != '!' || q1[1] != 'd' || q1[2] != '/') {
				System.out.println("输入错误");
				break;
			} else if (i == b - 1 && c1[i] != q1[n4]) {
				System.out.println("输入错误");
			} else {
				while (mm < b) {
					if (c1[mm] == q1[n4]) {
						g = mm;
						while (g < b - 1 && (c1[g] == q1[n4] || c1[g] == '*' || c1[g + 1] == '*')) {
							if (c1[g] == q1[n4]) {
								plan = plan + 1;
							}
							g = g + 1;
						}
					}
					if (plan == 0) {
						// rt = rt + c1[mm];
						rt.append(c1[mm]);
						mm = mm + 1;
					} else {
						final String str = String.valueOf(plan);
						// rt = rt + str;
						rt.append(str);
						int j;
						for (j = mm + 1; j < g + 1; j++) {
							// rt = rt + c1[j];
							rt.append(c1[j]);
						}
						mm = g + 1;
						plan = 0;
					}
				}
				System.out.println(rt);
				break;
			}
		}
	}
	
	
}
