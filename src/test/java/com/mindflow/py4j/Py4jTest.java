package com.mindflow.py4j;

import com.mindflow.py4j.exception.IllegalPinyinException2;
import org.junit.*;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class Py4jTest {
	private PinyinConverter py4j;

	@Before
	public void init(){
		py4j = new PinyinConverter();
	}

	@Test
	public void testChinesePy() throws IllegalPinyinException2 {

		final String[] arr = {"肯德基", "重庆银行", "长沙银行", "便宜坊", "西藏", "藏宝图", "出差", "参加", "列车长"};
		
		for (String chinese : arr){
			String py = py4j.getPinyin(chinese);
			System.out.println(chinese+"\t"+py);
		}
	}
	
	@Test
	public void testCharPy() throws IllegalPinyinException2 {

		char[] chs = {'长', '行', '藏', '度', '阿', '佛', '2', 'A', 'a'};
		for(char ch : chs){
			String[] arr_py = py4j.getPinyin(ch);
			System.out.println(ch+"\t"+Arrays.toString(arr_py));
		}
	}

	@After
	public void destroy(){
		py4j = null;
	}
}
