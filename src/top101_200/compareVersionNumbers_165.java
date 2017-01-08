package top101_200;
/**
 * No 165
 * Description:
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 * Here is an example of version numbers ordering:
 * 0.1 < 1.1 < 1.2 < 13.37
 * @author Zhaolian
 *
 */
public class compareVersionNumbers_165 {
	public static int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        int i = 0;
        for(; i < ver1.length&&i<ver2.length;i++){
        	if(Integer.parseInt(ver1[i]) < Integer.parseInt(ver2[i]))
        		return -1;
        	else if(Integer.parseInt(ver1[i])>Integer.parseInt(ver2[i]))
        		return 1;
        }
        if(ver1.length>ver2.length){
        	for(;i < ver1.length;i++)
        		if(Integer.parseInt(ver1[i])!=0)
        			return 1;
        	return 0;
        }
        else if(ver1.length<ver2.length){
        	for(;i < ver2.length;i++)
        		if(Integer.parseInt(ver2[i])!=0)
        			return -1;
        	return 0;
        }
        else
        	return 0;
    }
	
	public static void main(String[] args){
		compareVersion("1","0");
	}
}
