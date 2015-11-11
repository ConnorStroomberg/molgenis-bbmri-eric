package org.molgenis.bbmri.eric.model;

import org.molgenis.data.Package;
import org.molgenis.data.meta.PackageImpl;

public class BbmriEricPackage
{

	private static Package BBMRI_ERIC_PACKAGE;
	public static final String NAME = "eu_bbmri_eric";
	public static final String DESCRIPTION = "BBMRI-ERIC directory";

	private BbmriEricPackage()
	{

	}

	public static Package getPackage()
	{
		if (BBMRI_ERIC_PACKAGE == null)
		{
			BBMRI_ERIC_PACKAGE = new PackageImpl(NAME, DESCRIPTION);
		}
		return BBMRI_ERIC_PACKAGE;
	}
}
