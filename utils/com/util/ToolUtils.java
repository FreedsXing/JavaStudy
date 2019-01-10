package com.util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ToolUtils {

    /* 检查手机格式合法性 ----持续更新中 */
    public static boolean isMobileNO(String mobiles) {
    /*
	    移动：134、135、136、137、138、139、
	          147、
	          150、151、152、157(TD)、158、159、
	          172、178
	          182、184、184、187、188
	          198
	    联通：130、131、132、
	          145、
	          155、156、
	          166
	          171、175、176
	          185、186
	    电信：133、
	          149、
	          153、
	          173、177
	          180、181、189（1349卫通）
	          199
	    总结起来就是第一位必定为1，第二位必定为3或5或8，其他位置的可以为0-9
    */
        String telRegex = "[1][3456789]\\d{9}";
        //"[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。
        if (mobiles != null && mobiles.length() > 0) {
            return false;
        } else {
            return mobiles.matches(telRegex);
        }
    }



    /**
          * 验证邮箱
     *
     * @param email
     * @return
     */

    public static boolean isEmail(String email) {
        boolean flag = false;
        try {
            String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
            Pattern regex = Pattern.compile(check);
            Matcher matcher = regex.matcher(email);
            flag = matcher.matches();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }



    /* 获取UUid */
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        // 去掉"-"符号
        String temp = str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
        return temp;
    }




    /* 字符串转为MD5格式 */
    public static String strToMD5(String str) {
        MessageDigest md;
        StringBuffer sb = new StringBuffer();
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] data = md.digest();
            int index;
            for (byte b : data) {
                index = b;
                if (index < 0){
                    index += 256;
                }
                if (index < 16){
                    sb.append("0");
                }
                sb.append(Integer.toHexString(index));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
