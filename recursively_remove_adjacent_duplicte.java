class Solution {
    public String removeUtil(String s) {
       int n = s.length();
       int i = 0;
       StringBuilder ans = new StringBuilder();  // ✅ Use StringBuilder
       return remove(s, ans, i, n);
   }

   private String remove(String st, StringBuilder ans, int i, int n) {
       if (i == n) {
           return ans.toString();  // ✅ Convert StringBuilder to String
       }

       // ✅ Handle first character
       if (i == 0 && n > 1 && st.charAt(i) != st.charAt(i + 1)) {
           ans.append(st.charAt(i));
       }

       // ✅ Handle last character
       else if (i == n - 1 && n > 1 && st.charAt(i) != st.charAt(i - 1)) {
           ans.append(st.charAt(i));
       }

       // ✅ Handle middle characters
       else if (i > 0 && i < n - 1 && st.charAt(i) != st.charAt(i - 1) && st.charAt(i) != st.charAt(i + 1)) {
           ans.append(st.charAt(i));
       }

       return remove(st, ans, i + 1, n);  // ✅ Fix i++ issue
   }
}

//https://www.geeksforgeeks.org/problems/recursively-remove-all-adjacent-duplicates0744/1?page=1&category=Recursion&sortBy=submissions