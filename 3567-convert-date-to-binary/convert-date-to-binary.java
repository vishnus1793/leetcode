class Solution {
    public String convertDateToBinary(String date) {
        String y = date.substring(0,4);
        String m = date.substring(5,7);
        String d = date.substring(8,10);
        StringBuilder s = new StringBuilder();
        s.append(Integer.toBinaryString(Integer.parseInt(y)));
        s.append("-");
        s.append(Integer.toBinaryString(Integer.parseInt(m)));
        s.append("-");
        s.append(Integer.toBinaryString(Integer.parseInt(d)));
        return s.toString();
    }
}