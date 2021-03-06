/*
 * Copyright (c) 2018, Devin French <https://github.com/devinfrench>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.zulrah.rotation;

import net.runelite.client.plugins.zulrah.phase.SafeLocation;
import net.runelite.client.plugins.zulrah.phase.ZulrahLocation;
import net.runelite.client.plugins.zulrah.phase.ZulrahPhase;
import net.runelite.client.plugins.zulrah.phase.ZulrahType;

import java.util.ArrayList;
import java.util.List;

public class ZulrahRotation
{
	private List<ZulrahPhase> rotation = new ArrayList<>();

	public void add(ZulrahLocation zulrahLocation, ZulrahType type, boolean jad, SafeLocation safeLocation)
	{
		rotation.add(new ZulrahPhase(zulrahLocation, type, jad, safeLocation));
	}

	public void add(ZulrahLocation zulrahLocation, ZulrahType type, SafeLocation safeLocation)
	{
		add(zulrahLocation, type, false, safeLocation);
	}

	public ZulrahPhase getPhase(int stage)
	{
		if (stage >= rotation.size())
		{
			return null;
		}
		return rotation.get(stage);
	}

	public boolean stageEquals(int stage, ZulrahPhase phase)
	{

		return phase != null && phase.equals(getPhase(stage));
	}

	public boolean canReset(int stage)
	{
		return stage >= rotation.size();
	}
}
