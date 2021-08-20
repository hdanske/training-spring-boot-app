package com.hdanske.trainingspringbootapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@SpringBootTest
class TrainingSpringBootAppApplicationTests {

	@Test
	void contextLoads() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.addAll(Arrays.asList(new Integer[]{2,5,6,7,8,9}));
		Optional<Integer> min = numbers.stream().min(Integer::compare);
		min.ifPresentOrElse(a->System.out.println(a), ()-> System.out.println("Hello team!"));
	}

}
