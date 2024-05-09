package question;

/**
 * 問題4.
 *
 * <pre>
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
 */
public class Question4_1 {
    public static void main(String[] args) {
        int seireki = 2000;
        System.out.print(seireki + "年は");
        if (isLeapYear(seireki)) {
            System.out.println("うるう年です。");
        } else {
            System.out.println("うるう年ではありません。");
        }
    }

    /**
     * うるう年かどうかを判定します.
     *
     * @param year 西暦の年
     * @return うるう年：true 平年：false
     */
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = true;
        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else if (year % 4 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        return isLeapYear;
    }
}
