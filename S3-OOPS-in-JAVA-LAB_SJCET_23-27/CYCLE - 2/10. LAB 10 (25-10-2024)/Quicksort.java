package oopj24csb45;
import java.util.*;

public class Quicksort {
 String a[];

 void quicksort(String names[], int low, int high) {
  a = names;
  if(low < high) {
   int j = partition(a, low, high);
   quicksort(a, low, j - 1);
   quicksort(a, j + 1, high);
  }
 }

 int partition(String[] name, int low, int high) {
  String pivot = name[low];
  int i = low + 1; 
  int j = high;

  while(i <= j) {
   while(i <= high && name[i].compareTo(pivot) <= 0) {    
    i++;
   }
   while(name[j].compareTo(pivot) > 0) {
    j--;
   }
   if(i < j) {
    String temp = name[i];
    name[i] = name[j];
    name[j] = temp;
   }
  }

  name[low] = name[j];
  name[j] = pivot;
  return j;
 }

 void printSort(String[] a, int n) {
  for(int i = 0; i < n; i++) {
   System.out.println(a[i]);
  }
 }

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of names: ");
  int n = sc.nextInt();
  String names[] = new String[n];
  for(int i = 0; i < n; i++) {
   System.out.println("Enter the name of person " + (i + 1) + ": ");
   names[i] = sc.next();
  }
  Quicksort q = new Quicksort();
  q.quicksort(names, 0, n - 1);
  System.out.println("The list of names after sorting is: ");
  q.printSort(names, n);
 }
}