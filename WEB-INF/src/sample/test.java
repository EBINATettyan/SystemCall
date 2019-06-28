package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class test {
	public ArrayList<Integer> callPy(int number1, int number2) throws IOException {

		try {

			ProcessBuilder pb = new ProcessBuilder("python",
					"/Applications/Eclipse_4.8.0.app/Contents/workspace/SystemCall/WEB-INF/src/sample/test.py",
					"" + number1, "" + number2);
			Process p = pb.start();

			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String result = new String(in.readLine());

			//今回実行の結果、（42, 22）のような形で変えてくることが判明
			//まずは、(と)、さらに全角半角の空白を消去
			result = result.replace("(", "");
			result = result.replace(")", "");
			result = result.replace("　", "");
			result = result.replace(" ", "");

			//次に、,の左側と右側を別々の変数に格納
			int index = result.indexOf(",");
			int result1 = Integer.parseInt(result.substring(0, index));
			int result2 = Integer.parseInt(result.substring(index + 1));

			ArrayList<Integer> resultList = new ArrayList<Integer>();
			resultList.add(result1);
			resultList.add(result2);

			return resultList;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}