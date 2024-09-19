public class Ex17 {
    // Write a program to tell the frequency of repetition of the words

    public static void main(String[] args) {
        String str="I love my Country my Country is India.";
        String[] ans=Ex15.stringToArray(str);
        int visited=-1;
        int[] frequency=new int[ans.length];

        for (int i = 0; i < ans.length; i++) {
            int count=1;
            for (int j = i+1; j < ans.length; j++) {
                if (ans[i].equals(ans[j])){
                    count++;
                    frequency[j]=visited;

                }

            }
            if (frequency[i]!=visited){
                frequency[i]=count;

            }
        }
        for (int i = 0; i < ans.length; i++) {
            if (frequency[i]!=visited){
                System.out.println("The word '"+ans[i]+"' Occurs "+ frequency[i]);
            }
        }

    }
}
