package com.spring.chapter3;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class PatternResolverTest {

	public static void main(String[] args)throws Throwable {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource resources[] = resolver.getResources("classpath*:*.xml");
		for(Resource resource : resources){
			System.out.println(resource.getDescription());
		}
	}

}
