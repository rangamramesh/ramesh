package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayListExampleTest.class, BalancingExpressionTest.class, ListReverseTest.class, QueueTest.class,
		StackTest.class })
public class AllTests {

}
