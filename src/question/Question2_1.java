package question;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 問題2. 
 * <pre>
 * (java.timeパッケージ関連のAPIを使用した解答例)
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
public class Question2_1 {
	public static void main(String[] args) {
		// 出力パターン設定(大文字のHは0〜23時間表記)
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H時m分s秒");
		// 時間を設定
		int hour = 15;
		// 分を設定
		int minute = 4;
		// 秒を設定
		int second = 59;
		// LocalTimeを生成
		LocalTime localTime = LocalTime.of(hour, minute, second);
		// 進める前表示
		System.out.print(localTime.format(formatter));
		System.out.print("の1秒後は");
		// 1秒進める
		localTime = localTime.plusSeconds(1);
		// 進めた後表示
		System.out.print(localTime.format(formatter));
		System.out.print("です");
	}
}
