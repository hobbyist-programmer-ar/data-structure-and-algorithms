package org.hobbiesofar.List;
/**
 * https://leetcode.com/problems/merge-sorted-array
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Size = m, nums2Size = n;
        int finalArraySize = m + n - 1;
        while (nums2Size >= 0) {
            if(nums1Size < 0 || nums1[nums1Size] <= nums2[nums2Size]) {
                nums1[finalArraySize] = nums2[nums2Size];
                nums2Size--;
            } else {
                nums1[finalArraySize] = nums1[nums1Size];
                nums1Size--;
            }
            finalArraySize--;
        }
    }
}
