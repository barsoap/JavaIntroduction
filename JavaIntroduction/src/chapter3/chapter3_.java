package chapter3;

public class chapter3_ {

	public static void main(String[] args) {
		//p100 if文
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("映画を見ます");
		}
		
		//p103 while文
//		boolean doorClose = true;
//		while(doorClose == true) {
//			System.out.println("ノックする");
//			System.out.println("1分待つ");
//		}
		
		//p105 制御構文　条件式　ブロック
		
		//p106ブロックとは、複数の文をひとまとまりにして扱うためのものです。
		//波カッコの省略・・・ブロックの内容が1文しかなければ、波カッコを省略できる ←推奨されない！
		boolean tenki2 = false;
		if(tenki2 == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		} else
			System.out.println("映画を見ます");
		

		//p107 ブロック内で宣言した変数の寿命
		// ブロック内で宣言した変数は、そのブロックが終わると同時に消滅します。
		// このような、変数が利用可能な場所の範囲をスコープ(scope)といいます。
		
		//p108 条件式の書き方
		
		
	}

}
