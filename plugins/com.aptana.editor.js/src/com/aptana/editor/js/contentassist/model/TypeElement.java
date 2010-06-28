package com.aptana.editor.js.contentassist.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TypeElement extends BaseElement
{
	private List<String> _parentTypes = new LinkedList<String>();
	private List<PropertyElement> _properties = new LinkedList<PropertyElement>();

	/**
	 * TypeElement
	 */
	public TypeElement()
	{
	}

	/**
	 * addParentType
	 * 
	 * @param type
	 */
	public void addParentType(String type)
	{
		this._parentTypes.add(type);
	}

	/**
	 * addProperty
	 * 
	 * @param property
	 */
	public void addProperty(PropertyElement property)
	{
		this._properties.add(property);
		
		property.setOwningType(this);
	}

	/**
	 * getProperties
	 * 
	 * @return
	 */
	public PropertyElement[] getProperties()
	{
		return this._properties.toArray(new PropertyElement[this._properties.size()]);
	}

	/**
	 * getParentTypes
	 * 
	 * @return
	 */
	public List<String> getParentTypes()
	{
		if (this._parentTypes == null)
		{
			this._parentTypes = Collections.emptyList();
		}
		
		return this._parentTypes;
	}
}
