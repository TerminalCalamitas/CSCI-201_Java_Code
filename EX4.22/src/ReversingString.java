
public class ReversingString {

    public static void main(String[] args) {
	String str = "This is an example string";
	String backstr = "";
	// counts up to str length
	for(int i = 0; i < str.length(); i++) {
	    // appends new character from str to beginning of backstr
	    backstr = str.substring(i,i+1) + backstr;
	}
	System.out.println(backstr);
    }

}
