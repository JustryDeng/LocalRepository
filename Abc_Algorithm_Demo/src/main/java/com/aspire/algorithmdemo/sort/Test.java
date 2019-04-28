package com.aspire.algorithmdemo.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试
 *
 * @author JustryDeng
 * @date 2019/4/25 21:59
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(16);
        list.add(5345);
        list.add(24);
        list.add(1243);
        list.add(345);
        list.add(5463456);
        list.add(3434);
        list.add(123454);
        list.add(23);
        list.add(2345);
        list.add(24534);
        System.out.println("原集合：" + list);
        System.out.println("升序：" + Bubble.sort(list, true));
        System.out.println("降序：" + Bubble.sort(list, false));
    }
}
