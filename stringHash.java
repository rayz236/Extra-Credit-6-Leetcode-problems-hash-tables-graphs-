class Solution {
    public String stringHash(String s, int k) {
        if(k<1 || k>100 || k>s.length() || s.length()>1000){
            throw new RuntimeException();
        }
        if(s.length() % k != 0){
            throw new RuntimeException();
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i = i + k){
            String sub = s.substring(i, i + k);
            int sum = 0;
            for (int j = 0; j < sub.length(); j++){
                char c = sub.charAt(j);
                int val = c - 'a';
                sum += val;
            }
            sum = sum % 26;
            result.append((char)(sum + 'a'));
        }
        return result.toString();
    }
}
void main() {
}