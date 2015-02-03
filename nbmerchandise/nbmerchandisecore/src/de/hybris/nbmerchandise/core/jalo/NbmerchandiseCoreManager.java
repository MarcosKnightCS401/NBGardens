/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package de.hybris.nbmerchandise.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.nbmerchandise.core.constants.NbmerchandiseCoreConstants;
import de.hybris.nbmerchandise.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
@SuppressWarnings("PMD")
public class NbmerchandiseCoreManager extends GeneratedNbmerchandiseCoreManager
{
	public static final NbmerchandiseCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (NbmerchandiseCoreManager) em.getExtension(NbmerchandiseCoreConstants.EXTENSIONNAME);
	}
}
