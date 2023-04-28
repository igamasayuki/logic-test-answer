package question;

/**
 * 問題１.
 * 
 * <pre>
 * 繰り返し構文を使用して、掛け算の九九表を出力するプログラムを作成してください。
 * ※下記実行結果通りに出力してください。
 *   （計算結果が1桁の場合も2桁の場合も下1桁の位置は合わせてください。）
 *    1  2  3  4  5  6  7  8  9 
 *    2  4  6  8 10 12 14 16 18 
 *    3  6  9 12 15 18 21 24 27 
 *    4  8 12 16 20 24 28 32 36 
 *    5 10 15 20 25 30 35 40 45 
 *    6 12 18 24 30 36 42 48 54 
 *    7 14 21 28 35 42 49 56 63 
 *    8 16 24 32 40 48 56 64 72 
 *    9 18 27 36 45 54 63 72 81
 * </pre>
 * 
 * @author igamasayuki
 *
 */
public class Question1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int answer = i * j;
				if (answer < 10) {
					System.out.print(" "); // 1桁目の時は空白を入れる
				}
				System.out.print(answer + " "); // 答えと答えの間に空白を入れる
			}
			System.out.println();
		}
	}
}
