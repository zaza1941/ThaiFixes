package net.minecraft.src;

public class ThaiFixes {
	
	public static boolean isThaiChar(char par1)
	{
		if(par1 >= '¡' && par1 <= 'û')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isSpecialThaiChar1(char par1)
	{
		String SpecialArray = "ÑÔÕÖ×ØÙÚçèéêëìíî";
		if(SpecialArray.indexOf(par1) < 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static boolean isSpecialThaiChar2(char par1)
	{
		String SpecialArray = "Ó";
		if(SpecialArray.indexOf(par1) < 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static int uncToKeyTypeInt(char par1)
	{
		int a1 = (int)par1;
		return a1 - 3424;
	}
	
	public static char CharKeyTypeToUncChar(char par1)
	{
		int a1 = (int)par1;
		int aa1 = a1 + 3424;
		return (char)aa1;
	}
	
	public static char checkKeyToThaiChar(char par1)
	{
		if(isThaiChar(CharKeyTypeToUncChar(par1)))
    	{
    		return CharKeyTypeToUncChar(par1);
    	}
		return par1;
	}
}
