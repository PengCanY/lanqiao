package other.two;

public class Two {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.decodeString("3[a]2[bc]");
        System.out.println(s);
    }
}


class Solution {
    String s;
    int n;
    int l =0;
    public String decodeString(String s) {
        n = s.length();
        this.s = s;
        return dfs();
    }
    String dfs(){
        StringBuilder res = new StringBuilder();
        int num  =0 ;
        while(l < n){
            char now = s.charAt(l);
            l++;
            if(now>='0'&&now<='9'){
                num *=10;
                num += (int)(now-'0');
            }else if(now == '['){
                String tp = dfs();
                while(num-->0){
                    res.append(tp);
                }
                num = 0;
            }else if(now==']'){//处理一层后直接返回
                return res.toString();
            }else{
                res.append(now);
            }

        }
        return res.toString();

    }
}
