
class Rgen{
    public static int finalValue(String[] str)
    {
        int X=0;
        for(String str1:str){
            if(str1.contains("+"))
            {
                ++X;
            }
            else if(str1.contains("-"))
            {
                --X;
            }
        }
        return X;
    }
    public static void main(String[] args){
        String[] ops = {"X++","++X","--X","X--"};
        int result = finalValue(ops);
        System.out.println(result);
    }
}