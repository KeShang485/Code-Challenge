/**Description
*Given a string s which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
**/

//method1:stack
//Time:O(n)
public class Solution {
    /**
     * @param s: a string
     * @return: return a string
     */
    Stack<Integer> S = new Stack();
    boolean vis[] = new boolean[26];
    int num[] = new int[26];
    
    public String removeDuplicateLetters(String s) {
        // write your code here
        for(int i = 0; i < s.length(); ++i) {
    		num[s.charAt(i) - 'a']++;
    	}
    	for(int i = 0; i < s.length(); ++i) {
    		int id = s.charAt(i) - 'a';
    		num[id]--;
    		if(vis[id])continue;
    		while(!S.isEmpty() && S.peek() > id && num[S.peek()] > 0) {
    			vis[S.peek()] = false;
    			S.pop();
    		}
    		S.push(id);
    		vis[id] = true;
    	}
    	String ans = "";
    	for(int x: S) {
    		ans += (char)('a' + x);
    	}
    	return ans;
    }
}

//method2:hashSet/hashMap
//time:O(nlogn)
public class Solution {
    /**
     * @param s: a string
     * @return: return a string
     */
    public String removeDuplicateLetters(String s) {
        // write your code here
        if(s == null || e.size() == 0){
            return "";
        }
        char[] resTem = s.toCharArray();
        Map<Character,Integer> hash = new HashMap<Character,Integer>();
        for (int i : resTem ) {
            if (!hash.containsKey(i)){
                hash.set(i,1);
            }else {
                hash.set(i,hash.getValue(i) + 1);
            }
       }
       return  new Arrays.toCharArray(res);
    }
}
