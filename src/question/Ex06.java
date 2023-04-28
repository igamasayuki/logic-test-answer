package question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {

		int digits = 3; // 桁数
		List<Integer> nums = getNums(digits);

		System.out.println("ランダムに出た重複なしの" + digits + "つの数字");
		for (Integer num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("組み合わせ");

		List<Integer> dispNums = new ArrayList<Integer>();

		dispCombination(dispNums, nums); // 再帰処理を用いることで可変長の桁数に対応

	}

	public static List<Integer> getNums(int digits) {

		Random random = new Random();
		List<Integer> resultNum = new ArrayList<Integer>();

		for (int i = 0; i < digits; i++) {
			int randomNum = random.nextInt(10);
			if (!resultNum.contains(randomNum)) {
				resultNum.add(randomNum);
			} else {
				i--;
			}
		}

		return resultNum;
	}

	// dispNum : 表示用の配列
	// originNums : 使用する数字の配列
	public static void dispCombination(List<Integer> dispNums, List<Integer> originNums) {

		for (int i = 0; i < originNums.size(); i++) {

			if (originNums.size() == 1) { // originNumsの長さ１になったら表示する
				for (Integer dNum : dispNums) {
					System.out.print(dNum);
				}
				System.out.println(originNums.get(0));
				return;

			} else {

				dispNums.add(originNums.get(0)); // 最上位の数から決定していく
				originNums.remove(0); // 最上位に選ばれた数字をoriginNumsからremove

				dispCombination(dispNums, originNums); // 再帰処理 これを繰り返すことで最上位から決定して、originNumsの長さが減っていく
			}

			originNums.add(dispNums.get(dispNums.size() - 1)); // 帰ってきたらdispNumsにある最下位の数をoriginNumsの一番後ろに入れる
			dispNums.remove(dispNums.size() - 1); // originNumsの中の要素がロケット鉛筆方式でくるくる回るイメージ
		}
	}

}
