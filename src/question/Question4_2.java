package question;

import java.time.LocalDate;

/**
 * 問題4.
 * 
 * <pre>
 * (LocalDateクラスを使用した解答例)
 * コマンドライン引数から数値を受け取り、それがうるう年で
 * あるかどうかを出力するプログラムを作成してください。
 * うるう年かどうかを判定する処理は、引数がint型、
 * 戻り値がboolean型のメソッドとして定義してください。
 *  うるう年の定義は以下となります。
 *  西暦年が4で割り切れる年はうるう年
 *  ただし、西暦年が100で割り切れる年は平年
 *  ただし、西暦年が400で割り切れる年はうるう年
 *  
 *  例)	1900年はうるう年ではありません。
 *  		2000年はうるう年です。
 *  		2100年はうるう年ではありません。
 *  		2400年はうるう年です。
 * </pre>
 * 
 * @author igamasayuki
 *
 */
public class Question4_2 {
	public static void main(String[] args) {
		int inputYear = Integer.parseInt(args[0]);
		System.out.print(inputYear + "年は");
		if (isLeapYear(inputYear)) {
			System.out.println("うるう年です。");
		} else {
			System.out.println("うるう年ではありません。");
		}
	}

	/**
	 * うるう年かどうかを判定します.
	 * 
	 * @param year
	 *            西暦の年
	 * @return うるう年：true 平年：false
	 */
	public static boolean isLeapYear(int year) {
		// 渡された年の1月1日を表すLocalDateオブジェクトを生成
		LocalDate localDate = LocalDate.of(year, 1, 1);
		// APIでうるう年かの判定
		return localDate.isLeapYear();
	}
}
