class Solution {
    public boolean isPalindrome(String s) 
    {
        String p = s.trim().toLowerCase();
        p = p.replaceAll("\\s+", "");
        p = p.replaceAll("[^a-z0-9]", "");

        StringBuilder sb = new StringBuilder(p);
        sb = sb.reverse();

        String t = sb.toString();

        return p.equals(t);
    }
}