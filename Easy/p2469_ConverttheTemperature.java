// LeetCode 2469: Convert the Temperature
// Difficulty: Easy
// Link: https://leetcode.com/problems/convert-the-temperature/

class p2469_ConverttheTemperature{
class Solution {
    public double[] convertTemperature(double celsius) {
        double Kelvin=celsius + 273.15;
        double Farenheit=(celsius * 1.80) + 32.00;
        double[] temp=new double[2];
        temp[0]=Kelvin;
        temp[1]=Farenheit;
        return temp;

    }
}
}