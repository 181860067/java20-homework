/*
 * @Author: zb-nju
 * @Date: 2020-11-05 14:04:46
 * @LastEditors: zb-nju
 * @LastEditTime: 2020-11-05 14:24:27
 */
package hw8;
import java.util.Comparator;
import java.util.Random;

public class RandomCmp<T extends Comparable<T>> implements Comparator<T>{
    @Override
    public int compare(T a,T b){
        Random random = new Random();
        return random.nextInt();
    }
}