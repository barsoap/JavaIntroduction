package chapter2;

public class chapter2_ {

	public static void main(String[] args) {
		// p88 命令実行文
		String name = "すがわら";
		String message;
		message = name + "さん、こんにちは";
		System.out.println(message);
		
		// p89
		/* 引数・パラメータ */
		
		// p90
		//改行せずに画面に文字を表示する
		// System.out.print() ← System.out.println();との違いは？？
		
		
		// p91
		// 2つの値を比較して大きい方の数値を代入する
		// int m = Math.max(0, 0)
		int a = 5;
		int b = 3;
		int m = Math.max(a,b);
		System.out.println("比較実験：" + a + "と" + b + "とで大きい方は・・・" + m);
		
		// p92
		// 文字列を整数に変換する
		// int n = Integer.parseInt(①);
		String  age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、" + (n+1) + "歳になりますね。");
		
		// p93
		// 乱数を発生させる
		// int r = new java.util.Random().nextInt(①);
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
		
		// p94
		// キーボードから1行の文字列の入力を受け付ける
		// String s = new java.util.Scanner(System.in).nextLine(); nextLineは文字列
		
		// キーボードから1つの整数の入力を受け付ける
		// int input = new java.util.Scanner(System.in).nextInt(); nextIntは数値
		System.out.println("あなたの名前を入力してください。");
		String name2 = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age2 = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ" + age2 + "歳の" + name2 + "さん");
		
		// p97
		// 練習2-1
		int x = 5;
		int y = 10;
		String ans = "x+yは" + (x+y);
		System.out.println(ans);
		
		//練習2-2
		//①②➃⑤　⑦?
		//②➃⑤⑦
		
		//練習2-3
		//①
		System.out.println("ようこそ占いの館へ");
		
		//②
		System.out.print("あなたの名前を入力してください＞");
		
		//③
		String name3 = new java.util.Scanner(System.in).nextLine();
		
		//➃
		System.out.print("あなたの年齢を入力してください＞");
		
		//⑤
		String ageString = new java.util.Scanner(System.in).nextLine();
		
		//⑥ 変数ageStringの内容をint型に変換し、int型の変数ageに代入します。
		// int age3 = ageString;
		int age3 = Integer.parseInt(ageString);
		
		//⑦ 0から3までの乱数を生成し、int型の変数fortuneに代入します。
		// int fortune = new java.util.Random().nextInt(3);
		int fortune = new java.util.Random().nextInt(4);
		
		//⑧ fortuneの数値をインクリメント演算子で1増やし、1から4の乱数にします。
		//fortune += 1;
		fortune++;
		//int fortune = new java.util.Random().nextInt(fortune);
		
		//⑨
		System.out.println("占いの結果が出ました！");
		
		//⑩
		System.out.println(age3 + "歳の" + name3 + "さん、あなたの運気番号は" + fortune + "です。");
		
		//⑪
		System.out.println("(1:大吉 2:中吉 3:吉 4:凶)");
	}

}
