package com;

public class BinaryDecimalUtil {

	/**
	 * 将10进制转化为二进制
	 * @param dec
	 * @return
	 */
	public static String DecimalToBinary(int dec) {
		String num  = "";
		while(dec > 0) {
			num = dec % 2 + num;
			dec = dec / 2;
		}
		return num;
	}
	
	
	
	  /**
     * 将二进制转换为10进制
     * @param bi
     * @return
     */
    public  static  Integer BiannaryToDecimal(int bi){

        String binStr = bi+"";

        Integer sum = 0;
        int len = binStr.length();

        for (int i=1;i<=len;i++){
            //第i位 的数字为：
            int dt = Integer.parseInt(binStr.substring(i-1,i));
            sum+=(int)Math.pow(2,len-i)*dt;
        }
        return  sum;
    }
}
