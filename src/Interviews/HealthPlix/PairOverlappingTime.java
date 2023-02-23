/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
and return an array of the non-overlapping intervals that cover all the intervals in the input.

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output -> [[1,6],[8,10],[15,18]]

 */

package Interviews.HealthPlix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Comp implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {
        return p1.first - p2.first;
    }
}

public class PairOverlappingTime {
    public static void main(String[] args) {

        ArrayList<Pair> timeFrame = new ArrayList<>();
        timeFrame.add(new Pair(1,3));
        timeFrame.add(new Pair(8,10));
        timeFrame.add(new Pair(15,18));
        timeFrame.add(new Pair(2,6));

        Collections.sort(timeFrame, new Comp());

        int first = timeFrame.get(0).first;
        int second = timeFrame.get(0).second;

        for(int i=1;i<timeFrame.size();i++) {
            if(second > timeFrame.get(i).first) {
                second = timeFrame.get(i).second;
            } else {
                System.out.println(first + " " + second);
                first = timeFrame.get(i).first;
                second = timeFrame.get(i).second;
            }
        }
        System.out.println(first + " " + second);
    }
}
