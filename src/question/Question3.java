package question;

/**
 * 問題3.
 * <pre>
 * コマンドライン引数から1以上の整数値を受け取り、
 * それが何世紀であるかを出力するプログラムを作成してください。
 * ちなみに
 * 19世紀は1801年から1900年まで
 * 20世紀は1901年から2000年まで
 * です。
 * ※上記はあくまで例で、1801年から2000年まで出力できればよいわけではありません。
 * 
 * 例) 1900→19世紀、1901→20世紀、2000→20世紀、2001→21世紀、2100年→21世紀
 * </pre>
 * @author igamasayuki
 *
 */
public class Question3 {
	public static void main(String[] args) {
		int inputYear = Integer.parseInt(args[0]);
		int century = inputYear / 100;
		if (inputYear % 100 != 0) {
			century++;
		}
		System.out.println(inputYear + "年は" + century + "世紀です");
	}
}
