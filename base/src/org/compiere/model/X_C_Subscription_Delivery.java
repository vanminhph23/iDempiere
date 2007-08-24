/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.util.*;
import java.sql.*;
import java.math.*;
import java.lang.reflect.Constructor;
import java.util.logging.Level;
import org.compiere.util.*;

/** Generated Model for C_Subscription_Delivery
 *  @author Adempiere (generated) 
 *  @version Release 3.3.0 - $Id$ */
public class X_C_Subscription_Delivery extends PO implements I_C_Subscription_Delivery, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_C_Subscription_Delivery (Properties ctx, int C_Subscription_Delivery_ID, String trxName)
    {
      super (ctx, C_Subscription_Delivery_ID, trxName);
      /** if (C_Subscription_Delivery_ID == 0)        {			setC_Subscription_Delivery_ID (0);
			setC_Subscription_ID (0);
} */
    }

    /** Load Constructor */
    public X_C_Subscription_Delivery (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_C_Subscription_Delivery[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Subscription Delivery.
		@param C_Subscription_Delivery_ID 
		Optional Delivery Record for a Subscription
	  */
	public void setC_Subscription_Delivery_ID (int C_Subscription_Delivery_ID)
	{
		if (C_Subscription_Delivery_ID < 1)
			 throw new IllegalArgumentException ("C_Subscription_Delivery_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_C_Subscription_Delivery_ID, Integer.valueOf(C_Subscription_Delivery_ID));
	}

	/** Get Subscription Delivery.
		@return Optional Delivery Record for a Subscription
	  */
	public int getC_Subscription_Delivery_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Subscription_Delivery_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getC_Subscription_Delivery_ID()));
    }

	public I_C_Subscription getI_C_Subscription() throws Exception 
    {
        Class<?> clazz = MTable.getClass(I_C_Subscription.Table_Name);
        I_C_Subscription result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_Subscription)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_Subscription_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw e;
        }
        return result;
    }

	/** Set Subscription.
		@param C_Subscription_ID 
		Subscription of a Business Partner of a Product to renew
	  */
	public void setC_Subscription_ID (int C_Subscription_ID)
	{
		if (C_Subscription_ID < 1)
			 throw new IllegalArgumentException ("C_Subscription_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_C_Subscription_ID, Integer.valueOf(C_Subscription_ID));
	}

	/** Get Subscription.
		@return Subscription of a Business Partner of a Product to renew
	  */
	public int getC_Subscription_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Subscription_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}