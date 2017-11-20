package exercise_chapter12;

public class printException {
    public static void main(String[] args){
        try{
            System.out.println(sum(new int[] {1,2,3,4,5}));
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex.toString());
            StackTraceElement[] traceElements = ex.getStackTrace();
            for(int i = 0; i < traceElements.length; i++){
                System.out.println("method " + traceElements[i].getMethodName());
                System.out.print("(" + traceElements[i].getClassName());
                System.out.println(traceElements[i].getLineNumber() +")");
            }
        }
    }

    public static int sum(int[] list){
        int result = 0;
        for(int i = 0; i <= list.length; i++){
            result += list[i];
        }
        return  result;
    }


}
