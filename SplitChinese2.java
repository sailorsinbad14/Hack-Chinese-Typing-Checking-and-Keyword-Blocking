package testTextField;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Character.UnicodeBlock;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SplitChinese2 {
	String s;
	
		

		public String SplitChinese2(String input) {
		Set<UnicodeBlock> chineseUnicodeBlocks = new HashSet<UnicodeBlock>() {{
		    add(UnicodeBlock.CJK_COMPATIBILITY);
		    add(UnicodeBlock.CJK_COMPATIBILITY_FORMS);
		    add(UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS);
		    add(UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT);
		    add(UnicodeBlock.CJK_RADICALS_SUPPLEMENT);
		    add(UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION);
		    add(UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS);
		    add(UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A);
		    add(UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B);
		    add(UnicodeBlock.KANGXI_RADICALS);
		    add(UnicodeBlock.IDEOGRAPHIC_DESCRIPTION_CHARACTERS);
		}};
		
		
		s = input;			
				String c3 = "";
				String word = "" ;
				Random ran = new Random();
				String []array = {"_", "$", "!", "*", "#", "&"};
				
				for (char c : s.toCharArray()) {
				    if (chineseUnicodeBlocks.contains(UnicodeBlock.of(c))) {
				       // System.out.println(c + " is chinese");
				        //add ++;
				        //int add= ran.nextInt(2)+1;
				        //convert = String.valueOf(add);
				        //c3 = c + convert;
				    	int i = ran.nextInt(5)+1;
				    	
				    	c3 = c + array[i];
				    	word = word + c3;
				    	continue;
				    } 
//				    else {
				       
				    	//System.out.println(c + " is not chinese");
//				    }
				  
				    word = word + c;

				}
		//Random ran = new Random();
		
		//int add= ran.nextInt(50)+1;
		//String convert="";	
		
		
		return word;
		
	
	}

}

