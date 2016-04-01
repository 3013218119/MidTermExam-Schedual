import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class ScheduleTest {

	Schedule sch=null;
	List<Work> works=null;
	@Before
	public void setUp() throws Exception {
		sch=new Schedule();
		works = new ArrayList<Work>();
	}

	@Test
	public void testFCFS() {
		works.add(new Work("1",0,10));
		works.add(new Work("2",5,5));
		works.add(new Work("3",10,2));
		works.add(new Work("4",11,1));
		List<Double> ans = new ArrayList<Double>();
		ans.add((double) 8.5);
		ans.add((double) 3.375);
		assertEquals(ans,sch.FCFS(works));
	}

	@Test
	public void testSJF() {
		works.add(new Work("1",0,10));
		works.add(new Work("2",5,5));
		works.add(new Work("3",10,2));
		works.add(new Work("4",11,1));
		List<Double> ans = new ArrayList<Double>();
		ans.add((double) 6.75);
		ans.add((double) 1.65);
		assertEquals(ans,sch.SJF(works));
	}

	@Test
	public void test() {
		works.add(new Work("1",0,10));
		assertEquals(0,works.get(0).getPriority());
	}
	
	@Test
	public void testSJF2() {
		works.add(new Work("1",1,10));
		works.add(new Work("2",4,8));
		works.add(new Work("3",7,11));
		List<Double> ans = new ArrayList<Double>();
		//System.out.println(sch.SJF(works).get(0));
		//System.out.println(sch.SJF(works).get(1));
		ans.add((double) 16);
		ans.add((double) 1.6553030303030303);
		assertEquals(ans,sch.SJF(works));
	}
}
