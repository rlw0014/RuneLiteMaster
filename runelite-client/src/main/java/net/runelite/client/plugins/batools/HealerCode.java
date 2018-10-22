package net.runelite.client.plugins.batools;

import lombok.Getter;


enum HealerCode
{

	WAVEONE(new int[] {1,1}, new int[] {0,0}, new int[] {0,0}),
	WAVETWO(new int[] {1,1,2}, new int[] {0,0,0}, new int[] {0,0,0}),
	WAVETHREE(new int[] {1,6,2}, new int[] {0,0,0}, new int[] {0,0,0}),
	WAVEFOUR(new int[] {1,4,3,0}, new int[] {0,0,0,7}, new int[] {0,0,0,0}),
	WAVEFIVE(new int[] {1,3,2,2,0}, new int[] {0,0,0,0,7}, new int[] {0,18,0,27,0}),
	WAVESIX(new int[] {2,3,2,2,0,0}, new int[] {0,0,0,0,6,8}, new int[] {18,18,21,27,54,0}),
	WAVESEVEN(new int[] {5,2,1,1,0,0,0}, new int[] {0,0,0,0,6,8,10}, new int[] {27,33,0,0,51,0,0}),
	WAVEEIGHT(new int[] {4,2,2,1,0,0,0}, new int[] {0,1,1,1,4,3,10}, new int[] {0,0,27,0,48,48,0}),
	WAVENINE(new int[] {2,5,1,1,0,0,0,0}, new int[] {1,2,1,1,2,1,1,10}, new int[] {0,0,0,0,0,0,0,0,0}),
	WAVETEN(new int[] {5,2,1,1,0,0,0}, new int[] {0,1,1,1,3,3,10}, new int[] {27,33,0,0,51,0,0});


	@Getter
	private final int[] firstCallFood;
	@Getter
	private final int[] secondCallFood;
	@Getter
	private final int[] spacing;

	HealerCode(int[] firstCallFood, int[] secondCallFood, int[] spacing)
	{
		this.firstCallFood = firstCallFood;
		this.secondCallFood = secondCallFood;
		this.spacing = spacing;
	}
}
