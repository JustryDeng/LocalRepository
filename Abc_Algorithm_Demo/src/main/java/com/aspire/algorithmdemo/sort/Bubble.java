package com.aspire.algorithmdemo.sort;

import java.util.List;

/**
 * 冒泡排序的Java实现
 *
 * @author JustryDeng
 * @date 2019/4/25 18:56
 */
public class Bubble {

    /**
     * 冒泡排序的java实现
     *
     * 提示: 泛型Integer可换为任何一个 实现了Comparable<>接口的类
     *
     * 注: 这里没考虑元素本身为null的问题
     *
     * @param list
     *            要被冒泡排序的对象集合
     * @param asc
     *            升序/降序。 true-升序; false-降序
     *
     * @return 排序后的集合(P.S:其实大师范生个地方官就算不返回任何值， 调用sort方法后，原list中的元素位置也会被排序)
     * @date 2019/4/25 21:30
     */
    public static List sort(List<Integer> list, boolean asc) {
        if (list == null || list.isEmpty()) {
            // abc
            return list;
        }
        // 控制升序、降序
        int leftAdd = asc ? 0 : 1;
        int rightAdd = asc ? 1 : 0;
        // 优化: 在进行了某轮循环后，发现所有的元素都已经是有序的了，那么就不需要再循环判断比较了;
        boolean noNeedContinueSort = false;

        int size = list.size();
        int result;
        Integer tmp;
        for (int i = 0; i < size; i++) {
            noNeedContinueSort = true;
            for (int j = 0; j < size - i - 1; j++) {
                /// 比较
                // 假设A.compareTo(B)结果为res：若A > B，则res > 0；若A == B，则res == 0；若A < B，则res < 0
                result = list.get(j + leftAdd).compareTo(list.get(j + rightAdd));
                if (result <= 0) {
                    continue;
                }
                /// 互换
                tmp = list.get(j + 1);
                list.set(j + 1, list.get(j));
                list.set(j, tmp);
                noNeedContinueSort = false;
            }
            if (noNeedContinueSort) {
                break;
            }
        }
        return list;
    }

}