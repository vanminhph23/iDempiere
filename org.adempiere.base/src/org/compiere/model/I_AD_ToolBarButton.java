/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_ToolBarButton
 *  @author Adempiere (generated) 
 *  @version 360LTS.015
 */
public interface I_AD_ToolBarButton 
{

    /** TableName=AD_ToolBarButton */
    public static final String Table_Name = "AD_ToolBarButton";

    /** AD_Table_ID=200003 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 4 - System 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /** Column name ActionClassName */
    public static final String COLUMNNAME_ActionClassName = "ActionClassName";

	/** Set Action Class Name.
	  * The class name that implements the interface for toolbar actions
	  */
	public void setActionClassName (String ActionClassName);

	/** Get Action Class Name.
	  * The class name that implements the interface for toolbar actions
	  */
	public String getActionClassName();

    /** Column name ActionName */
    public static final String COLUMNNAME_ActionName = "ActionName";

	/** Set Action Name.
	  * Action name on the toolbar
	  */
	public void setActionName (String ActionName);

	/** Get Action Name.
	  * Action name on the toolbar
	  */
	public String getActionName();

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AD_ToolBarButton_ID */
    public static final String COLUMNNAME_AD_ToolBarButton_ID = "AD_ToolBarButton_ID";

	/** Set ToolBar Button	  */
	public void setAD_ToolBarButton_ID (int AD_ToolBarButton_ID);

	/** Get ToolBar Button	  */
	public int getAD_ToolBarButton_ID();

    /** Column name Classname */
    public static final String COLUMNNAME_Classname = "Classname";

	/** Set Classname.
	  * Java Classname
	  */
	public void setClassname (String Classname);

	/** Get Classname.
	  * Java Classname
	  */
	public String getClassname();

    /** Column name ComponentName */
    public static final String COLUMNNAME_ComponentName = "ComponentName";

	/** Set Component Name	  */
	public void setComponentName (String ComponentName);

	/** Get Component Name	  */
	public String getComponentName();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsCustomization */
    public static final String COLUMNNAME_IsCustomization = "IsCustomization";

	/** Set Customization.
	  * The change is a customization of the data dictionary and can be applied after Migration
	  */
	public void setIsCustomization (boolean IsCustomization);

	/** Get Customization.
	  * The change is a customization of the data dictionary and can be applied after Migration
	  */
	public boolean isCustomization();

    /** Column name KeyStroke_KeyCode */
    public static final String COLUMNNAME_KeyStroke_KeyCode = "KeyStroke_KeyCode";

	/** Set KeyCode.
	  * KeyCode for shortcuts
	  */
	public void setKeyStroke_KeyCode (int KeyStroke_KeyCode);

	/** Get KeyCode.
	  * KeyCode for shortcuts
	  */
	public int getKeyStroke_KeyCode();

    /** Column name KeyStroke_Modifiers */
    public static final String COLUMNNAME_KeyStroke_Modifiers = "KeyStroke_Modifiers";

	/** Set Keystroke Modifiers.
	  * Keystroke Modifiers for shortcuts
	  */
	public void setKeyStroke_Modifiers (int KeyStroke_Modifiers);

	/** Get Keystroke Modifiers.
	  * Keystroke Modifiers for shortcuts
	  */
	public int getKeyStroke_Modifiers();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
