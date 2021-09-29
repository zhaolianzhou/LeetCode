package top2001_2100;

public class partitioningIntoMinimumNumber_1689 {
    public int minPartitions(String n) {
        char re = '0';
        for (int i = 0; i < n.length(); i++){
            if (n.charAt(i) > re)
                re = n.charAt(i);
        }

        return (int)re-(int)'0';
    }
}
