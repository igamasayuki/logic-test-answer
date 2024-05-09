package question;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 問題2. 
 * <pre>
 * (GregorianCalendarを使用した解答例)
 * コマンドライン引数から数値（時、分、秒）を受け取り、
 * その1秒後の時刻を表示するプログラムを作成してください。
 * 実行結果
 * 例）引数が15（時），4（分），59（秒）の場合
 * 「15時4分59秒の1秒後は15時5分0秒です」
 * 例）引数が23（時），59（分），59（秒）の場合
 * 「23時59分59秒の1秒後は0時0分0秒です」
 * </pre>
 * @author igamasayuki
 */
public class Question2_2 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("H時m分s秒");
		Calendar calendar = Calendar.getInstance();
		// 時間をセット
		int hourOfDay = 15;
		calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
		// 分をセット
		int minute = 4;
		calendar.set(Calendar.MINUTE, minute);
		// 秒をセット
		int second = 59;
		calendar.set(Calendar.SECOND, second);
		// 表示
		System.out.print(sdf.format(calendar.getTime()));
		System.out.print("の1秒後は");
		// 1秒進める
		calendar.add(Calendar.SECOND, 1);
		// 表示
		System.out.print(sdf.format(calendar.getTime()));
		System.out.print("です");
	}
}
