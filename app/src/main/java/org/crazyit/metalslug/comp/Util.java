package org.crazyit.metalslug.comp;

import java.util.Random;

public class Util
{
	public static Random random = new Random();
	// 返回一个0～range的随机数；因为不论是什么怪物他的x坐标都是随机计算的所以这里要用到随机数生成
	public static int rand(int range)
	{
		// 如果range为0，直接返回0
		if (range == 0)
			return 0;
		// 获取一个0～range之间的随机数
		return Math.abs(random.nextInt() % range);
	}
}
