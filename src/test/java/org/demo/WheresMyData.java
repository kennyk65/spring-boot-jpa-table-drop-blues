package org.demo;

import static org.junit.Assert.*;

import org.demo.domain.Category;
import org.demo.repository.CategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Config.class)
public class WheresMyData {

	@Autowired CategoryRepository repository;

	@Test
	public void test() {
		Iterable<Category> iter = repository.findAll();
		assertNotNull(iter);
        assertTrue(iter.iterator().hasNext());
	}

}
