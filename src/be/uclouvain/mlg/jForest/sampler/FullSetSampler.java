/*
jForest
Copyright © 2010-2015, Université catholique de Louvain, Belgium - UCL
All rights reserved.

This file is part of the jForest library.

jForest has been developed by Jérôme Paul
(Machine Learning Group (MLG) - Institute of Information and Communication
Technologies, Electronics and Applied Mathematics (ICTEAM)) for the
Université catholique de Louvain (UCL). jForest is a general framework for
Machine Learning. It implements tree ensemble based classification methods.
It is designed to be very modular and allows easy tuning and modification of
the tree induction, classification criterion and feature importance index.

jForest is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
any later version.

jForest is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with jForest.  If not, see <http://www.gnu.org/licenses/>.
*/

package be.uclouvain.mlg.jForest.sampler;

/**
 * Trivial sampler that always returns a copy of the full set of indices.
 */
public class FullSetSampler extends RandomSampler {

	public FullSetSampler() {
		super(false, null);
	}

	@Override
	protected int[][] getSampleWithReplacement(int[] indices) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	protected int[][] getSampleWithoutReplacement(int[] indices) {
		int[][] res = new int[2][];
		res[0] = indices.clone();
		res[1] = new int[0];
		return res;
	}

}
