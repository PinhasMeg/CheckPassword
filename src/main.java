public class main {


    public static void main(String[] args) {
        String t= "id,name,age,act.,room,dep.\n1,Jack,68,T,13,8\n17,Betty,28,F,15,7";
        String C= "age";
        solution n=new solution();
        Solution2 s=new Solution2();
        boolean ss=s.solution("aaa");
        System.out.println(ss);
        int a=n.solution(t,C);

//        System.out.println(a);




    }
}
