package com.mellowvit.nutrihell.food;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NutriHellFoodApplicationTest {

	@Test
	@DisplayName("main class test")
	void contextLoads() {
		assertEquals(2, 1+1);
	}

}
