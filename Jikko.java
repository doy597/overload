// methodのoverload

class Jikko{
	static void Message(String a){	// overload＝多重定義
		System.out.println(a);
	}
	static void Message(String a,int b){
		System.out.println(a + "さんの年齢は" + b + "歳です");
	}
	public static void main(String args[]){

		Message("Hello Java!");	// methodを実行
		Message("Yamada",10);

	}
}