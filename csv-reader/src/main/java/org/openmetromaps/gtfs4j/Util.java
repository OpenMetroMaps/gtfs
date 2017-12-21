// Copyright 2017 Sebastian Kuerten
//
// This file is part of gtfs4j.
//
// gtfs4j is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// gtfs4j is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with gtfs4j. If not, see <http://www.gnu.org/licenses/>.

package org.openmetromaps.gtfs4j;

import java.io.Reader;

import au.com.bytecode.opencsv.CSVReader;

public class Util
{

	public static int getIndex(String[] array, String name)
	{
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}

	public static CSVReader defaultCsvReader(Reader reader)
	{
		return new CSVReader(reader, ',', '"');
	}

}
