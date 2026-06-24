package com.zeus.domain;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTest {

	@Test
	public void test1() {
		//Board board = new Board();
		//board.setBoardNo(10);
		//board.setTitle("pmj");
		Board board = Board.builder().boardNo(1)
				.content("pmj").writer("pmj")
				.COUNT(10).regDate(new Date()).title("pmj").build();
		System.out.printf("%d  %s  \n",board.getBoardNo(), board.getTitle());
	}

	//@Test
	public void test2() {
		//Board board = new Board();
		//System.out.printf(" %s  \n",board);
	}
}
