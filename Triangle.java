import java.util.Arrays;
public class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);
        boolean isTriangle = false;
        for(int i=0;i<A.length-2;i++){
            double a=A[i]+A[i+1];
            int b=A[i+2];
            if(a>b){
                isTriangle=true;
                break;
            }
            else{
                isTriangle=false;
            }
        }
        if(isTriangle){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Triangle triangle = new Triangle();
        System.out.println(triangle.solution(new int[]{5,4,3,10}));
    }
}
