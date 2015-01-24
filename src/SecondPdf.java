import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.border.Border;

import com.ibm.icu.impl.ReplaceableUCharacterIterator;
import com.ibm.icu.text.Replaceable;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.spatial.units.Square;


public class SecondPdf {

	

	public static void main(String[] args) throws DocumentException, IOException {

		Document document = new Document();
		PdfWriter.getInstance(document,new FileOutputStream("DeckOFCards2.pdf"));
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
	//	System.out.println(input);
		char[] ArrayOfChar = input.toCharArray();
		System.out.printf(Arrays.toString(ArrayOfChar));
		
		
		
		
		BaseFont OsnovenShrift = BaseFont.createFont("Arial Regular.ttf",BaseFont.IDENTITY_H,true);
		Font fontBlack = new Font(OsnovenShrift,25f,0,BaseColor.BLACK);
		 Font blackFont = new Font(OsnovenShrift, 25f, 0, BaseColor.BLACK);
		 Font RedFont =new Font(OsnovenShrift,25f,0, BaseColor.RED);
		 
		document.open();
		
		
		 document.add(new Paragraph("Hello World!"));

        
		
		document.close();
		
		
		
		
	}

}
