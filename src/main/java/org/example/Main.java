package org.example;

import Expert.Expert;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Expert.sumOfIntDigits(569999999978L);

		System.out.println(Arrays.toString(Expert.seperateString("Hello,this,should,be,an,array")));
		System.out.println(Expert.transformToRoman(77));
	}
}