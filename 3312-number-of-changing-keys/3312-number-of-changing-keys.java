class Solution {
    public int countKeyChanges(String s) {
        if(s.length()==1) return 0;

        int changes=0;
char Pkey=Character.toLowerCase(s.charAt(0));

for(int i=1;i<s.length();i++){
    char Ckey = Character.toLowerCase(s.charAt(i));
            if (Ckey != Pkey) {
                changes++;
                Pkey = Ckey;
            }
}
return changes;
    }
}