package BinarySearch;

import java.awt.print.Book;

public class BookAllocation {
//    Problem Statement: Given an array ‘arr of integer numbers, ‘ar[i]’ represents
//    the number of pages in the ‘i-th’ book. There are a ‘m’ number of students, and
//    the task is to allocate all the books to the students.
//    Allocate books in such a way that:
//
//    Each student gets at least one book.
//    Each book should be allocated to only one student.
//    Book allocation should be in a contiguous manner.
//    You have to allocate the book to ‘m’ students such that the maximum number of pages
//    assigned to a student is minimum. If the allocation of books is not possible. return -1

    public int getMinPages(int[] pages, int m){
        if(pages.length < m){
            return -1;
        }

        int start =Integer.MIN_VALUE;
        int end = 0;
        for(int book : pages){
            start = Math.max(start, book);
            end +=book;
        }
        if(pages.length == m){
            return start;
        }
        System.out.println("start " + start + " and end "+ end);
        int ans = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end-start)/2;

            int no_of_std = calStudents(pages, mid);

            if(no_of_std == m){
                ans = Math.min(ans, mid);
                start = mid+1;
            }
            else if(no_of_std > m){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return ans;
    }

    public  int calStudents(int[] pages, int maxPage){
        int stu = 1;
        int pagesStudent = 0;

        for(int num : pages){
            if(pagesStudent+num >  maxPage){
                System.out.println("curent pages " + pagesStudent);
                stu++;
                pagesStudent = num;
            }else{
                pagesStudent += num;
            }
        }

        System.out.println("for " + maxPage + " we can have " + stu);
        return stu;
    }

}
