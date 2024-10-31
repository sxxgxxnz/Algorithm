//package s:w coding_2018;

public class Solution2_3 {
    // 스킬 트리
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill,skill_trees));
    }

    public static int solution(String skill, String[] skill_trees){
        int answer = 0;
        
        for(int i=0;i<skill_trees.length;i++){
            // skill 문자를 제외한 문자 치환
            String str = skill_trees[i].replaceAll("[^" + skill + "]", "");
           // boolean flag = false;
            for(int j=0;j<skill.length() + 1;j++){
                // skill을 한 글자씩 다른 다음
                String sub_skill = skill.substring(0,j);
                // 가능한 스킬 트리인지 확인
                if(str.equals(sub_skill)){
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
