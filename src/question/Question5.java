package question;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 問題5.
 * 
 * <pre>
 * 以下の配列から、最も出現回数の多いスポーツとその出現回数を出力するプログラムを作成してください。
 * （最も出現回数の多いスポーツとその出現回数はプログラムで算出してください。
 * 自分の頭で考えて、それをSystem.out.println()するのはNGです。）
 * 
 * {"soccer","baseball","jogging","jogging","soccer","surfing","surfing",
 *  "soccer","surfing","baseball","boxing","surfing","soccer","surfing",
 *  "jogging","boxing","jogging","baseball","soccer","soccer"}
 * </pre>
 * 
 * @author igamasayuki
 *
 */
public class Question5 {

	public static void main(String[] args) {
		String[] sports = { "soccer", "baseball", "jogging", "jogging",
				"soccer", "surfing", "surfing", "soccer", "surfing",
				"baseball", "boxing", "surfing", "soccer", "surfing",
				"jogging", "boxing", "jogging", "baseball", "soccer", "soccer" };

		Map<String,Integer> map = new HashMap<>();
		for(String sport : sports) {
			Integer count = map.get(sport);
			if(count == null) {
				count = 1;
			} else {
				count++;
			}
			map.put(sport, count);
		}
		
		Set<String> set = map.keySet();
		int maxCount = 0;
		String maxKey = null;
		for(String key : set) {
			int count = map.get(key);
			if (maxCount < count) {
				maxCount = count;
				maxKey = key;
			}
//			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("最も出現回数の多いスポーツは" + maxKey + "で、出現回数は" + maxCount + "回です");
	}

}
