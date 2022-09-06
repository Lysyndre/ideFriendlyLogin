package Entry;

public class Clean {

    static void recursiveMethod(int num) {
        num--;
        if (num == 0)
            return;
        System.out.print(num + ",");
        recursiveMethod(num);
    }


    public static void main(String[] args){
        //int[] numbers = {35,65,95};
        //System.out.print(numbers.length + "," + numbers[1]);
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }

        //recursiveMethod(4);
    }


}
