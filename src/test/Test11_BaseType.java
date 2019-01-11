package test;

import com.ToolUtils;

public class Test11_BaseType {
	
	/* 引用类型：class/interface/arrays
	 * 0.基本数据类型
	 * 		byte  short  int  long
	 * 		float double
	 * 		boolean
	 * 		char
	 * 1.表示范围
	 * 		1字节，8位， 256
	 * 		2字节，16位， 65536
	 * 		4字节，32位， 21亿
	 * 		8字节，64位，...超级大
	 * 2.字面量
	 * 		 int i=5; 5 叫直接量（或字面量），即 直接写出的常数。
	 * 		   整型是int，浮点型是double
	 * 3.默认值
	 * 		int  0
	 * 		浮点型  0.0
	 * 		boolean false
	 *	    char '\u0000';
	 *      String   null;
	 *	         引用类型的数据域 默认 null;
	 *      局部变量需要被初始化
	 * 4.char类型  //两个字节
	 * 		用单引号括起来的 1 个字符(可以是一个中文字符)，使用 Unicode 码代表字符，0~2^16-1（65535）
	 * 		char本质就是个数  char ch = 65;  ch = "A";
	 */	
	 //  	统一码Unicode
	 //		一个16比特位统一码占两个字节，同'\\u' 开头的4个16进制数表示；范围从‘\u0000’ 到 ‘\uFFFF’,  
	 //				案例：欢迎   \u6b22\u8fce
	 //		Ascii码：大多数计算机采用， 从 ‘\u0000’ 到 ‘\007F’ 128个
	 //		特殊字符的转义序列：
	 //		 	\b 回车	\t制表	\n换行	\f进纸	
	 //		 	\r 回车	\\反斜杠	\'单引号	\"双引号
	 //5.类型转换
	 //     char-->   
	 //     自动转换：byte-->short-->int-->long-->float-->double                  
	 //     强制转换：①会损失精度，产生误差，小数点以后的数字全部舍弃。
	 //             ②容易超过取值范围。
	 //引用：
	
	
	//unicode与utf-8
		//计算机只认识0/1，于是产生了 Assic码，128个字符
		//欧洲人的ISO编码，编码欧洲字符
		//中国人的GBK编码，编码几万个中文
		//统一：unicode编码，3个字节
		//统一：utf-8编码，可变字节  //此外还有utf-16，utf-32等
		//unicode：对应中文/发文/英文/拉丁文 ——————编号
		//utf-8：编号—————二进制可传输数据
	
	static int num;
	static boolean is;
	static double score;
	
	public static void main(String[] args) {
		byte age = 127;
		System.out.println("----age=" + ++age);
		System.out.println("------num=" + num + "----is=" + is + ", score=" + score);
		
		char c = '\u1234';
		System.out.println("-------a=" + c);
		int value = '\t';
		System.out.println("-------value=" + value);
		
		System.out.println(ToolUtils.stringToUnicode("ሴ"));
		System.out.println(ToolUtils.unicodeToString("\\u1234"));
	}

}
