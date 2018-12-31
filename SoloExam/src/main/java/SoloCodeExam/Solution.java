package SoloCodeExam;

public class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int peopleHeight=0;
        for(int i = 0; i<people.length;i++){
            for(int j = 0; j<i;j++){
                if(i!=j){
                    peopleHeight = people[i]+people[j];
                    if(peopleHeight<=limit)
                    {
                        answer++;
                    }else{
                        answer+=2;
                    }

                }
            }
        }
        return answer/2;
    }
}
