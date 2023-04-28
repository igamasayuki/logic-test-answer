package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 問題6.
 * 
 * <pre>
 * 3つの異なる数字[3,5,9]の組み合わせでできる３桁の数字を、全て出力するプログラムを作成してください。
 * （3桁の数字はプログラムで算出してください。単に3つの数字の組み合わせを自分の頭で考えて、
 * それをSystem.out.println()するのはNGです。）
 *   359
 *   395
 *   539
 *   593
 *   935
 *   953
 * </pre>
 * 
 * @author igamasayuki
 *
 */
public class Question6 {
	public static void main(String[] args) {
		final int MAX_NUM = 3;
		
		// 0〜9までの数値をListに格納
		List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < 10 ; i++) {
            list.add(i);
        }
        // シャッフルして、順番をランダムに並び替える
        Collections.shuffle(list);
        // 最初の３つの数字を配列に入れる
        int numbers[] = new int[MAX_NUM];
        for(int i = 0 ; i < MAX_NUM ; i++) {
        		numbers[i] = list.get(i);
        }

		for (int k = 0; k < numbers.length; k++) {
			for (int j = 0; j < numbers.length; j++) {
				for (int i = 0; i < numbers.length; i++) {
					if (k == j || k == i || j == i) {
						// 重複は表示なし
					} else {
						System.out.println(numbers[k] + "" + numbers[j] + ""
								+ numbers[i]);
					}
				}
			}
		}
	}
}
