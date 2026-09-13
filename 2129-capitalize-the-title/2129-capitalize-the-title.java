class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb=new StringBuilder("");

        title=title.toLowerCase();

        int start=0;

        for(int i=0;i<=title.length();i++){
            if( i==title.length()|| title.charAt(i)==' '){
                int len=i-start;
                if(len<=2){
                    for(int j=start;j<i;j++){
                sb.append(title.charAt(j));
                    }
                }
                else{
                 sb.append(Character.toUpperCase(title.charAt(start)));
                 for (int j = start + 1; j < i; j++) {
                        sb.append(title.charAt(j));
                    }
                }
                if (i < title.length()) {
                    sb.append(' ');
                }

                start = i + 1;
            }
        }
        return sb.toString();
    }
}