package ch04.ex01;

import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		mapper.selectUsers().forEach(System.out::println);
	}
}
/*
1 john 2022-07-22 [사랑 너와 나의 연결고리, 정의 너와 나의 연대고리]
2 terry 2022-07-23 [김치 네가 있어야 밥을 먹지., 비빔밥 동학농민항쟁이 만든 음식이다., 찹쌀떡 네가 그리워.]
*/